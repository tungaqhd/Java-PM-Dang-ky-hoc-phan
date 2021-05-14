/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocphan;

import java.util.Objects;

/**
 *
 * @author tunga
 */
public class HocPhan {
    String ma_in, ma_hp, ten_hp;
    int tc_lt, tc_th, tc_khac;

    public HocPhan(String ma_hp) {
        this.ma_hp = ma_hp;
    }

    public HocPhan(String ma_in, String ma_hp, String ten_hp, int tc_lt, int tc_th, int tc_khac) {
        this.ma_in = ma_in;
        this.ma_hp = ma_hp;
        this.ten_hp = ten_hp;
        this.tc_lt = tc_lt;
        this.tc_th = tc_th;
        this.tc_khac = tc_khac;
    }

    public String getMa_in() {
        return ma_in;
    }

    public void setMa_in(String ma_in) {
        this.ma_in = ma_in;
    }

    public String getMa_hp() {
        return ma_hp;
    }

    public void setMa_hp(String ma_hp) {
        this.ma_hp = ma_hp;
    }

    public String getTen_hp() {
        return ten_hp;
    }

    public void setTen_hp(String ten_hp) {
        this.ten_hp = ten_hp;
    }

    public int getTc_lt() {
        return tc_lt;
    }

    public void setTc_lt(int tc_lt) {
        this.tc_lt = tc_lt;
    }

    public int getTc_th() {
        return tc_th;
    }

    public void setTc_th(int tc_th) {
        this.tc_th = tc_th;
    }

    public int getTc_khac() {
        return tc_khac;
    }

    public void setTc_khac(int tc_khac) {
        this.tc_khac = tc_khac;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ma_hp);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocPhan other = (HocPhan) obj;
        
        return this.ma_hp.equals(other.ma_hp);
    }
    
    
}
