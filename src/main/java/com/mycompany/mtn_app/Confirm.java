/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mtn_app;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.Objects;
import javax.swing.*;

/**
 *
 * @author jerrito
 */
public class Confirm extends javax.swing.JFrame {

    /**
     * Creates new form Confirm
     */
    public Confirm() {
        initComponents();

    }
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    PreparedStatement preparedStatement=null;
    Airtime_complete a=new Airtime_complete();
    Momo l=new Momo();
    Homes h=new Homes();





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        prices = new javax.swing.JLabel();
        numb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        decider = new javax.swing.JLabel();
        mb = new javax.swing.JLabel();
        priced = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bundle_old = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        proceed1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        homes2 = new javax.swing.JLabel();
        mtn = new javax.swing.JLabel();
        align = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1376, 762));

        jPanel5.setBackground(new java.awt.Color(242, 242, 245));
        jPanel5.setMaximumSize(new java.awt.Dimension(1376, 593));
        jPanel5.setMinimumSize(new java.awt.Dimension(1376, 593));
        jPanel5.setPreferredSize(new java.awt.Dimension(1376, 593));

        id.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        id.setText("Confirm payment");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText(" Airtime");

        amount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 102, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        prices.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        prices.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(prices, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(prices, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel10)
                .addGap(12, 12, 12))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        numb.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        numb.setText("0240845898");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Mobile Money Account");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Paying with:");

        decider.setForeground(new java.awt.Color(204, 204, 204));
        decider.setText("w");

        mb.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        mb.setForeground(new java.awt.Color(204, 204, 204));

        priced.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("For:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));

        bundle_old.setForeground(new java.awt.Color(204, 204, 204));
        bundle_old.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(decider)
                        .addGap(29, 29, 29)
                        .addComponent(mb)
                        .addGap(51, 51, 51)
                        .addComponent(priced)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel4))
                    .addComponent(bundle_old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(339, 339, 339))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numb, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decider)
                            .addComponent(mb)
                            .addComponent(priced)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addComponent(bundle_old, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMaximumSize(new java.awt.Dimension(1376, 71));
        jPanel9.setMinimumSize(new java.awt.Dimension(1376, 71));
        jPanel9.setPreferredSize(new java.awt.Dimension(1376, 71));

        proceed1.setBackground(new java.awt.Color(0, 102, 153));
        proceed1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        proceed1.setForeground(new java.awt.Color(255, 255, 255));
        proceed1.setText("Proceed");
        proceed1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        proceed1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceed1MouseClicked(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setText("Cancel");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(404, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(proceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setMaximumSize(new java.awt.Dimension(1376, 70));
        jPanel6.setMinimumSize(new java.awt.Dimension(1376, 70));
        jPanel6.setPreferredSize(new java.awt.Dimension(1376, 70));

        homes2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        homes2.setText("Confirm");

        mtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\MTN_APP\\favicon_io\\undo.png")); // NOI18N
        mtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtnMouseClicked(evt);
            }
        });

        align.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\centered-justification.png")); // NOI18N
        align.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alignMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(379, 379, 379)
                .addComponent(homes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(align)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(mtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(align, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(homes2)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1446, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1446, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1446, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceed1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceed1MouseClicked
        Recipient_details R_d=new Recipient_details();
        DecimalFormat d=new DecimalFormat();
        d.setMaximumFractionDigits(2);
    //momo airtime
     if (Objects.equals( decider.getText(),"1")){
      if (Float.parseFloat(amount.getText())> l.balance_main){
          JOptionPane.showMessageDialog(this,"Insufficient Balance");
      }
      else{
          String s="jdbc:sqlite:C:/Users/jerrito/Documents/NetBeansProjects/MTN_APP/momo.db";
          try{
              Class.forName("org.sqlite.JDBC");
              con=DriverManager.getConnection(s);
              con.setAutoCommit(false);
              st=con.createStatement();
              float wallet_update=l.balance_main- Float.parseFloat(amount.getText());
              st.executeUpdate("Update Momo set Wallet=" + d.format(wallet_update)+ " Where number=" + l.number);
              con.commit();
              float airtime_update;
              if(Objects.equals(jLabel4.getText(), "")){
                  airtime_update =h.credits+Float.parseFloat(amount.getText());
              }
             else {
                  airtime_update= Float.parseFloat(jLabel4.getText())+Float.parseFloat(amount.getText());
              }
              st.executeUpdate("Update Momo set Airtime=" + d.format(airtime_update)+ " Where number=" +numb.getText());
              con.commit();
              a.id.setText("Your Purchase has been successful");
              a.info.setText("          You have purchased Gh₵"+amount.getText()+" Airtime");
              a.homes2.setVisible(false);
              a.back.setVisible(false);
              a.setVisible(true);
              this.setVisible(false);

             con.close();
      }
        catch(SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(this,"Network error.\n Please try again");
            e.printStackTrace();
        }}}
     //momo bundle input amount
     else if (Objects.equals(decider.getText(),"2")){

         if (Float.parseFloat(mb.getText())> l.balance_main){
             JOptionPane.showMessageDialog(this,"Insufficient Balance");
         }
         else{
             String s="jdbc:sqlite:C:/Users/jerrito/Documents/NetBeansProjects/MTN_APP/momo.db";
             try{
                 Class.forName("org.sqlite.JDBC");
                 con=DriverManager.getConnection(s);
                 preparedStatement = con.prepareStatement("Select Bundle, Number from Momo where number=" + Integer.parseInt(numb.getText()));
                 rs = preparedStatement.executeQuery();
                 int i = 0;
                 while (rs.next()) {
                     bundle_old.setText(rs.getString(1));
                 }
                 con.setAutoCommit(false);
                 st=con.createStatement();
                 float wallet_update=l.balance_main- Float.parseFloat(mb.getText());
                 st.executeUpdate("Update Momo set Wallet=" + d.format(wallet_update)+ " Where number=" + l.number);
                 con.commit();

                 float data_update= Float.parseFloat(bundle_old.getText()) + Float.parseFloat(priced.getText());
                 System.out.println(bundle_old.getText());
                 System.out.println(numb.getText());
                 st.executeUpdate("Update Momo set Bundle=" + (data_update)+ " Where number=" + Integer.parseInt(numb.getText()));
                 con.commit();
                 a.id.setText("Your Purchase has been successful");
                 a.info.setText("          You have purchased GH₵"+amount.getText()+" Data");
                 a.homes2.setVisible(false);
                 a.back.setVisible(false);
                 a.setVisible(true);
                 this.dispose();

                 con.close();
             }
             catch(SQLException | ClassNotFoundException e){
                 JOptionPane.showMessageDialog(this,"Network error.\n Please try again");
                 e.printStackTrace();
             }}}

        //momo bundle 24mb or 48mb or 471mb or 971mb
     else if(Objects.equals(decider.getText(),"3")||Objects.equals(decider.getText(),"4")||Objects.equals(decider.getText(),"5")||Objects.equals(decider.getText(),"10")){
         if (Float.parseFloat(mb.getText())> l.balance_main){

             JOptionPane.showMessageDialog(this,"Insufficient Balance");
         }
         else{
             String s="jdbc:sqlite:C:/Users/jerrito/Documents/NetBeansProjects/MTN_APP/momo.db";
             try{
                 Class.forName("org.sqlite.JDBC");
                 con=DriverManager.getConnection(s);
                 preparedStatement = con.prepareStatement("Select Bundle, Number from Momo where number=" + Integer.parseInt(numb.getText()));
                 rs = preparedStatement.executeQuery();
                 int i = 0;
                 while (rs.next()) {
                     bundle_old.setText(rs.getString(1));
                 }

                 con.setAutoCommit(false);
                 st=con.createStatement();
                 float wallet_update=l.balance_main- Float.parseFloat(mb.getText());
                 st.executeUpdate("Update Momo set Wallet=" + (wallet_update)+ " Where number=" + l.number);
                 con.commit();
                 float data_update= Float.parseFloat(bundle_old.getText()) + Float.parseFloat(priced.getText());
                 st.executeUpdate("Update Momo set Bundle=" + (data_update)+ " Where number=" + numb.getText());
                 con.commit();
                 a.id.setText("Your Purchase has been successful");
                 a.info.setText("          You have purchased GH₵"+amount.getText()+" Data");
                 a.homes2.setVisible(false);
                 a.back.setVisible(false);
                 a.setVisible(true);
                 this.dispose();
                 con.close();
             }
             catch(SQLException | ClassNotFoundException e){
                 JOptionPane.showMessageDialog(this,"Network error.\n Please try again");
                 e.printStackTrace();
             }}
     }
    }//GEN-LAST:event_proceed1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Buy_Send().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void mtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtnMouseClicked
        new Buy_Send().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mtnMouseClicked

    private void alignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alignMouseClicked
        new Settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_alignMouseClicked

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
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel align;
    public javax.swing.JLabel amount;
    private javax.swing.JButton back;
    public javax.swing.JLabel bundle_old;
    public javax.swing.JLabel decider;
    private javax.swing.JLabel homes2;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JLabel mb;
    private javax.swing.JLabel mtn;
    public javax.swing.JLabel numb;
    public javax.swing.JLabel priced;
    public javax.swing.JLabel prices;
    private javax.swing.JButton proceed1;
    // End of variables declaration//GEN-END:variables
}
