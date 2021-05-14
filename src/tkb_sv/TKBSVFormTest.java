/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkb_sv;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author tunga
 */
public class TKBSVFormTest extends javax.swing.JFrame {

    /**
     * Creates new form TKBSVForm
     */
    Algo al = new Algo();

    public TKBSVFormTest() {
        initComponents();

        ArrayList<Integer> names = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 7, 8, 9, 13, 15));
        JLabel tmp = new JLabel();

        tmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tmp.setText("ahihi");
        tmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout panelT2Layout = new javax.swing.GroupLayout(panelT2);
        ParallelGroup gr1 = panelT2Layout.createParallelGroup();
        SequentialGroup gr2 = panelT2Layout.createSequentialGroup();
        gr2.addGap(10, 10, 10);

        gr1.addGap(36, 36, 36);
//        ArrayList<Integer> dsTiet = al.getList();
//        for (int i = 0; i < dsTiet.size(); ++i) {
//            JLabel tiet = new JLabel();
//            tiet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//            tiet.setText("Tiết " + i);
//            tiet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
//
//            gr1.addComponent(tiet, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);
//
//            gr2.addGap(10, 10, 10);
//            gr2.addComponent(tiet, javax.swing.GroupLayout.PREFERRED_SIZE, 40*dsTiet.get(i), javax.swing.GroupLayout.PREFERRED_SIZE);
//        }

//        gr1.addGap(36, 36, 36);
//        gr1.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);
//        gr1.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);
//        gr1.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);
//        gr1.addComponent(tmp, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);

//        gr2.addGap(36, 36, 36);
//        gr2.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE);
//        gr2.addGap(18, 18, 18);
//        gr2.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE);
//        gr2.addGap(84, 84, 84);
//        gr2.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE);
//        gr2.addGap(100, 100, 100);
//
//        gr2.addComponent(tmp, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE);
//        gr2.addGap(70, 70, 70);
        panelT2.setLayout(panelT2Layout);
        panelT2Layout.setHorizontalGroup(
                panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelT2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gr1)
                                .addContainerGap())
        );

        panelT2Layout.setVerticalGroup(
                panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gr2)
        );

//        addSubject(panelT2, "vcl");
//        addSubject(panelT2, "TUNG");
    }

    private void addSubject(JPanel panelThu, String ten) {

        JLabel subjectText = new JLabel(ten);
        subjectText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JLabel subjectText2 = new JLabel(ten);
        subjectText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subjectText2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout panelThuLayout = new javax.swing.GroupLayout(panelThu);
        panelThu.setLayout(panelThuLayout);
        panelThuLayout.setHorizontalGroup(
                panelThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelThuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(subjectText, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addContainerGap(137, Short.MAX_VALUE))
                        .addComponent(subjectText2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        panelThuLayout.setVerticalGroup(
                panelThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelThuLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(subjectText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelThu.revalidate();
        panelThu.repaint();
        panelThu.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChinh = new javax.swing.JPanel();
        panelT2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelT3 = new javax.swing.JPanel();
        panelT4 = new javax.swing.JPanel();
        panelT5 = new javax.swing.JPanel();
        panelT6 = new javax.swing.JPanel();
        panelT7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelT2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 3, true));
        panelT2.setPreferredSize(new java.awt.Dimension(220, 612));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout panelT2Layout = new javax.swing.GroupLayout(panelT2);
        panelT2.setLayout(panelT2Layout);
        panelT2Layout.setHorizontalGroup(
            panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelT2Layout.createSequentialGroup()
                .addGroup(panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelT2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2))
                    .addGroup(panelT2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelT2Layout.setVerticalGroup(
            panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelT2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        panelT3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 3, true));
        panelT3.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT3Layout = new javax.swing.GroupLayout(panelT3);
        panelT3.setLayout(panelT3Layout);
        panelT3Layout.setHorizontalGroup(
            panelT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );
        panelT3Layout.setVerticalGroup(
            panelT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 237, 203), 1, true));
        panelT4.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT4Layout = new javax.swing.GroupLayout(panelT4);
        panelT4.setLayout(panelT4Layout);
        panelT4Layout.setHorizontalGroup(
            panelT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        panelT4Layout.setVerticalGroup(
            panelT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 237, 203), 1, true));
        panelT5.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT5Layout = new javax.swing.GroupLayout(panelT5);
        panelT5.setLayout(panelT5Layout);
        panelT5Layout.setHorizontalGroup(
            panelT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        panelT5Layout.setVerticalGroup(
            panelT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 237, 203), 1, true));
        panelT6.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT6Layout = new javax.swing.GroupLayout(panelT6);
        panelT6.setLayout(panelT6Layout);
        panelT6Layout.setHorizontalGroup(
            panelT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        panelT6Layout.setVerticalGroup(
            panelT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 237, 203), 1, true));
        panelT7.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT7Layout = new javax.swing.GroupLayout(panelT7);
        panelT7.setLayout(panelT7Layout);
        panelT7Layout.setHorizontalGroup(
            panelT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        panelT7Layout.setVerticalGroup(
            panelT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelChinhLayout = new javax.swing.GroupLayout(panelChinh);
        panelChinh.setLayout(panelChinhLayout);
        panelChinhLayout.setHorizontalGroup(
            panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChinhLayout.setVerticalGroup(
            panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelT5, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(panelT6, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(panelT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(panelT7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(panelT3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addComponent(panelT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TKBSVFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TKBSVFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TKBSVFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TKBSVFormTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TKBSVFormTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelChinh;
    private javax.swing.JPanel panelT2;
    private javax.swing.JPanel panelT3;
    private javax.swing.JPanel panelT4;
    private javax.swing.JPanel panelT5;
    private javax.swing.JPanel panelT6;
    private javax.swing.JPanel panelT7;
    // End of variables declaration//GEN-END:variables
}
