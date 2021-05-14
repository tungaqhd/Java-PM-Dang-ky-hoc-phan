/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dangnhap_gv;

/**
 *
 * @author user
 */
public class GV {
    String ho_ten, email, mat_khau, sdt;
    int ma_gv;

    public GV(String ho_ten, String email, String mat_khau, String sdt, int ma_gv) {
        this.ho_ten = ho_ten;
        this.email = email;
        this.mat_khau = mat_khau;
        this.sdt = sdt;
        this.ma_gv = ma_gv;
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

    public int getMa_gv() {
        return ma_gv;
    }

    public void setMa_gv(int ma_gv) {
        this.ma_gv = ma_gv;
    }
    
}
