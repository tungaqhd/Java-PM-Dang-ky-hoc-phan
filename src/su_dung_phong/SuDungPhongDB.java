/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su_dung_phong;

import chinh.Database;
import dangnhap_gv.GV;
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
public class SuDungPhongDB extends Database {

    public boolean checkSDPhong(String thu, int maPhong, int tietBD, int tietKT) {
        int cnt = 0;
        String getAllSQL = "SELECT COUNT(*) as cnt FROM su_dung_phong WHERE thu = ? AND ma_phong = ? AND ((tiet_bat_dau <= ? AND tiet_ket_thuc > ?) OR (tiet_bat_dau <= ? AND tiet_ket_thuc > ?))";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, thu);
            preStmt.setInt(2, maPhong);
            preStmt.setInt(3, tietBD);
            preStmt.setInt(4, tietBD);
            preStmt.setInt(5, tietKT);
            preStmt.setInt(6, tietKT);
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

    public int addSDPhong(String maLop, String thu, int maPhong, int tietBD, int tietKT) {
        int affectedRow = 0;
        String insertSQL = "INSERT INTO su_dung_phong(ma_lop, ma_phong, thu, tiet_bat_dau, tiet_ket_thuc)VALUES(?, ?, ?, ?, ?)";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(insertSQL);
            preStmt.setString(1, maLop);
            preStmt.setInt(2, maPhong);
            preStmt.setString(3, thu);
            preStmt.setInt(4, tietBD);
            preStmt.setInt(5, tietKT);
            affectedRow = preStmt.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thêm thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return affectedRow;
    }
    
    public SuDungPhong getSdPhong(String maLop) {
        String getAllSQL = "SELECT * FROM su_dung_phong WHERE ma_lop = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            if(rs.next()) {
                return new SuDungPhong(rs.getString("ma_lop"), rs.getInt("ma_phong"), rs.getString("thu"), rs.getInt("tiet_bat_dau"), rs.getInt("tiet_ket_thuc"));
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
