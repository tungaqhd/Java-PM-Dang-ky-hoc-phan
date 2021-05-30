/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dang_nhap;

import chinh.Database;
import chinh.GiangVien;
import chinh.QTV;
import chinh.SinhVien;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DangNhapDB extends Database {

    public GiangVien dangNhapGV(String email, String password) {
        GiangVien gv = null;
        String getSQL = "SELECT * FROM giangvien WHERE email = ? AND mat_khau = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, email);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                gv = new GiangVien(rs.getInt("ma_gv"), rs.getString("ho_ten"), rs.getString("mat_khau"), rs.getString("email"), rs.getString("sdt"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return gv;
    }

    public SinhVien dangNhapSV(String msv, String password) {
        SinhVien sv = null;
        String getSQL = "SELECT * FROM sinhvien WHERE ma_sv = ? AND mat_khau = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, msv);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                sv = new SinhVien(rs.getString("ma_sv"), rs.getInt("tai_khoan"), rs.getInt("ma_nganh"), rs.getString("ho_ten"), rs.getString("mat_khau"), rs.getString("email"), rs.getString("sdt"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }

        return sv;
    }

    public QTV dangNhapQTV(String email, String password) {
        QTV qtv = null;
        String getSQL = "SELECT * FROM qtv WHERE email = ? AND mat_khau = ?";
        try {
            openConnection();
            PreparedStatement preStmt = cnn.prepareStatement(getSQL);
            preStmt.setString(1, email);
            preStmt.setString(2, password);
            rs = preStmt.executeQuery();
            if (rs.next()) {
                qtv = new QTV(rs.getInt("ma_qtv"), rs.getString("ho_ten"), rs.getString("mat_khau"), rs.getString("email"), rs.getString("sdt"));
            }
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Lỗi", JOptionPane.CANCEL_OPTION);
        }
        return qtv;
    }
}
