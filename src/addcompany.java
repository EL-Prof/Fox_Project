
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class addcompany extends javax.swing.JFrame {
    ResultSet rest ;
    String query ;

    /**
     * Creates new form addcompany
     */
    public addcompany() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 350));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("إضافة شركة جديدة");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 0, 170, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setNextFocusableComponent(jTextField5);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(360, 80, 170, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("رقم التليفون");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 80, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("إسم الشركة");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 40, 130, 30);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(360, 40, 170, 40);

        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 80, 280, 40);

        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 40, 280, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("إجمالي الطلبيه");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 160, 110, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setNextFocusableComponent(jTextField3);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 160, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("دفع");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 160, 40, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setNextFocusableComponent(jButton1);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(20, 160, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("الباقي");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(124, 164, 80, 30);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.setNextFocusableComponent(jTextField2);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(410, 160, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("حفظ");
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 270, 100, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("رجوع");
        jButton2.setNextFocusableComponent(jTextField4);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 270, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
MainPage x =new MainPage();
x.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try{
   String query2="SELECT * FROM company WHERE `name`="+"'"+jTextField4.getText()+"'";
   String query3="SELECT * FROM company WHERE tel = "+jTextField1.getText();
        if(jTextField4.getText().isEmpty() && jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty())
            JOptionPane.showMessageDialog(null,"برجاء إدخال كافة البيانات");
    else if (jTextField4.getText().isEmpty()){            JOptionPane.showMessageDialog(null,"برجاء إدخال اسم الشركة");

    }
    else if (jTextField1.getText().isEmpty()){            JOptionPane.showMessageDialog(null,"برجاء إدخال رقم تليفون الشركة");

    }
    else if (DB.stmt.executeQuery(query2).next()){
        JOptionPane.showMessageDialog(null,"برجاء إدخال إسم أخر الاسم مسجل بالفعل");
    }
    else if (DB.stmt.executeQuery(query3).next()){        JOptionPane.showMessageDialog(null,"هذا الرقم مسجل لشركة أخري تحقق من البيانات");

    }
    
    
        else 
        {
        
        
            try {
                query = "INSERT INTO company "
                        + "(`name`, `tel`, `paid`, `remender`) VALUES"+"(" +
                        "'"+jTextField4.getText()+"'"+","+"'"+ jTextField1.getText()+ "'" +"," + "'"+jTextField2.getText()
                        +"'"+","+"'"+jTextField3.getText()+"'"+
                        ")";
                
                
               int i = DB.stmt.executeUpdate(query);
               if(i != 0)
               {   JOptionPane.showMessageDialog(null,"تم الاضافه بنجاح !","Success!", 2 , new ImageIcon("Ok.png"));
                              if(JOptionPane.OK_OPTION == 0)
                              {
                              new addcompany().setVisible(true);
                              this.dispose();
                                           
                              }
               }
               
                              } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null,"خطـأ في التسجيــل!","Fail!", 2 , new ImageIcon("Fail.png"));
 
            }
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
catch(Exception ew){System.out.println("error");
   }  
    }// TODO add your handling code here:
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      MainPage mn = new MainPage();
      mn.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
   
           
    
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
            java.util.logging.Logger.getLogger(addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
