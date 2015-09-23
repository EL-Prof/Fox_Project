
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class bill extends javax.swing.JFrame {
    Double total , sum ;
   String query ; 
   ResultSet rset ; 
    static  DefaultTableModel bill_model ;
    

    
    
    
    public bill() {
      
        initComponents();
        jTextField4.requestFocus();
        try{
			UIManager.setLookAndFeel("com.easynth.lookandfeel.EaSynthLookAndFeel")	;
			SwingUtilities.updateComponentTreeUI(this);
			}catch(Exception e){e.printStackTrace();
    }
        
        bill_model = (DefaultTableModel) jTable1.getModel();
        jTextField2.setText(DB.emp_name);
        jTextField3.setText(DB.dateFormat.format(DB.d));
        jTextField3.setEditable(false);
         
         query = "SELECT ID FROM foxproject.bill ORDER BY ID DESC LIMIT 1 " ;
        try {
            
            rset = DB.stmt.executeQuery(query);
            rset.next();
            Integer id = rset.getInt(1);
            id ++ ; 
            jTextField1.setText(id.toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(estlam.class.getName()).log(Level.SEVERE, null, ex);
        }        
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(788, 570));
        setPreferredSize(new java.awt.Dimension(830, 710));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("فاتورة للبيع");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 0, 150, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("فاتورة جديدة");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 630, 130, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("رقم الفاتورة");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(700, 60, 90, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(570, 60, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("إسم البائع");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 60, 80, 30);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(360, 60, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("التاريخ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 60, 60, 30);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 60, 130, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("كود المنتج");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(720, 290, 70, 49);

        jTextField4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(450, 290, 260, 49);

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("بحث");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(350, 290, 90, 49);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("سعر الوحدة");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 110, 70, 40);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("نوع المنتج");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 110, 110, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("اسم المنتج");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 110, 100, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("العـدد");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(720, 110, 60, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 0, 51));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(720, 150, 60, 60);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(650, 150, 70, 60);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setDragEnabled(true);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(540, 150, 110, 60);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setDragEnabled(true);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(440, 150, 100, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("إضافة");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 220, 110, 50);

        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 110, 350, 170);

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الاجمالي", "الكميه", "سعر الوحده", "النوع ", "اسم المنتج", "الباركود"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(2).setResizable(false);
        jTable1.getColumnModel().getColumn(3).setResizable(false);
        jTable1.getColumnModel().getColumn(4).setResizable(false);
        jTable1.getColumnModel().getColumn(5).setMinWidth(0);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(0);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(0);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 430, 530, 180);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("المنتجات");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(464, 370, 90, 40);

        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 370, 530, 240);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("طباعة");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 630, 100, 40);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("إجمالي الفاتورة : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(660, 620, 130, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField10);
        jTextField10.setBounds(490, 630, 160, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton5.setText("رجوع");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 630, 110, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("أجل ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(240, 630, 90, 40);

        jButton7.setLabel("مسـح");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(173, 580, 70, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 new bill().setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        jButton4ActionPerformed(null);
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(jTextField4.getText() == null ||jTextField4.getText().equals(""))
{
 JOptionPane.showMessageDialog(null, "من فضلك ادخل الباركود");
 jTextField4.requestFocus();
 return;
}
query = "select * from product where barcode = "+jTextField4.getText() ;
        
        try {
            rset = DB.stmt.executeQuery(query);
            if(rset.next() ==true )
            {
                jTextField5.setText("1");
            jTextField8.setText(rset.getString(2));
            jTextField6.setText(rset.getString(6));
            jTextField7.setText(rset.getString(3));
            jButton2.setEnabled(true);
            jTextField5.requestFocus();
            jTextField5.selectAll();
            }
            else {
                 JOptionPane.showMessageDialog(null, "البـاركود غير مسجل ");
             jTextField5.setText("");
            jTextField7.setText("");
            jTextField6.setText("");
            jTextField8.setText("");
            jTextField4.setText("");
            jButton2.setEnabled(false);
            
            }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "بـرجاء ادخال باركود مناسب ! ");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if(rset != null && rset.isFirst())
            {      total=Double.parseDouble(rset.getString(6))*Double.parseDouble(jTextField5.getText());
            Object []  row = {total ,jTextField5.getText(),rset.getString(6)  ,
                                                         rset.getString(3) , rset.getString(2) , rset.getString(1) } ;

            bill_model.addRow(row) ;
            }
        } catch (SQLException ex) {
            Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
        }

calc_total();
jTextField4.setText("");
jTextField4.requestFocus();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        new MainPage().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             //new Printed_bill(jTextField10.getText() , jTextField1.getText()).setVisible(true);
            Printed_bill pBill = new Printed_bill(jTextField10.getText(), jTextField1.getText()) ;
            pBill.setVisible(true);
            
            //print
            PrinterJob pjob = PrinterJob.getPrinterJob();
            PageFormat preformat = pjob.defaultPage();
            preformat.setOrientation(PageFormat.LANDSCAPE);
            PageFormat postformat = pjob.pageDialog(preformat);
            //If user does not hit cancel then print.
            if (preformat != postformat) 
            {
               //Set print component
                pjob.setPrintable(new Printer(pBill), postformat);
                if (pjob.printDialog())
                  {
                try {
                    pjob.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
                }
                  }
            }
 

            reg_bill();
            new bill().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
if(sum==null || sum==0)
    JOptionPane.showMessageDialog(null, "من فضلك قم باضافة فاتوره");
else 
        new ageeel(this).setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        int  s = jTable1.getSelectedRow() ;
        if(s>-1)
        {
            bill_model.removeRow(s);
            calc_total();
        }
            else 
            JOptionPane.showMessageDialog(null, "برجاء تحديد العنصر المراد حذفه");
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
      if(jButton2.isVisible())
          jButton2ActionPerformed(evt);
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new MainPage().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables


public  void print_component (JPanel panel){
    
        Toolkit tk = panel.getToolkit();
        PrintJob pj = tk.getPrintJob(this, null, null);
        Graphics g = pj.getGraphics();
        panel.print(g);
        g.dispose();
    
    }

void calc_total (){

    sum = 0.0 ; 
    for (int i = 0; i < bill_model.getRowCount(); i++) {
        sum += Double.parseDouble(bill_model.getValueAt(i, 0).toString());
    }

jTextField10.setText(sum.toString()+" LE");

}

public void reg_bill(){

     for (int i = 0; i < bill_model.getRowCount(); i++) {
            query = "UPDATE `foxproject`.`product` SET `quantity`=quantity -"+
                    Integer.parseInt(bill_model.getValueAt(i, 1).toString())+" WHERE `barcode`='"+Integer.parseInt(bill_model.getValueAt(i, 5).toString())+"'";
      
                try {
                    DB.stmt.executeUpdate(query);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
   query = "insert into foxproject.bill (`price`,`data`,`emp_name`) values ("+sum+",'"+
                    jTextField3.getText()+"','"+jTextField2.getText()+"')";
            
        try {
           
            DB.stmt.executeUpdate(query);
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "خطأ في تسجيل الفاتوره!");
        }

}

}
