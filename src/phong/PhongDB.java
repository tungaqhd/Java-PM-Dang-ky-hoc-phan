/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phong;

import chinh.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lop.Lop;

/**
 *
 * @author tunga
 */
public class PhongDB extends Database{
    public ArrayList<Phong> getDSPhong() {
        ArrayList<Phong> dsPhong = new ArrayList<Phong>();
        String getAllSQL = "SELECT * FROM phong";
        try {
            openConnection();
            Statement stmt = cnn.createStatement();
            rs = stmt.executeQuery(getAllSQL);
            while (rs.next()) {
                dsPhong.add(new Phong(rs.getInt("ma_phong"), rs.getString("ten_phong"), rs.getString("toa_nha"), rs.getInt("co_so")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dsPhong;
    }
    
    public ArrayList<Phong> timPhong(String thu, int tietBD, int tietKT) {
        ArrayList<Phong> dsPhong = new ArrayList<Phong>();
        String getAllSQL = "SELECT * FROM phong WHERE ma_phong NOT IN (SELECT ma_phong from su_dung_phong WHERE thu = ? AND (tiet_bat_dau <= ? AND tiet_ket_thuc >= ?) OR (tiet_bat_dau <= ? AND tiet_ket_thuc >= ?))";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, thu);
            preStmt.setInt(2, tietBD);
            preStmt.setInt(3, tietBD);
            preStmt.setInt(4, tietKT);
            preStmt.setInt(5, tietKT);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                dsPhong.add(new Phong(rs.getInt("ma_phong"), rs.getString("ten_phong"), rs.getString("toa_nha"), rs.getInt("co_so")));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPhong;
    }
    
    public Phong getPhongByMaLop(String maLop) {
        Phong p = null;
        String getSQL = "SELECT * FROM phong WHERE ma_phong IN (SELECT ma_phong FROM su_dung_phong WHERE ma_lop = ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            if(rs.next()) {
                p = new Phong(rs.getInt("ma_phong"), rs.getString("ten_phong"), rs.getString("toa_nha"), rs.getInt("co_so"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
}
