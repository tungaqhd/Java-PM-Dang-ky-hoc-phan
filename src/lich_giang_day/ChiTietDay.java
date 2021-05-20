/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lich_giang_day;

import tkb_sv.*;

/**
 *
 * @author tunga
 */
public class ChiTietDay {
    String ma_lop;
    String ten_lop;
    String ten_hp;
    String thu;
    int tiet_bat_dau;
    int tiet_ket_thuc;
    int ma_phong;
    String ten_phong;
    String toa_nha;
    int co_so;
    String ho_ten;
    String sdt;
    int loai; // 0: trống, 1 học

    public ChiTietDay(String thu, int tiet_bat_dau, int tiet_ket_thuc) {
        this.thu = thu;
        this.tiet_bat_dau = tiet_bat_dau;
        this.tiet_ket_thuc = tiet_ket_thuc;
        this.loai = 0;
    }
    
    

    public ChiTietDay(String ma_lop, String ten_lop, String ten_hp, String thu, int tiet_bat_dau, int tiet_ket_thuc, int ma_phong, String ten_phong, String toa_nha, int co_so, String ho_ten, String sdt) {
        this.ma_lop = ma_lop;
        this.ten_lop = ten_lop;
        this.ten_hp = ten_hp;
        this.thu = thu;
        this.tiet_bat_dau = tiet_bat_dau;
        this.tiet_ket_thuc = tiet_ket_thuc;
        this.ma_phong = ma_phong;
        this.ten_phong = ten_phong;
        this.toa_nha = toa_nha;
        this.co_so = co_so;
        this.ho_ten = ho_ten;
        this.sdt = sdt;
        this.loai = 1;
    }
    
    public String getText() {
        if(loai == 0) {
            return "";
        }
        String tiets = "(";
        for(int i=tiet_bat_dau;i<=tiet_ket_thuc;++i) {
            tiets += i;
            if(i != tiet_ket_thuc) {
                tiets += ", ";
            }
            else {
                tiets += ")";
            }
        }
        String phong = ten_phong + " - " + toa_nha + " - Cơ sở " + co_so;
        String gv = ho_ten + " - " + sdt;
        String rs = "<html><body style='text-align: center;'>"+ten_hp+"<br />"+tiets+" - "+phong+"<br />"+gv+"</body></html>";
        return rs;
    }

    public String getMa_lop() {
        return ma_lop;
    }

    public void setMa_lop(String ma_lop) {
        this.ma_lop = ma_lop;
    }

    public String getTen_lop() {
        return ten_lop;
    }

    public void setTen_lop(String ten_lop) {
        this.ten_lop = ten_lop;
    }

    public String getTen_hp() {
        return ten_hp;
    }

    public void setTen_hp(String ten_hp) {
        this.ten_hp = ten_hp;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public int getTiet_bat_dau() {
        return tiet_bat_dau;
    }

    public void setTiet_bat_dau(int tiet_bat_dau) {
        this.tiet_bat_dau = tiet_bat_dau;
    }

    public int getTiet_ket_thuc() {
        return tiet_ket_thuc;
    }

    public void setTiet_ket_thuc(int tiet_ket_thuc) {
        this.tiet_ket_thuc = tiet_ket_thuc;
    }

    public int getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(int ma_phong) {
        this.ma_phong = ma_phong;
    }

    public String getTen_phong() {
        return ten_phong;
    }

    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }

    public String getToa_nha() {
        return toa_nha;
    }

    public void setToa_nha(String toa_nha) {
        this.toa_nha = toa_nha;
    }

    public int getCo_so() {
        return co_so;
    }

    public void setCo_so(int co_so) {
        this.co_so = co_so;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }
    
    
}
