/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lich_giang_day;

import tkb_sv.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author tunga
 */
public class AlgoDay {

    /**
     * @param args the command line arguments
     */
    static LichDB db = new LichDB();

    public ArrayList<ChiTietDay> getList(ArrayList<ChiTietDay> ds) {
        ds.sort(new Comparator<ChiTietDay>() {
            @Override
            public int compare(ChiTietDay o1, ChiTietDay o2) {
                return Integer.compare(o1.getTiet_bat_dau(), o2.getTiet_bat_dau());
            }
        });
        
        ArrayList<ChiTietDay> rs = new ArrayList<ChiTietDay>();

        for (int i = 0; i < ds.size(); ++i) {
            ChiTietDay curr = ds.get(i);
            if (i == 0) {
                if (curr.getTiet_bat_dau() != 1) {
                    ChiTietDay ct = new ChiTietDay(curr.getThu(), 1, curr.getTiet_bat_dau()- 1);
                    rs.add(ct);
                }
            } else if (curr.getTiet_bat_dau() != ds.get(i - 1).getTiet_ket_thuc()+1) {
                ChiTietDay ct = new ChiTietDay(curr.getThu(), ds.get(i - 1).getTiet_ket_thuc() + 1, curr.getTiet_bat_dau()-1);
                rs.add(ct);
            }
            rs.add(curr);
            if(i == ds.size()-1 && curr.getTiet_ket_thuc() != 16)
            {
                ChiTietDay ct = new ChiTietDay(curr.getThu(), curr.getTiet_ket_thuc()+1, 16);
                rs.add(ct);
            }
        }
        
        return rs;
    }

}
