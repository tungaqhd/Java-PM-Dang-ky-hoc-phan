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

    public Lop(String ma_lop, String ten_lop, int cdio, int si_so, String ma_hp) {
        this.ma_lop = ma_lop;
        this.ten_lop = ten_lop;
        this.cdio = cdio;
        this.si_so = si_so;
        this.ma_hp = ma_hp;
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
}
