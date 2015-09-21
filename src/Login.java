
//import javafx.scene.layout.Pane;
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
        initComponents();
         try{
			UIManager.setLookAndFeel("com.easynth.lookandfeel.EaSynthLookAndFeel")	;
			SwingUtilities.updateComponentTreeUI(this);
			}catch(Exception e){e.printStackTrace();
    }
         
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

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

        Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameField)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Passlabel)
                            .addComponent(Nlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
           try {
               if(DB.c !=null)
               DB.c.close();
                if(DB.stmt != null)
           DB.stmt.close();
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }//GEN-LAST:event_formWindowClosed

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
        
    
if(!Authorize("E5-11-5B-47-CF-9B")){
JOptionPane.showMessageDialog(null, "حقوق الملكيه غير متوفره ", "Error in Authentication", 1, new ImageIcon("Thief-icon.png"));
return;
}
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
