/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mtn_app;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Objects;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jerrito
 */
public class Recipient_number extends javax.swing.JFrame {

    /**
     * Creates new form Recipient_number
     */
    public Recipient_number() {
        initComponents();
        info();

    }
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    PreparedStatement preparedStatement=null;
    Homes h=new Homes();
    String s="jdbc:sqlite:C:/Users/jerrito/Documents/NetBeansProjects/MTN_APP/momo.db";
    int x;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        homes2 = new javax.swing.JLabel();
        align = new javax.swing.JLabel();
        mtn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        mine = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        wrong_num = new javax.swing.JLabel();
        decider = new javax.swing.JLabel();
        bundle_amount = new javax.swing.JLabel();
        bundle_data = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        proceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1373, 786));

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));

        homes2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homes2.setText("Recipient");

        align.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\centered-justification.png")); // NOI18N
        align.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alignMouseClicked(evt);
            }
        });

        mtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\MTN_APP\\favicon_io\\undo.png")); // NOI18N
        mtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(mtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(406, 406, 406)
                .addComponent(homes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 619, Short.MAX_VALUE)
                .addComponent(align)
                .addGap(88, 88, 88))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(align, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homes2))
                .addGap(10, 10, 10))
        );

        id.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        id.setText("Recipient");

        buttonGroup1.add(mine);
        mine.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mine.setSelected(true);
        mine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        mine.setBorderPainted(true);
        mine.setIconTextGap(10);
        mine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineActionPerformed(evt);
            }
        });

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        others.setText("Others");
        others.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        others.setBorderPainted(true);
        others.setIconTextGap(10);
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("I am buying for:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Phone Number");

        num.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numKeyReleased(evt);
            }
        });

        wrong_num.setForeground(new java.awt.Color(255, 0, 0));

        decider.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        decider.setForeground(new java.awt.Color(255, 255, 255));
        decider.setText("w");

        bundle_amount.setForeground(new java.awt.Color(255, 255, 255));
        bundle_amount.setText("0");

        bundle_data.setForeground(new java.awt.Color(255, 255, 255));
        bundle_data.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(decider)
                        .addGap(497, 497, 497)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bundle_amount)
                        .addGap(483, 483, 483)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(others, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(mine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num)
                            .addComponent(wrong_num, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(663, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(bundle_data)
                    .addContainerGap(1389, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(mine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bundle_amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wrong_num, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(303, Short.MAX_VALUE)
                    .addComponent(bundle_data)
                    .addGap(215, 215, 215)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1373, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(1373, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1373, 100));

        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setText("Back");
        back.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        proceed.setBackground(new java.awt.Color(0, 102, 102));
        proceed.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        proceed.setForeground(new java.awt.Color(255, 255, 255));
        proceed.setText("Continue");
        proceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        proceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    proceedMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(408, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(370, 370, 370))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void  info(){
        mine.setText("self(0"+h.number+")");
        jLabel2.setVisible(false);
        wrong_num.setVisible(false);
        num.setVisible(false);
                        }
    private void alignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alignMouseClicked
        new Settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_alignMouseClicked

    private void mtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtnMouseClicked
        new Buy_Send().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mtnMouseClicked

    private void mineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineActionPerformed
       jLabel2.setVisible(false);
       wrong_num.setVisible(false);
       num.setVisible(false);
    }//GEN-LAST:event_mineActionPerformed

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
        jLabel2.setVisible(true);
        wrong_num.setVisible(true);
        num.setVisible(true);
    }//GEN-LAST:event_othersActionPerformed
    public void screen(){
        Recipient_details R_d=new Recipient_details();
        R_d.setVisible(true);
        this.dispose();
    }

    public void Data_generate_mine(){
        Recipient_details R_d=new  Recipient_details();
        if (Objects.equals(decider.getText(), "3") || Objects.equals(decider.getText(), "4")||
                Objects.equals(decider.getText(), "5" )||Objects.equals(decider.getText(), "10")){
            R_d.jLabel2.setText(bundle_data.getText()+"MB");
            R_d.jLabel5.setText("GH₵"+bundle_amount.getText());
        }

        R_d.Bundle=h.bundles;
        R_d.homes2.setText("Payment");
        R_d.jLabel3.setText("Buying data for");
        R_d.num.setVisible(false);
        R_d.back.setText("Cancel");
        R_d.bundle_amount.setText(bundle_amount.getText());
        R_d.bundle_data.setText(bundle_data.getText());
        R_d.number.setText("0"+h.number);
        R_d.decider.setText(decider.getText());
        R_d.setVisible(true);
        this.dispose();
    }
    public  void Data_generate_others(){
        Recipient_details R_d=new  Recipient_details();
        if (Objects.equals(num.getText(), "")){
            num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        }
        else {

            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection(s);
                preparedStatement = con.prepareStatement("Select Bundle, Number from Momo where number=" + num.getText());
                rs = preparedStatement.executeQuery();
                int i = 0;
                while (rs.next()) {
                    R_d.Bundle=(rs.getFloat(1));
                    R_d.num.setVisible(false);
                    if (Objects.equals(decider.getText(), "2")){
                        R_d.num.setVisible(true);
                    }
                   else if (Objects.equals(decider.getText(), "3") || Objects.equals(decider.getText(), "4")||
                            Objects.equals(decider.getText(), "5" )||Objects.equals(decider.getText(), "10")){
                        R_d.jLabel2.setText(bundle_data.getText()+"MB");
                        R_d.jLabel5.setText("GH₵"+bundle_amount.getText());

                   }

                    R_d.homes2.setText("Payment");
                    R_d.jLabel3.setText("Buying data for");
                    R_d.bundle_amount.setText(bundle_amount.getText());
                    R_d.bundle_data.setText(bundle_data.getText());
                    R_d.Bundle=rs.getFloat(1);
                    R_d.number.setText("0" + rs.getString(2));
                    R_d.decider.setText(decider.getText());
                    R_d.setVisible(true);
                    this.dispose();
                    i++;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Homes.class.getName()).log(Level.SEVERE, null, ex);
            }
            wrong_num.setText("Incorect phone number");
            num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        }
    }

    private void proceedMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {//GEN-FIRST:event_proceedMouseClicked
        Recipient_details R_d= new Recipient_details();

        //selecting credit
         if(Objects.equals(decider.getText(),"1")) {

            if(mine.isSelected()){
                R_d.jLabel3.setText("Buying airtime for");
                R_d.air.setVisible(false);
                R_d.Airtime.setVisible(false);
                R_d.back.setVisible(false);
                R_d.proceed.setText("Buy");
                R_d.number.setText("0"+h.number);
                R_d.decider.setText(decider.getText());
                R_d.setVisible(true);
                this.setVisible(false);
            }
            else if(others.isSelected()){
                if (Objects.equals(num.getText(), "")){
                    num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

                }
                else  {


                    try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection(s);
                        preparedStatement = con.prepareStatement("Select Airtime, Number from Momo where number=" + num.getText());
                        rs = preparedStatement.executeQuery();
                        int i = 0;
                        while (rs.next()) {
                            R_d.credit_others.setText((rs.getString(1)));
                            R_d.number.setText("0" + rs.getString(2));
                            R_d.decider.setText(decider.getText());
                            R_d.setVisible(true);
                            this.setVisible(false);
                            i++;
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Homes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    wrong_num.setText("Incorect phone number");
                    num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
                }
            }}



        //selecting data one where you input your amount
      else if(Objects.equals(decider.getText(), "2")){
            if(mine.isSelected()){
                R_d.jLabel2.setText("Enter Amount to buy(GH₵ 0.03-399)");
                R_d.homes2.setText("Payment");
                R_d.jLabel3.setText("Buying data for");
                R_d.back.setText("Cancel");
                R_d.number.setText("0"+h.number);
                R_d.Bundle=h.bundles;
                R_d.decider.setText(decider.getText());
                R_d.setVisible(true);
                this.setVisible(false);
                 }
            else if(others.isSelected()){
                Data_generate_others();
               }
        }

        //selecting data two 24MB or 48mb or 471mb or 971mb
        else if(Objects.equals( decider.getText(),"3")||Objects.equals( decider.getText(),"5")||Objects.equals(decider.getText(),"4")||Objects.equals(decider.getText(),"10")){
            if(mine.isSelected()){
                Data_generate_mine();
            }
            else  if (others.isSelected()){
                Data_generate_others();}}
        else if(Objects.equals(decider.getText(),"7")){
            Pay_to P_t=new Pay_to();
             try {
                 Class.forName("org.sqlite.JDBC");
                 con = DriverManager.getConnection(s);
                 preparedStatement = con.prepareStatement("Select Name, id, Wallet  from Merchant where ID=" + num.getText());
                 rs = preparedStatement.executeQuery();
                 int i = 0;
                 while (rs.next()) {
                     P_t.name.setText(rs.getString(1));
                     P_t.ids=rs.getInt(2);
                     P_t.amount_initial=rs.getFloat(3);
                     P_t.setVisible(true);
                     this.dispose();
                     i++;
                 }
             } catch (ClassNotFoundException e) {
                 e.printStackTrace();
             } catch (SQLException e) {
                 e.printStackTrace();

             }
         }
        else {
             JOptionPane.showMessageDialog(this, "Error");
         }
    }//GEN-LAST:event_proceedMouseClicked

    private void numKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyReleased
        try {
            x = Integer.parseInt(num.getText());
        } catch (NumberFormatException nfe) {
            num.setText("");
        }
    }//GEN-LAST:event_numKeyReleased
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
            java.util.logging.Logger.getLogger(Recipient_number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recipient_number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recipient_number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recipient_number.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recipient_number().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel align;
    private javax.swing.JButton back;
    public javax.swing.JLabel bundle_amount;
    public javax.swing.JLabel bundle_data;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel decider;
    public javax.swing.JLabel homes2;
    public javax.swing.JLabel id;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JRadioButton mine;
    private javax.swing.JLabel mtn;
    public javax.swing.JTextField num;
    public javax.swing.JRadioButton others;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel wrong_num;
    // End of variables declaration//GEN-END:variables
}