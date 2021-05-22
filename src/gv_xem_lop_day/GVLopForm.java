/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gv_xem_lop_day;

import gv_xem_ds_lop.*;
import chinh.GiangVien;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lop.Lop;
import lop.LopDB;
import lop.LopTable;

/**
 *
 * @author tunga
 */
public class GVLopForm extends javax.swing.JDialog {

    /**
     * Creates new form DSLopMoChoGV
     */
    int idx = -1;
    LopDB dbLop = new LopDB();
    ArrayList<Lop> ds;
    public GiangVien gv;
    public GVLopForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));        
        setIconImage(image);
        this.setLocationRelativeTo(null);
    }
    
    public void HienThi(GiangVien g) {
        ds = dbLop.getLopGV(g.getMa_gv());
        lopTable.setModel(new LopTable(ds));
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
        lopTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lớp của tôi");

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lopTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(lopTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lopTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lopTableMouseClicked
        // TODO add your handling code here:
        idx = lopTable.getSelectedRow();
        if(idx != -1) {
            ChiTietLop chiTietLop = new ChiTietLop(null, rootPaneCheckingEnabled);
            chiTietLop.getSinhVien(ds.get(idx).getMa_lop());
            chiTietLop.setVisible(true);
            
        }
        
    }//GEN-LAST:event_lopTableMouseClicked

    private void lopTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lopTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lopTableMousePressed

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
            java.util.logging.Logger.getLogger(GVLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GVLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GVLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GVLopForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GVLopForm dialog = new GVLopForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lopTable;
    // End of variables declaration//GEN-END:variables
}
