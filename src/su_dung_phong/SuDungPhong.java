/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package su_dung_phong;

/**
 *
 * @author tunga
 */
public class SuDungPhong {
    String ma_lop;
    int ma_phong;
    String thu;
    int tiet_bat_dau;
    int tiet_ket_thuc;

    public SuDungPhong(String ma_lop, int ma_phong, String thu, int tiet_bat_dau, int tiet_ket_thuc) {
        this.ma_lop = ma_lop;
        this.ma_phong = ma_phong;
        this.thu = thu;
        this.tiet_bat_dau = tiet_bat_dau;
        this.tiet_ket_thuc = tiet_ket_thuc;
    }

    public String getMa_lop() {
        return ma_lop;
    }

    public void setMa_lop(String ma_lop) {
        this.ma_lop = ma_lop;
    }

    public int getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(int ma_phong) {
        this.ma_phong = ma_phong;
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
        
}
