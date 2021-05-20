/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lich_giang_day;

import tkb_sv.*;
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
public class LichDB extends Database {

    public ArrayList<ChiTietDay> getTKB(int maGV, String thu) {
        ArrayList<ChiTietDay> tkb = new ArrayList<ChiTietDay>();
        String getAllSQL = "select lop.ten_lop, lop.ma_lop, hoc_phan.ten_hp, su_dung_phong.thu, su_dung_phong.tiet_bat_dau, su_dung_phong.tiet_ket_thuc, phong.*, giangvien.ho_ten, giangvien.sdt FROM lop"
                + " join hoc_phan on hoc_phan.ma_hp = lop.ma_hp"
                + " join su_dung_phong on su_dung_phong.ma_lop = lop.ma_lop"
                + " join phong on phong.ma_phong = su_dung_phong.ma_phong"
                + " join giangvien on lop.ma_gv= giangvien.ma_gv"
                + " where lop.ma_gv = ? and thu = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getAllSQL);
            preStmt.setInt(1, maGV);
            preStmt.setString(2, thu);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                ChiTietDay ct = new ChiTietDay(rs.getString("ma_lop"), rs.getString("ten_lop"), rs.getString("ten_hp"), rs.getString("thu"), rs.getInt("tiet_bat_dau"), rs.getInt("tiet_ket_thuc"), rs.getInt("ma_phong"), rs.getString("ten_phong"), rs.getString("toa_nha"), rs.getInt("co_so"), rs.getString("ho_ten"), rs.getString("sdt"));
                tkb.add(ct);
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tkb;
    }
}
