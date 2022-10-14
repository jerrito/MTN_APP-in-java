/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mtn_app;

/**
 *
 * @author jerrito
 */
public class Transfer extends javax.swing.JFrame {

    /**
     * Creates new form Transfer
     */
    public Transfer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        momo_user = new javax.swing.JLabel();
        other_networks = new javax.swing.JLabel();
        scheduled = new javax.swing.JLabel();
        non_momo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 252, 243));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        homes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homes.setText("Transfer");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\apple-touch-icon.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\centered-justification.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(homes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homes)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        id.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        id.setText("Transfer Money");

        momo_user.setBackground(new java.awt.Color(255, 255, 255));
        momo_user.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        momo_user.setForeground(new java.awt.Color(0, 51, 102));
        momo_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\transfer.png")); // NOI18N
        momo_user.setText("Momo User");
        momo_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        momo_user.setIconTextGap(0);
        momo_user.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        momo_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                momo_userMouseClicked(evt);
            }
        });

        other_networks.setBackground(new java.awt.Color(255, 255, 255));
        other_networks.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        other_networks.setForeground(new java.awt.Color(0, 51, 102));
        other_networks.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\pay.png")); // NOI18N
        other_networks.setText("Other Networks");
        other_networks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        other_networks.setIconTextGap(0);
        other_networks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        other_networks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                other_networksMouseClicked(evt);
            }
        });

        scheduled.setBackground(new java.awt.Color(255, 255, 255));
        scheduled.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        scheduled.setForeground(new java.awt.Color(0, 51, 102));
        scheduled.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\teller.png")); // NOI18N
        scheduled.setText("Scheduled Transfer");
        scheduled.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scheduled.setIconTextGap(0);
        scheduled.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        non_momo.setBackground(new java.awt.Color(255, 255, 255));
        non_momo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        non_momo.setForeground(new java.awt.Color(0, 51, 102));
        non_momo.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\login.png")); // NOI18N
        non_momo.setText("Non Momo User");
        non_momo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        non_momo.setIconTextGap(0);
        non_momo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(momo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(non_momo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scheduled, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(other_networks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(momo_user, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(other_networks, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scheduled, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(non_momo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void momo_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_momo_userMouseClicked
      new Transfer_momo().setVisible(true);
      this.setVisible(false);

    }//GEN-LAST:event_momo_userMouseClicked

    private void other_networksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_other_networksMouseClicked
        homes.setText("Transfer");
        homes.setFont(new java.awt.Font("Segoe UI",1,15));
        id.setText("Transfer Money");
        id.setFont(new java.awt.Font("Segoe UI",1,20));
        momo_user.setText("Momo User");
    }//GEN-LAST:event_other_networksMouseClicked

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel homes;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel momo_user;
    private javax.swing.JLabel non_momo;
    private javax.swing.JLabel other_networks;
    private javax.swing.JLabel scheduled;
    // End of variables declaration//GEN-END:variables
}