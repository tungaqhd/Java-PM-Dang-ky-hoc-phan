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
public class QTV extends Nguoi{
    int ma_qtv;

    public QTV(int ma_qtv, String ho_ten, String mat_khau, String email, String sdt) {
        super(ho_ten, mat_khau, email, sdt);
        this.ma_qtv = ma_qtv;
    }

    public int getMa_qtv() {
        return ma_qtv;
    }

    public void setMa_qtv(int ma_qtv) {
        this.ma_qtv = ma_qtv;
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
