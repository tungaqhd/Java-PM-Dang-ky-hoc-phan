/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinh;

import hocphan.HocPhan;
import hocphan.HocPhanDB;
import hocphan.HocPhanTable;
import hocphan.SuaHocPhanForm;
import hocphan.ThemHocPhanForm;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lop.Lop;
import lop.LopDB;
import lop.LopTable;
import lop.MoLopForm;
import lop.PhanCongForm;
import lop.SuaLopForm;
import lop.ThemLopForm;

/**
 *
 * @author tunga
 */
public class QTVPanel extends javax.swing.JFrame {

    /**
     * Creates new form QTVPanel
     */
    HocPhanDB dbHP = new HocPhanDB();
    LopDB dbLop = new LopDB();
    ArrayList<HocPhan> dsHP;
    ArrayList<Lop> dsLop;
    int idxHocPhan = -1;
    int idxLop = -1;

    public QTVPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
        HienThiHP();
        HienThiLop();
    }

    public void HienThiHP() {
        dsHP = dbHP.getHocPhan();
        hocPhanTable.setModel(new HocPhanTable(dsHP));
    }

    public void HienThiLop() {
        dsLop = dbLop.getLop();
        lopTable.setModel(new LopTable(dsLop));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelHP = new javax.swing.JPanel();
        btnThemHp = new javax.swing.JButton();
        btnSuaHp = new javax.swing.JButton();
        btnXoaHp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hocPhanTable = new javax.swing.JTable();
        panelLH = new javax.swing.JPanel();
        btnThemLop = new javax.swing.JButton();
        btnSuaLop = new javax.swing.JButton();
        btnXoaLop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lopTable = new javax.swing.JTable();
        btnMoLop = new javax.swing.JButton();
        btnPhanCong = new javax.swing.JButton();
        panelPH = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        btnThemHp.setText("Thêm");
        btnThemHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHpActionPerformed(evt);
            }
        });

        btnSuaHp.setText("Sửa");
        btnSuaHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHpActionPerformed(evt);
            }
        });

        btnXoaHp.setText("Xóa");
        btnXoaHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHpActionPerformed(evt);
            }
        });

        hocPhanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        hocPhanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hocPhanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hocPhanTable);

        javax.swing.GroupLayout panelHPLayout = new javax.swing.GroupLayout(panelHP);
        panelHP.setLayout(panelHPLayout);
        panelHPLayout.setHorizontalGroup(
            panelHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(panelHPLayout.createSequentialGroup()
                        .addComponent(btnThemHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaHp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelHPLayout.setVerticalGroup(
            panelHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHp)
                    .addComponent(btnSuaHp)
                    .addComponent(btnXoaHp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Học Phần", new javax.swing.ImageIcon(getClass().getResource("/images/lesson-64.png")), panelHP); // NOI18N

        btnThemLop.setText("Thêm");
        btnThemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLopActionPerformed(evt);
            }
        });

        btnSuaLop.setText("Sửa");
        btnSuaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaLopActionPerformed(evt);
            }
        });

        btnXoaLop.setText("Xóa");
        btnXoaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLopActionPerformed(evt);
            }
        });

        lopTable.setModel(new javax.swing.table.DefaultTableModel(
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
        lopTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lopTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lopTable);

        btnMoLop.setText("Mở lớp");
        btnMoLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoLopActionPerformed(evt);
            }
        });

        btnPhanCong.setText("Phân công giảng viên");
        btnPhanCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanCongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLHLayout = new javax.swing.GroupLayout(panelLH);
        panelLH.setLayout(panelLHLayout);
        panelLHLayout.setHorizontalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(panelLHLayout.createSequentialGroup()
                        .addComponent(btnThemLop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaLop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaLop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoLop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPhanCong)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLHLayout.setVerticalGroup(
            panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemLop)
                    .addComponent(btnSuaLop)
                    .addComponent(btnXoaLop)
                    .addComponent(btnMoLop)
                    .addComponent(btnPhanCong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lớp Học", new javax.swing.ImageIcon(getClass().getResource("/images/classroom-64.png")), panelLH); // NOI18N

        javax.swing.GroupLayout panelPHLayout = new javax.swing.GroupLayout(panelPH);
        panelPH.setLayout(panelPHLayout);
        panelPHLayout.setHorizontalGroup(
            panelPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelPHLayout.setVerticalGroup(
            panelPHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Phòng Học", new javax.swing.ImageIcon(getClass().getResource("/images/room-64.png")), panelPH); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHpActionPerformed
        // TODO add your handling code here:
        ThemHocPhanForm themHocPhanForm = new ThemHocPhanForm(this, rootPaneCheckingEnabled);
        themHocPhanForm.setVisible(true);;
    }//GEN-LAST:event_btnThemHpActionPerformed

    private void btnSuaHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHpActionPerformed
        // TODO add your handling code here:
        if (idxHocPhan == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn một học phần", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        SuaHocPhanForm suaHocPhanForm = new SuaHocPhanForm(this, rootPaneCheckingEnabled);
        suaHocPhanForm.setHp(dsHP.get(idxHocPhan));
        suaHocPhanForm.setVisible(true);
    }//GEN-LAST:event_btnSuaHpActionPerformed

    private void btnXoaHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHpActionPerformed
        // TODO add your handling code here:
        if (idxHocPhan == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn một học phần", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        dbHP.deleteHocPhan(dsHP.get(idxHocPhan).getMa_hp());
        HienThiHP();

    }//GEN-LAST:event_btnXoaHpActionPerformed

    private void hocPhanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hocPhanTableMouseClicked
        // TODO add your handling code here:
        idxHocPhan = hocPhanTable.getSelectedRow();
    }//GEN-LAST:event_hocPhanTableMouseClicked

    private void btnThemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLopActionPerformed
        // TODO add your handling code here:
        ThemLopForm themLopForm = new ThemLopForm(this, rootPaneCheckingEnabled);
        themLopForm.setVisible(true);
    }//GEN-LAST:event_btnThemLopActionPerformed

    private void btnSuaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaLopActionPerformed
        // TODO add your handling code here:
        if (idxLop == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn phải chọn một lớp", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        SuaLopForm suaLopForm = new SuaLopForm(this, rootPaneCheckingEnabled);
        suaLopForm.setLop(dsLop.get(idxLop));
        suaLopForm.setVisible(true);
    }//GEN-LAST:event_btnSuaLopActionPerformed

    private void btnXoaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLopActionPerformed
        // TODO add your handling code here:
        dbLop.deleteLop(dsLop.get(idxLop).getMa_lop());
    }//GEN-LAST:event_btnXoaLopActionPerformed

    private void lopTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lopTableMouseClicked
        // TODO add your handling code here:
        idxLop = lopTable.getSelectedRow();
    }//GEN-LAST:event_lopTableMouseClicked

    private void btnMoLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoLopActionPerformed
        // TODO add your handling code here:
        MoLopForm moLopForm = new MoLopForm(this, rootPaneCheckingEnabled);
        moLopForm.setMaLop(dsLop.get(idxLop).getMa_lop());
        moLopForm.setVisible(true);
    }//GEN-LAST:event_btnMoLopActionPerformed

    private void btnPhanCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanCongActionPerformed
        // TODO add your handling code here:
        Lop lop = dsLop.get(idxLop);
        if(lop.getMa_gv() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Lớp này đã có giảng viên dạy", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        PhanCongForm phanCongForm = new PhanCongForm(this, rootPaneCheckingEnabled);
        phanCongForm.HienThiGiangVien(lop);
        phanCongForm.setVisible(true);
    }//GEN-LAST:event_btnPhanCongActionPerformed

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
            java.util.logging.Logger.getLogger(QTVPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QTVPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QTVPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QTVPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QTVPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoLop;
    private javax.swing.JButton btnPhanCong;
    private javax.swing.JButton btnSuaHp;
    private javax.swing.JButton btnSuaLop;
    private javax.swing.JButton btnThemHp;
    private javax.swing.JButton btnThemLop;
    private javax.swing.JButton btnXoaHp;
    private javax.swing.JButton btnXoaLop;
    private javax.swing.JTable hocPhanTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable lopTable;
    private javax.swing.JPanel panelHP;
    private javax.swing.JPanel panelLH;
    private javax.swing.JPanel panelPH;
    // End of variables declaration//GEN-END:variables
}
