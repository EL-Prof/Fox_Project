
//import javafx.scene.layout.Pane;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**

 *
 * @author 3MadoViski
 */
public class Login extends javax.swing.JFrame {
DB db = new DB() ; 

     
/**
     * Creates new form Login
     */
    public Login() {
        try {
   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); 
     
 ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PT Separated Baloon.ttf")));
} catch (Exception e) {
 //Handle exception
}

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nlabel = new javax.swing.JLabel();
        Passlabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Nlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nlabel.setText("الاسم:");

        Passlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Passlabel.setText("كلمة المرور:");

        NameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(0, 0, 204));
        Login.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Login.setText("دخول");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        PasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("تسجيل");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("PT Separated Baloon", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("الضياء");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sLvRtDA - Imgur.png"))); // NOI18N
        jLabel2.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Nlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Passlabel))
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        if (NameField.getText().isEmpty()&& PasswordField.getText().isEmpty())
        {
              JOptionPane.showMessageDialog(new JPanel(), "برجاء إدخال الاسم و كلمة المرور", "Error", JOptionPane.ERROR_MESSAGE);
        }
    else    if (NameField.getText().isEmpty()) {  JOptionPane.showMessageDialog(new JPanel(), "برجاء إدخال اسم العميل", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    else if(PasswordField.getText().isEmpty()){  JOptionPane.showMessageDialog(new JPanel(), "برجاء إدخال كلمة المرور", "Error", JOptionPane.ERROR_MESSAGE);
    }
   else     if( db.check_password(NameField.getText(), PasswordField.getText()))
      {
           new MainPage().show();
           this.dispose();
      }     
      
      else
           JOptionPane.showMessageDialog(new JPanel(), "برجاء التحقق من الاسم وكلمة المرور", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_LoginActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        PasswordField.requestFocus();
    }//GEN-LAST:event_NameFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        LoginActionPerformed(evt);
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

addemployee ad = new addemployee();
ad.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
          try{
			UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel() )	;
			
			}catch(Exception e){e.printStackTrace();
    }
    
//if(!Authorize("00-21-9B-28-61-A9")){
//JOptionPane.showMessageDialog(null, "حقوق الملكيه غير متوفره ", "Error in Authentication", 1, new ImageIcon("Thief-icon.png"));
//return;
//}
        DB.initializeconnection();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel Nlabel;
    private javax.swing.JLabel Passlabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables


public static boolean Authorize(String m){
 try {
   
    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
    while(networks.hasMoreElements()) {
      NetworkInterface network = networks.nextElement();
      byte[] mac = network.getHardwareAddress();

      if(mac != null) {
        System.out.print("Current MAC address : ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        System.out.println(sb.toString());
        if(sb.toString().equalsIgnoreCase(m))
            return true ;
      }
    }
  } catch (SocketException e) {
    e.printStackTrace();
  }
    
    
    
    return false;
}





}
