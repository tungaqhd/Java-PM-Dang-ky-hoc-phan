/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gv_xem_lop_day;

import chinh.SinhVien;
import lop.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vinhd
 */
public class ChiTietLopTable extends AbstractTableModel {
    
    private String name[]={"Mã sinh viên", "Họ tên","Email","Số điện thoại"};
    private Class classes[]={String.class, String.class, String.class, String.class};
    
    ArrayList<SinhVien> ds = new ArrayList<SinhVien>();

    public ChiTietLopTable(ArrayList<SinhVien> ds)
   {
       this.ds=ds;
   }
    //lấy số phần tử của listThiSinh
    @Override
    public int getRowCount()
    {
        return ds.size();
    }
    //Lấy số lượng tiêu để của mảng.
    @Override
    public int getColumnCount()
    {
        return name.length;
    }
    //Đưa thông tin của phần tử trong arrayList lên jTable
    public Object getValueAt(int rowIndex,int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return ds.get(rowIndex).getMa_sv();
            case 1: return ds.get(rowIndex).getHo_ten();
            case 2: return ds.get(rowIndex).getEmail();
            case 3: return ds.get(rowIndex).getSdt();
            default :return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }
}
