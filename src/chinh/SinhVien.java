/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinh;

/**
 *
 * @author tunga
 */
public class SinhVien extends Nguoi{
    String ma_sv;
    int tai_khoan;
    int ma_nganh;

    public SinhVien(String ma_sv, int tai_khoan, int ma_nganh, String ho_ten, String mat_khau, String email, String sdt) {
        super(ho_ten, mat_khau, email, sdt);
        this.ma_sv = ma_sv;
        this.tai_khoan = tai_khoan;
        this.ma_nganh = ma_nganh;
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
    }

    public int getTai_khoan() {
        return tai_khoan;
    }

    public void setTai_khoan(int tai_khoan) {
        this.tai_khoan = tai_khoan;
    }

    public int getMa_nganh() {
        return ma_nganh;
    }

    public void setMa_nganh(int ma_nganh) {
        this.ma_nganh = ma_nganh;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
}
