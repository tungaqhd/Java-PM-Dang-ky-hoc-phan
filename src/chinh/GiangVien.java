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
public class GiangVien extends Nguoi {
    int ma_gv;

    public GiangVien(int ma_gv, String ho_ten, String mat_khau, String email, String sdt) {
        super(ho_ten, mat_khau, email, sdt);
        this.ma_gv = ma_gv;
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
