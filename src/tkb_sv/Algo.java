/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb_sv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author tunga
 */
public class Algo {

    /**
     * @param args the command line arguments
     */
    static TKBDB db = new TKBDB();

    public static void main(String[] args) {
        
        ArrayList<ChiTietDangKyHoc> ds = db.getTKB("100", "T2");
        ds.sort(new Comparator<ChiTietDangKyHoc>() {
            @Override
            public int compare(ChiTietDangKyHoc o1, ChiTietDangKyHoc o2) {
                return Integer.compare(o1.getTiet_bat_dau(), o2.getTiet_bat_dau());
            }
        });
        
        ArrayList<ChiTietDangKyHoc> rs = new ArrayList<ChiTietDangKyHoc>();

        for (int i = 0; i < ds.size(); ++i) {
            ChiTietDangKyHoc curr = ds.get(i);
            if (i == 0) {
                if (curr.getTiet_bat_dau() != 1) {
                    ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), 1, curr.getTiet_bat_dau()- 1);
                    rs.add(ct);
                }
            } else if (curr.getTiet_bat_dau() != ds.get(i - 1).getTiet_ket_thuc() + 1) {
                ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), ds.get(i - 1).getTiet_ket_thuc() + 1, curr.getTiet_bat_dau()-1);
                rs.add(ct);
            }
            rs.add(curr);
            if(i == ds.size()-1 && curr.getTiet_ket_thuc() != 16)
            {
                ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), curr.getTiet_ket_thuc()+1, 16);
                rs.add(ct);
            }
        }
//        ArrayList<Integer> dsTiet = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 7, 8, 9, 13, 15, 17));
//        ArrayList<Integer> dsTiet2 = new ArrayList<Integer>(Arrays.asList(3, 4, 5, 8, 9, 10, 11, 12, 16, 17));
//        ArrayList<Integer> dsTiet3 = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 11, 12, 15, 16, 17));
//        
//        dsTiet = dsTiet3;
//        ArrayList<Integer> rs = new ArrayList<Integer>();
//
//        int tmp = 0;
//        for (int i = 0; i < dsTiet.size(); ++i) {
//            if (i == 0) {
//                if (dsTiet.get(i) != 1) {
//                    rs.add(dsTiet.get(0) - 1);
//                }
//                    ++tmp;
//            } else if (i != dsTiet.size() - 1) {
//                if (dsTiet.get(i) != dsTiet.get(i - 1) + 1) {
//                    rs.add(tmp);
//                    rs.add(dsTiet.get(i) - dsTiet.get(i - 1) - 1);
//                    tmp = 1;
//                } else {
//                    ++tmp;
//                }
//            } else {
//                rs.add(tmp);
//                if(dsTiet.get(i-1) != 16) {
//                    rs.add(16 - dsTiet.get(i-1));
//                }
//            }
//            System.out.println(tmp);
//        }
//        
//        System.out.println(rs);
    }

    public ArrayList<ChiTietDangKyHoc> getList(ArrayList<ChiTietDangKyHoc> ds) {
        ds.sort(new Comparator<ChiTietDangKyHoc>() {
            @Override
            public int compare(ChiTietDangKyHoc o1, ChiTietDangKyHoc o2) {
                return Integer.compare(o1.getTiet_bat_dau(), o2.getTiet_bat_dau());
            }
        });
        
        ArrayList<ChiTietDangKyHoc> rs = new ArrayList<ChiTietDangKyHoc>();

        for (int i = 0; i < ds.size(); ++i) {
            ChiTietDangKyHoc curr = ds.get(i);
            if (i == 0) {
                if (curr.getTiet_bat_dau() != 1) {
                    ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), 1, curr.getTiet_bat_dau()- 1);
                    rs.add(ct);
                }
            } else if (curr.getTiet_bat_dau() != ds.get(i - 1).getTiet_ket_thuc()+1) {
                ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), ds.get(i - 1).getTiet_ket_thuc() + 1, curr.getTiet_bat_dau()-1);
                rs.add(ct);
            }
            rs.add(curr);
            if(i == ds.size()-1 && curr.getTiet_ket_thuc() != 16)
            {
                ChiTietDangKyHoc ct = new ChiTietDangKyHoc(curr.getThu(), curr.getTiet_ket_thuc()+1, 16);
                rs.add(ct);
            }
        }
        
        return rs;
    }

}
