/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gv_xem_ds_lop;

import chinh.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lop.Lop;
import lop.LopDB;
import su_dung_phong.SuDungPhong;
import su_dung_phong.SuDungPhongDB;

/**
 *
 * @author tunga
 */
public class GiangVienLopDB extends Database {

    public boolean checkLopChuaAiDay(String maLop) {
        int cnt = 0;
        String getAllSQL = "SELECT COUNT(*) AS cnt FROM dang_ky_day WHERE ma_lop = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setString(1, maLop);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                cnt = rs.getInt("cnt");
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cnt == 0;
    }

    public boolean checkLichDay(String maLop, int maGv) {
        SuDungPhongDB suDungPhongDB = new SuDungPhongDB();
        SuDungPhong sdp = suDungPhongDB.getSdPhong(maLop);
        int cnt = 0;
        String getAllSQL = "SELECT COUNT(*) as cnt FROM lop WHERE ma_gv = ? AND ma_lop IN"
                + " (SELECT ma_lop FROM su_dung_phong WHERE thu = ? AND"
                + " ((tiet_bat_dau <= ? AND tiet_ket_thuc >= ?) OR (tiet_bat_dau <= ? AND tiet_ket_thuc >= ?)))";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setInt(1, maGv);
            preStmt.setString(2, sdp.getThu());
            preStmt.setInt(3, sdp.getTiet_bat_dau());
            preStmt.setInt(4, sdp.getTiet_bat_dau());
            preStmt.setInt(5, sdp.getTiet_ket_thuc());
            preStmt.setInt(6, sdp.getTiet_ket_thuc());
            rs = preStmt.executeQuery();
            if (rs.next()) {
                cnt = rs.getInt("cnt");
                System.out.println(sdp.getThu());
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnt == 0;
    }
}
