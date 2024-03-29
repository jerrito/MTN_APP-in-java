/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mtn_app;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.LuminanceSource;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import  com.google.zxing.Result;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
/**
 *
 * @author jerrito
 */
public class QR_CODE extends javax.swing.JFrame implements Runnable, ThreadFactory {

    /**
     * Creates new form QR_CODE
     */
    public QR_CODE() {
        initComponents();
        qr();
    }
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    PreparedStatement preparedStatement=null;
    public WebcamPanel panel= null;
    private Webcam webcam=null;
    public Executor executor= Executors.newSingleThreadExecutor(this);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        output = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 760));
        setMinimumSize(new java.awt.Dimension(1366, 760));
        setPreferredSize(new java.awt.Dimension(1366, 760));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 650));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 110));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 110));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Output");

        output.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(687, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void closes(){
       webcam.close();
        this.setVisible(false);
   }







    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(QR_CODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QR_CODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QR_CODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QR_CODE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QR_CODE().setVisible(true);
            }
        });
    }

    public void qr(){

        Dimension size= WebcamResolution.QVGA.getSize();
        webcam=Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel=new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        JLabel jLabel3=new JLabel();
        JLabel jLabelr=new JLabel();
        jLabelr.setText("Scan Merchant QR");
        jLabelr.setFont(new java.awt.Font("Segoe UI", 1, 45));
        jLabelr.setForeground(new java.awt.Color(255,255,255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\jerrito\\Documents\\NetBeansProjects\\mtn\\src\\main\\java\\com\\mycompany\\favicon_io\\error.png"));
       jLabel3.addMouseListener(new MouseListener() {
                             @Override
                             public void mouseClicked(MouseEvent e) {
                                 new Momo().setVisible(true);

                                 closes();}
                             @Override
                             public void mousePressed(MouseEvent e) {
                             }@Override
                             public void mouseReleased(MouseEvent e) {
                             }@Override
                             public void mouseEntered(MouseEvent e) {
                             }@Override
                             public void mouseExited(MouseEvent e) {};}
                        );
        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,1366,650));
        //jPanel1.revalidate();
        //jPanel1.repaint();
        panel.add(jLabel3,"w 10%, h 50");
        panel.add(jLabelr,"w 100%, h 50");

        //panel.revalidate();
        //panel.repaint();
        executor.execute(this);
       }

    @Override
    public void run() {

        do{
            try{
                Thread.sleep(100);
            }catch (InterruptedException ie){
                Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, (String) null);
            }
            Result result=null;
            BufferedImage image=null;
            if(webcam.isOpen()){
                if((image=webcam.getImage())==null){
                    continue;
                }
            }
            LuminanceSource source=new  BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap=new BinaryBitmap(new HybridBinarizer(source));


            try {
                result = new MultiFormatReader().decode(bitmap);
                String s="jdbc:sqlite:C:/Users/jerrito/Documents/NetBeansProjects/MTN_APP/momo.db";
                if (result != null) {
                    output.setText(result.getText());
                try {
                        Class.forName("org.sqlite.JDBC");
                        con = DriverManager.getConnection(s);
                        preparedStatement = con.prepareStatement("Select Name,id,Wallet  from Merchant where id=" + result.getText());
                        rs = preparedStatement.executeQuery();
                        int i = 0;
                    Pay_to P_t=new Pay_to();
                        while (rs.next()) {

                            P_t.ids=rs.getInt(2);
                            P_t.amount_initial=rs.getFloat(3);
                            P_t.name.setText(rs.getString(1));
                            P_t.setVisible(true);
                            closes();
                            i++;
                        }
                        con.close();
                    }
                catch(SQLException | ClassNotFoundException e){
                    Transfer_complete com=new Transfer_complete();
                    com.setVisible(true);
                    closes();
                    com.id.setText("Transaction Failed");

                    com.name1.setIcon(new ImageIcon("C:/Users/jerrito/Documents/NetBeansProjects/mtn/src/main/java/com/mycompany/favicon_io/error.png"));
                    com.info.setText("The QR code you have scanned is not a valid merchant id. Please scan proper merchant QR.");
                    com.proceed.setText("Ok");
                    e.printStackTrace();
                }
                }}catch (NotFoundException ex){
                Logger.getLogger(QR_CODE.class.getName()).log(Level.SEVERE, (String) null);
            }

        }while (true);
    }
   @Override
    public Thread newThread(Runnable r){
        Thread t=new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel output;
    // End of variables declaration//GEN-END:variables
}
