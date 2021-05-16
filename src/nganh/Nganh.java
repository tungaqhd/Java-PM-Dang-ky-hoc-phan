/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nganh;

/**
 *
 * @author tunga
 */
public class Nganh {
    int ma_nganh;
    String ten_nganh;
    int ma_khoa;

    public Nganh(int ma_nganh, String ten_nganh, int ma_khoa) {
        this.ma_nganh = ma_nganh;
        this.ten_nganh = ten_nganh;
        this.ma_khoa = ma_khoa;
    }

    public int getMa_nganh() {
        return ma_nganh;
    }

    public void setMa_nganh(int ma_nganh) {
        this.ma_nganh = ma_nganh;
    }

    public String getTen_nganh() {
        return ten_nganh;
    }

    public void setTen_nganh(String ten_nganh) {
        this.ten_nganh = ten_nganh;
    }

    public int getMa_khoa() {
        return ma_khoa;
    }

    public void setMa_khoa(int ma_khoa) {
        this.ma_khoa = ma_khoa;
    }
        
}
