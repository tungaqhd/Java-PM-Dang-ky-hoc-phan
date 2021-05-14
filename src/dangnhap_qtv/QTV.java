/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap_qtv;

/**
 *
 * @author user
 */
public class QTV {
    String ho_ten, email, mat_khau, sdt;
    int ma_qtv;
    public QTV(String ho_ten, String email, String mat_khau, String sdt, int ma_qtv) {
        this.ho_ten = ho_ten;
        this.email = email;
        this.mat_khau = mat_khau;
        this.sdt = sdt;
        this.ma_qtv = ma_qtv;
    }
    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getMa_qtv() {
        return ma_qtv;
    }

    public void setMa_qtv(int ma_qtv) {
        this.ma_qtv = ma_qtv;
    }
}
