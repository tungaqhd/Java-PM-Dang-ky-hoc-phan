/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocphan;

import chinh.Database;
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
public class HocPhanDB extends Database {

    public HocPhan getHocPhan(String maHP) {
        String getAllSQL = "SELECT * FROM hoc_phan WHERE ma_hp = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maHP);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                return new HocPhan(rs.getString("ma_in"), rs.getString("ma_hp"), rs.getString("ten_hp"), rs.getInt("tc_lt"), rs.getInt("tc_th"), rs.getInt("tc_khac"));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<HocPhan> getHocPhan() {
        ArrayList<HocPhan> dsHp = new ArrayList<HocPhan>();
        String getAllSQL = "SELECT * FROM hoc_phan";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                dsHp.add(new HocPhan(rs.getString("ma_in"), rs.getString("ma_hp"), rs.getString("ten_hp"), rs.getInt("tc_lt"), rs.getInt("tc_th"), rs.getInt("tc_khac")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsHp;
    }

    public int addHocPhan(String ma_in, String ma_hp, String ten_hp, int tc_lt, int tc_th, int tc_khac) {
        int affectedRow = 0;
        String insertSQL = "INSERT INTO hoc_phan(ma_in, ma_hp, ten_hp, tc_lt, tc_th, tc_khac)VALUES(?, ?, ?, ?, ?, ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, ma_in);
            preStmt.setString(2, ma_hp);
            preStmt.setString(3, ten_hp);
            preStmt.setInt(4, tc_lt);
            preStmt.setInt(5, tc_th);
            preStmt.setInt(6, tc_khac);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public int updateHocPhan(String ma_in, String ma_hp, String ten_hp, int tc_lt, int tc_th, int tc_khac) {
        int affectedRow = 0;
        String updateSQL = "UPDATE hoc_phan SET ma_in=?, ten_hp=?, tc_lt=?, tc_th=?, tc_khac=? WHERE ma_hp=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(updateSQL);
            preStmt.setString(1, ma_in);
            preStmt.setString(2, ten_hp);
            preStmt.setInt(3, tc_lt);
            preStmt.setInt(4, tc_th);
            preStmt.setInt(5, tc_khac);
            preStmt.setString(6, ma_hp);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }

    public int deleteHocPhan(String ma_hp) {
        int affectedRow = 0;
        String deleteSQL = "DELETE FROM hoc_phan WHERE ma_hp=?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(deleteSQL);
            preStmt.setString(1, ma_hp);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
}
