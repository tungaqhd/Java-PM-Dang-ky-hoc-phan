/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lop;

import chinh.QTVPanel;
import hocphan.HocPhan;
import hocphan.HocPhanDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import phong.Phong;
import phong.PhongDB;
import su_dung_phong.SuDungPhongDB;

/**
 *
 * @author tunga
 */
public class SuaLopForm extends javax.swing.JDialog {

    /**
     * Creates new form ThemLopForm
     */
    LopDB dbLop = new LopDB();
    HocPhanDB dbHP = new HocPhanDB();
    PhongDB dbPhong = new PhongDB();
    SuDungPhongDB sdPhongDB = new SuDungPhongDB();
    ArrayList<HocPhan> dsHp;
    ArrayList<Phong> dsPhong;
    QTVPanel pr;
    Lop lop;
    public SuaLopForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        pr = (QTVPanel)parent;
        cbxChuongTrinh.addItem("Thường");
        cbxChuongTrinh.addItem("CDIO");
        HienThiPhong();
    }
    
    public void setLop(Lop l)
    {
        HienThiPhong();
        HienThiHP();
        
        lop = l;
        txtMaLop.setText(l.getMa_lop());
        txtTenLop.setText(l.getTen_lop());
        cbxChuongTrinh.setSelectedIndex(l.getCdio());
        txtSiSo.setText(l.getSi_so()+"");
        
        int hpIdx = dsHp.indexOf(new HocPhan(l.getMa_hp()));
        cbxHocPhan.setSelectedIndex(hpIdx);
        
        cbxThu.setSelectedItem(l.getThu());
        txtTietBD.setText(l.getTiet_bat_dau()+"");
        txtTietKT.setText(l.getTiet_ket_thuc()+"");
        
        Phong p = dbPhong.getPhongByMaLop(l.getMa_lop());
        int idxDD = dsPhong.indexOf(p);
        cbxPhong.setSelectedIndex(idxDD);
        
        int indxHp = dsHp.indexOf(new HocPhan(l.getMa_hp()));
        cbxHocPhan.setSelectedIndex(indxHp);
    }

    private void HienThiPhong() {
        cbxPhong.removeAllItems();
        dsPhong = dbPhong.getDSPhong();
        for (Phong p : dsPhong) {
            cbxPhong.addItem(p.getThongTin());
        }
    }
    
    private void HienThiHP() {
        dsHp = dbHP.getHocPhan();
        for (HocPhan hp : dsHp) {
            cbxHocPhan.addItem(hp.getMa_hp() + " - " + hp.getTen_hp());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxChuongTrinh = new javax.swing.JComboBox<>();
        txtSiSo = new javax.swing.JTextField();
        cbxHocPhan = new javax.swing.JComboBox<>();
        txtTenLop = new javax.swing.JTextField();
        txtMaLop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbxPhong = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxThu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTietBD = new javax.swing.JTextField();
        txtTietKT = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setText("Mã lớp:");

        jLabel11.setText("Tên lớp:");

        jLabel12.setText("Chương trình:");

        jLabel13.setText("Sĩ số:");

        jLabel14.setText("Học phần:");

        txtMaLop.setEnabled(false);

        jLabel1.setText("Phòng:");

        jLabel2.setText("Thứ:");

        cbxThu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T2", "T3", "T4", "T5", "T6", "T7", "CN" }));

        jLabel3.setText("Bắt đầu:");

        jLabel4.setText("Kết thúc:");

        btnTim.setText("Tìm phòng");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnThem.setText("Sửa");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenLop)
                            .addComponent(txtMaLop)
                            .addComponent(cbxHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSiSo)
                            .addComponent(cbxChuongTrinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(cbxPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxThu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTietBD)
                            .addComponent(txtTietKT)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThoat)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbxPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbxChuongTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTietBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTietKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int idxPhong;
        String thu;
        int tietBD;
        int tietKT;
        String maLop;
        String tenLop;
        int cdio;
        int siSo;
        try {
            maLop = txtMaLop.getText();
            tenLop = txtTenLop.getText();
            cdio = cbxChuongTrinh.getSelectedIndex();
            siSo = Integer.parseInt(txtSiSo.getText());

            idxPhong = cbxPhong.getSelectedIndex();
            thu = cbxThu.getSelectedItem().toString();
            tietBD = Integer.parseInt(txtTietBD.getText());
            tietKT = Integer.parseInt(txtTietKT.getText());
            if (tietBD <= 0 || tietKT <= 0 || tietBD > 16 || tietKT > 16) {
                throw new IllegalArgumentException("Tiết không hợp lệ");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idPhong = dsPhong.get(idxPhong).getMa_phong();
        if (!sdPhongDB.checkSDPhong(thu, idPhong, tietBD, tietKT)) {
            JOptionPane.showMessageDialog(null, "Phòng này không trống trong khoảng thời gian đã chọn", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String maHP = dsHp.get(cbxHocPhan.getSelectedIndex()).getMa_hp();
        
        dbLop.editHocPhan(maLop, tenLop, cdio, siSo, maHP);
        sdPhongDB.updateSDPhong(maLop, thu, idPhong, tietBD, tietKT);
        pr.HienThiLop();
        dispose();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        String thu;
        int tietBD;
        int tietKT;
        try {
            thu = cbxThu.getSelectedItem().toString();
            tietBD = Integer.parseInt(txtTietBD.getText());
            tietKT = Integer.parseInt(txtTietKT.getText());
            if (tietBD <= 0 || tietKT <= 0 || tietBD > 16 || tietKT > 16) {
                throw new IllegalArgumentException("Tiết không hợp lệ");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        dsPhong = dbPhong.timPhong(thu, tietBD, tietKT);

        cbxPhong.removeAllItems();
        for (Phong p : dsPhong) {
            cbxPhong.addItem(p.getThongTin());
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(SuaLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaLopForm dialog = new SuaLopForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cbxChuongTrinh;
    private javax.swing.JComboBox<String> cbxHocPhan;
    private javax.swing.JComboBox<String> cbxPhong;
    private javax.swing.JComboBox<String> cbxThu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    private javax.swing.JTextField txtTietBD;
    private javax.swing.JTextField txtTietKT;
    // End of variables declaration//GEN-END:variables
}