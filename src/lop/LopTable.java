/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author tunga
 */
public class LopTable extends AbstractTableModel {
    
    private String name[]={"Mã lớp", "Tên lớp","CDIO","Sĩ số", "Mã học phần"};
    private Class classes[]={String.class, String.class, Integer.class, Integer.class, String.class};
    
    ArrayList<Lop> ds = new ArrayList<Lop>();

    public LopTable(ArrayList<Lop> ds)
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
            case 0: return ds.get(rowIndex).getMa_lop();
            case 1: return ds.get(rowIndex).getTen_lop();
            case 2: return ds.get(rowIndex).getCdio();
            case 3: return ds.get(rowIndex).getSi_so();
            case 4: return ds.get(rowIndex).getMa_hp();
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
