/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phong;

/**
 *
 * @author tunga
 */
public class Phong {
    int ma_phong;
    String ten_phong;
    String toa_nha;
    int co_so;

    public Phong(int ma_phong, String ten_phong, String toa_nha, int co_so) {
        this.ma_phong = ma_phong;
        this.ten_phong = ten_phong;
        this.toa_nha = toa_nha;
        this.co_so = co_so;
    }
    
    public String getThongTin() {
        return ma_phong + " - " + ten_phong + " - " + toa_nha + " - cơ sở " + co_so;
    }

    public int getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(int ma_phong) {
        this.ma_phong = ma_phong;
    }

    public String getTen_phong() {
        return ten_phong;
    }

    public void setTen_phong(String ten_phong) {
        this.ten_phong = ten_phong;
    }

    public String getToa_nha() {
        return toa_nha;
    }

    public void setToa_nha(String toa_nha) {
        this.toa_nha = toa_nha;
    }

    public int getCo_so() {
        return co_so;
    }

    public void setCo_so(int co_so) {
        this.co_so = co_so;
    }
}
