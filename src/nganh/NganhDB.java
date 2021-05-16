/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganh;

import chinh.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import phong.Phong;

/**
 *
 * @author tunga
 */
public class NganhDB extends Database {

    public ArrayList<Nganh> getNganhChuaMo(String maLop) {
        ArrayList<Nganh> dsNganh = new ArrayList<Nganh>();
        String getAllSQL = "SELECT * FROM nganh WHERE ma_nganh NOT IN (SELECT ma_nganh FROM mo_lop WHERE ma_lop = ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                dsNganh.add(new Nganh(rs.getInt("ma_nganh"), rs.getString("ten_nganh"), rs.getInt("ma_khoa")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNganh;
    }

    public ArrayList<Nganh> getNganhDaMo(String maLop) {
        ArrayList<Nganh> dsNganh = new ArrayList<Nganh>();
        String getAllSQL = "SELECT * FROM nganh WHERE ma_nganh IN (SELECT ma_nganh FROM mo_lop WHERE ma_lop = ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                dsNganh.add(new Nganh(rs.getInt("ma_nganh"), rs.getString("ten_nganh"), rs.getInt("ma_khoa")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsNganh;
    }
    
    public int moNganh(int maNganh, String maLop) {        
        int affectedRow = 0;
        String insertSQL = "INSERT INTO mo_lop(ma_lop, ma_nganh)VALUES(?, ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, maLop);
            preStmt.setInt(2, maNganh);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thêm ngành thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
    
    public int xoaMoNganh(int maNganh, String maLop) {        
        int affectedRow = 0;
        String insertSQL = "DELETE FROM mo_lop WHERE ma_lop = ? AND ma_nganh = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, maLop);
            preStmt.setInt(2, maNganh);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Xóa ngành thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
}
