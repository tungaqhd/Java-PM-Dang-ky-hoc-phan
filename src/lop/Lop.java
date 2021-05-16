/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

/**
 *
 * @author tunga
 */
public class Lop {
    String ma_lop;
    String ten_lop;
    int cdio;
    int si_so;
    String ma_hp;
    int ma_gv;
    String ho_ten;
    int tiet_bat_dau;
    int tiet_ket_thuc;
    String thu;
    String diaDiem;

    public Lop(String ma_lop, String ten_lop, int cdio, int si_so, String ma_hp, int ma_gv, String ho_ten, int tiet_bat_dau, int tiet_ket_thuc, String thu, String diaDiem) {
        this.ma_lop = ma_lop;
        this.ten_lop = ten_lop;
        this.cdio = cdio;
        this.si_so = si_so;
        this.ma_hp = ma_hp;
        this.ma_gv = ma_gv;
        this.ho_ten = ho_ten;
        this.tiet_bat_dau = tiet_bat_dau;
        this.tiet_ket_thuc = tiet_ket_thuc;
        this.thu = thu;
        this.diaDiem = diaDiem;
    }

    public Lop(String ma_lop, String ten_lop, int cdio, int si_so, String ma_hp, int ma_gv, String ho_ten) {
        this.ma_lop = ma_lop;
        this.ten_lop = ten_lop;
        this.cdio = cdio;
        this.si_so = si_so;
        this.ma_hp = ma_hp;
        this.ma_gv = ma_gv;
        this.ho_ten = ho_ten;
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

    public int getCdio() {
        return cdio;
    }

    public void setCdio(int cdio) {
        this.cdio = cdio;
    }

    public int getSi_so() {
        return si_so;
    }

    public void setSi_so(int si_so) {
        this.si_so = si_so;
    }

    public String getMa_hp() {
        return ma_hp;
    }

    public void setMa_hp(String ma_hp) {
        this.ma_hp = ma_hp;
    }

    public int getMa_gv() {
        return ma_gv;
    }

    public void setMa_gv(int ma_gv) {
        this.ma_gv = ma_gv;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
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

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
}
