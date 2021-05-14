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

    public ArrayList<Lop> getLop() {
        ArrayList<Lop> dsLop = new ArrayList<Lop>();
        String getAllSQL = "SELECT * FROM lop";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                dsLop.add(new Lop(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getInt("cdio"), rs.getInt("si_so"), rs.getString("ma_hp")));
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

}
