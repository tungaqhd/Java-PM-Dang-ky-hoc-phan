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
public class Nguoi {
    String ho_ten;
    String mat_khau;
    String email;
    String sdt;

    public Nguoi(String ho_ten, String mat_khau, String email, String sdt) {
        this.ho_ten = ho_ten;
        this.mat_khau = mat_khau;
        this.email = email;
        this.sdt = sdt;
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
