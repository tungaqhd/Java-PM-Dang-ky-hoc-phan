/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gv_xem_lop_day;

import chinh.SinhVien;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import lop.LopDB;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author tunga
 */
public class ChiTietLop extends javax.swing.JDialog {

    /**
     * Creates new form ChiTietLop
     */
    LopDB lopDB = new LopDB();
    ArrayList<SinhVien> ds;
    String maLop;

    public ChiTietLop(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
        setIconImage(image);
    }

    public void getSinhVien(String ml) {
        maLop = ml;
        ds = lopDB.getSV(ml);
        sinhVienTable.setModel(new ChiTietLopTable(ds));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sinhVienTable = new javax.swing.JTable();
        btnXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Danh sách sinh viên trong lớp");

        sinhVienTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(sinhVienTable);

        btnXuat.setText("Xuất ra file Excel");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1138, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXuat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXuat)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        // TODO add your handling code here:        
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(maLop);

        Row rowHead = sheet.createRow(0);
        Cell cellMSVHead = rowHead.createCell(0);
        cellMSVHead.setCellValue("Mã sinh viên");
        Cell cellHoTenHead = rowHead.createCell(1);
        cellHoTenHead.setCellValue("Họ và tên");
        Cell cellEmailHead = rowHead.createCell(2);
        cellEmailHead.setCellValue("Email");

        for (int i = 0; i < ds.size(); ++i) {
            Row row = sheet.createRow(i + 1);
            Cell cellMSV = row.createCell(0);
            cellMSV.setCellValue(ds.get(i).getMa_sv());
            Cell cellHoTen = row.createCell(1);
            cellHoTen.setCellValue(ds.get(i).getHo_ten());
            Cell cellEmail = row.createCell(2);
            cellEmail.setCellValue(ds.get(i).getEmail());
        }

        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Lưu danh sách sinh viên");
        jFileChooser.addChoosableFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith("xlsx");
            }

            @Override
            public String getDescription() {
                return "Excel Documents (*.xlsx)";
            }
        });
        int rs = jFileChooser.showSaveDialog(this);
        if (rs == JFileChooser.APPROVE_OPTION) {
            File fileToSave = jFileChooser.getSelectedFile();
            try (FileOutputStream outputStream = new FileOutputStream(fileToSave.getAbsolutePath())) {
                workbook.write(outputStream);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Có lỗi khi lưu file", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChiTietLop dialog = new ChiTietLop(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXuat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sinhVienTable;
    // End of variables declaration//GEN-END:variables
}
