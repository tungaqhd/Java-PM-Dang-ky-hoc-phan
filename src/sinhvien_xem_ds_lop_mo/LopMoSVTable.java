/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien_xem_ds_lop_mo;

import lop.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class LopMoSVTable extends AbstractTableModel {

    private String name[] = {"Mã lớp", "Tên lớp", "CDIO", "Sĩ số", "Mã học phần", "Tên giảng viên", "Tiết bắt đầu", "Tiết kết thúc", "Thứ", "Địa điểm", "Trạng thái"};
    private Class classes[] = {String.class, String.class, Integer.class, Integer.class, String.class, String.class, Integer.class, Integer.class, String.class, String.class, String.class};

    ArrayList<LopSV> ds = new ArrayList<LopSV>();

    public LopMoSVTable(ArrayList<LopSV> ds) {
        this.ds = ds;
    }

    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount() {
        return ds.size();
    }

    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount() {
        return name.length;
    }

    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ds.get(rowIndex).getMa_lop();
            case 1:
                return ds.get(rowIndex).getTen_lop();
            case 2:
                return ds.get(rowIndex).getCdio();
            case 3:
                return ds.get(rowIndex).getSo_luong() + "/" + ds.get(rowIndex).getSi_so();
            case 4:
                return ds.get(rowIndex).getMa_hp();
            case 5:
                return ds.get(rowIndex).getHo_ten();
            case 6:
                return ds.get(rowIndex).getTiet_bat_dau();
            case 7:
                return ds.get(rowIndex).getTiet_ket_thuc();
            case 8:
                return ds.get(rowIndex).getThu();
            case 9:
                return ds.get(rowIndex).getDiaDiem();
            case 10:
                return ds.get(rowIndex).getTrangThai();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
