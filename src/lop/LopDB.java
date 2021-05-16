/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import chinh.Database;
import hocphan.HocPhan;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tunga
 */
public class LopDB extends Database {
    
    public Lop getLop(String maLop) {
        String getAllSQL = "SELECT * FROM lop LEFT JOIN giangvien ON giangvien.ma_gv = lop.ma_gv LEFT JOIN su_dung_phong ON lop.ma_lop = su_dung_phong.ma_lop WHERE lop.ma_lop = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            if(rs.next()) {
                System.out.println(rs.getInt("ma_gv"));;
                return new Lop(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getInt("cdio"), rs.getInt("si_so"), rs.getString("ma_hp"), rs.getInt("ma_gv"), rs.getString("ho_ten"));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<Lop> getLop() {
        ArrayList<Lop> dsLop = new ArrayList<Lop>();
        String getAllSQL = "SELECT * FROM lop LEFT JOIN giangvien ON giangvien.ma_gv = lop.ma_gv LEFT JOIN su_dung_phong ON lop.ma_lop = su_dung_phong.ma_lop JOIN phong on phong.ma_phong = su_dung_phong.ma_phong";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                String diaDiem = rs.getString("ten_phong") + " - " + rs.getString("toa_nha") + " - Cơ sở " + rs.getString("co_so");
                dsLop.add(new Lop(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getInt("cdio"), rs.getInt("si_so"), rs.getString("ma_hp"), rs.getInt("ma_gv"), rs.getString("ho_ten"), rs.getInt("tiet_bat_dau"), rs.getInt("tiet_ket_thuc"), rs.getString("thu"), diaDiem));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsLop;
    }

    public ArrayList<Lop> getLop(int maNganh) {
        ArrayList<Lop> dsLop = new ArrayList<Lop>();
        String getAllSQL = "SELECT * FROM lop LEFT JOIN giangvien ON giangvien.ma_gv = lop.ma_gv LEFT JOIN su_dung_phong ON lop.ma_lop = su_dung_phong.ma_lop JOIN phong on phong.ma_phong = su_dung_phong.ma_phong JOIN mo_lop on mo_lop.ma_lop = lop.ma_lop JOIN nganh ON nganh.ma_nganh = mo_lop.ma_nganh";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                String diaDiem = rs.getString("ten_phong") + " - " + rs.getString("toa_nha") + " - Cơ sở " + rs.getString("co_so");
                dsLop.add(new Lop(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getInt("cdio"), rs.getInt("si_so"), rs.getString("ma_hp"), rs.getInt("ma_gv"), rs.getString("ho_ten"), rs.getInt("tiet_bat_dau"), rs.getInt("tiet_ket_thuc"), rs.getString("thu"), diaDiem));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsLop;
    }

    public int addHocPhan(String ma_lop, String ten_lop, int cdio, int si_so, String ma_hp) {
        int affectedRow = 0;
        String insertSQL = "INSERT INTO lop(ma_lop, ten_lop, cdio, si_so, ma_hp)VALUES(?, ?, ?, ?, ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, ma_lop);
            preStmt.setString(2, ten_lop);
            preStmt.setInt(3, cdio);
            preStmt.setInt(4, si_so);
            preStmt.setString(5, ma_hp);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public int editHocPhan(String ma_lop, String ten_lop, int cdio, int si_so, String ma_hp) {
        int affectedRow = 0;
        String updateSQL = "UPDATE lop SET ten_lop=?, cdio=?, si_so=?, ma_hp=? WHERE ma_lop=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
            preStmt.setString(1, ten_lop);
            preStmt.setInt(2, cdio);
            preStmt.setInt(3, si_so);
            preStmt.setString(4, ma_hp);
            preStmt.setString(5, ma_lop);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public int deleteLop(String ma_lop) {
        int affectedRow = 0;
        String deleteSQL = "DELETE FROM lop WHERE ma_lop=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(deleteSQL);
            preStmt.setString(1, ma_lop);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public boolean checkMaLop(String maLop) {
        int cnt = 0;
        String getAllSQL = "SELECT COUNT(*) as cnt FROM lop WHERE ma_lop = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                cnt = rs.getInt("cnt");
            }
            System.out.println(cnt);
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnt == 0;
    }

    public int gvNhanLop(String maLop, int maGv) {
        int affectedRow = 0;
        String updateSQL = "UPDATE lop SET ma_gv=? WHERE ma_lop=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
            preStmt.setInt(1, maGv);
            preStmt.setString(2, maLop);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Nhận lớp thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public int gvHuyLop(String maLop) {
        int affectedRow = 0;
        String updateSQL = "UPDATE lop SET ma_gv= NULL WHERE ma_lop=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
            preStmt.setString(1, maLop);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Hủy lớp thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

}
