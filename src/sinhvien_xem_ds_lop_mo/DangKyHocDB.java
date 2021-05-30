/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien_xem_ds_lop_mo;

import chinh.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinhd
 */
public class DangKyHocDB extends Database {

    public boolean daDangKy(String msv, String maLop) {
        String getAllSQL = "SELECT * FROM dang_ky_hoc WHERE ma_sv = ? AND ma_lop = ?";
        try {
            openConnection();
            PreparedStatement stmt = cnn.prepareStatement(getAllSQL);
            stmt.setString(1, msv);
            stmt.setString(2, maLop);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public ArrayList<LopSV> getLop(int maNganh) {
        ArrayList<LopSV> dsLop = new ArrayList<LopSV>();
        String getAllSQL = "SELECT * FROM lop"
                + " LEFT JOIN giangvien ON giangvien.ma_gv = lop.ma_gv"
                + " LEFT JOIN hoc_phan ON hoc_phan.ma_hp = lop.ma_hp"
                + " LEFT JOIN su_dung_phong ON lop.ma_lop = su_dung_phong.ma_lop"
                + " JOIN phong on phong.ma_phong = su_dung_phong.ma_phong"
                + " JOIN mo_lop on mo_lop.ma_lop = lop.ma_lop"
                + " JOIN nganh ON nganh.ma_nganh = mo_lop.ma_nganh"
                + " WHERE mo_lop.ma_nganh = ?";
        try {
            openConnection();
            PreparedStatement stmt = cnn.prepareStatement(getAllSQL);
            stmt.setInt(1, maNganh);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String diaDiem = rs.getString("ten_phong") + " - " + rs.getString("toa_nha") + " - Cơ sở " + rs.getString("co_so");
                dsLop.add(new LopSV(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getInt("cdio"), rs.getInt("si_so"), rs.getInt("so_luong"), rs.getString("ma_hp"), rs.getString("ten_hp"), rs.getInt("ma_gv"), rs.getString("ho_ten"), rs.getInt("tiet_bat_dau"), rs.getInt("tiet_ket_thuc"), rs.getString("thu"), diaDiem));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsLop;
    }

    public boolean checkTrungLich(String msv, int tietBD, int tietKT, String thu) {
        String getAllSQL = "SELECT * FROM lop"
                + " JOIN dang_ky_hoc ON lop.ma_lop = dang_ky_hoc.ma_lop"
                + " JOIN su_dung_phong ON su_dung_phong.ma_lop = lop.ma_lop"
                + " WHERE dang_ky_hoc.ma_sv = ?"
                + " AND ((tiet_bat_dau <= ? AND tiet_ket_thuc >= ?) OR (tiet_bat_dau <= ? AND tiet_ket_thuc >= ?))"
                + " AND thu = ?";
        try {
            openConnection();
            PreparedStatement stmt = cnn.prepareStatement(getAllSQL);
            stmt.setString(1, msv);
            stmt.setInt(2, tietBD);
            stmt.setInt(3, tietBD);
            stmt.setInt(4, tietKT);
            stmt.setInt(5, tietKT);
            stmt.setString(6, thu);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return false;
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public void dangKyHoc(String ma_lop, String msv) {
        String insertSQL = "INSERT INTO dang_ky_hoc(ma_lop, ma_sv) VALUES (?, ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, ma_lop);
            preStmt.setString(2, msv);
            preStmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void huyDangKy(String ma_lop, String msv) {
        String deleteSQL = "DELETE FROM dang_ky_hoc WHERE ma_lop = ? AND ma_sv = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(deleteSQL);
            preStmt.setString(1, ma_lop);
            preStmt.setString(2, msv);
            preStmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
