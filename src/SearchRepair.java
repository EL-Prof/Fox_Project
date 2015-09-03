/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class SearchRepair extends javax.swing.JFrame {

    DB db = new DB() ;
    DefaultTableModel model ;
    
    public SearchRepair() {
        initComponents();
        DB.initializeconnection();
        recieptLabel.hide();
        reprConfirmCbox.hide();
        reprConfirmBtn.hide();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchReprTxt = new javax.swing.JTextField();
        searchReprLbl = new javax.swing.JLabel();
        searchReprBtn = new javax.swing.JButton();
        noSearchReprBtn = new javax.swing.JButton();
        jScrollPaneRepr = new javax.swing.JScrollPane();
        searchReprTbl = new javax.swing.JTable();
        reprMainBtn = new javax.swing.JButton();
        reprConfirmCbox = new javax.swing.JComboBox();
        reprConfirmBtn = new javax.swing.JButton();
        recieptLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 430));
        getContentPane().setLayout(null);

        searchReprTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReprTxtActionPerformed(evt);
            }
        });
        getContentPane().add(searchReprTxt);
        searchReprTxt.setBounds(463, 24, 180, 24);

        searchReprLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchReprLbl.setText("كود العميل:");
        getContentPane().add(searchReprLbl);
        searchReprLbl.setBounds(653, 22, 87, 24);

        searchReprBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchReprBtn.setText("بحث");
        searchReprBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchReprBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReprBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchReprBtn);
        searchReprBtn.setBounds(580, 70, 63, 30);

        noSearchReprBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noSearchReprBtn.setText("عميل جديد");
        noSearchReprBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noSearchReprBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSearchReprBtnActionPerformed(evt);
            }
        });
        getContentPane().add(noSearchReprBtn);
        noSearchReprBtn.setBounds(467, 70, 103, 30);

        searchReprTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم العامل", "المتبقى", "المدفوع", "التكلفة", "تاريخ التسليم", "تاريخ الاستلام", "العطل", "اسم العميل", "كود العميل"
            }
        ));
        searchReprTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneRepr.setViewportView(searchReprTbl);

        getContentPane().add(jScrollPaneRepr);
        jScrollPaneRepr.setBounds(0, 159, 840, 127);

        reprMainBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reprMainBtn.setText("القائمة الرئيسية");
        reprMainBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reprMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprMainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reprMainBtn);
        reprMainBtn.setBounds(280, 330, 137, 42);

        getContentPane().add(reprConfirmCbox);
        reprConfirmCbox.setBounds(240, 20, 60, 30);

        reprConfirmBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reprConfirmBtn.setText("تأكيد");
        reprConfirmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reprConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprConfirmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reprConfirmBtn);
        reprConfirmBtn.setBounds(140, 20, 70, 30);

        recieptLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recieptLabel.setText("تسليم لعميل رقم:");
        getContentPane().add(recieptLabel);
        recieptLabel.setBounds(310, 20, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchReprTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReprTxtActionPerformed
        searchReprBtnActionPerformed(evt) ;
    }//GEN-LAST:event_searchReprTxtActionPerformed

    private void searchReprBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReprBtnActionPerformed
        if(!db.ValueIsExist(searchReprTbl, 8 , searchReprTxt.getText()))
        {
        Object[] row = new Object[9] ;
        String query = "Select * from repair where code = '" + searchReprTxt.getText() + "'" ;
        
        try 
        {
            db.rset = DB.stmt.executeQuery(query) ;
            System.out.println(query);
            if (!db.rset.next())
            {
                JOptionPane.showMessageDialog(null,"no search result, code may be wrong ");
            }
            
            else
            {
                
            row[8] = db.rset.getString(1) ;
            row[7] = db.rset.getString(2) ;
            row[6] = db.rset.getString(3) ;
            row[5] = db.rset.getString(5) ;
            row[4] = db.rset.getString(4) ;
            row[3] = db.rset.getString(6) ;
            row[2] = db.rset.getString(7) ;
            row[1] = Double.parseDouble(row[3].toString())  - Double.parseDouble(row[2].toString()) ;
            row[0] = db.rset.getString(8) ;
                
                  model = (DefaultTableModel) searchReprTbl.getModel() ;
                  model.addRow(row) ;
                  
                  if(row[4] == null || row[4].equals(""))
                    {
                        recieptLabel.setVisible(true);
                        reprConfirmCbox.setVisible(true);
                        reprConfirmBtn.setVisible(true);
                        
                        boolean exist = false ;
                        for(int i=0; i<reprConfirmCbox.getItemCount(); i++)
                            {
                              if (reprConfirmCbox.getItemAt(i).toString().equalsIgnoreCase(db.rset.getString(1)))
                                 {
                                    exist = true ;
                                    break;
                                 }
                        
                            }
                        
                        if (!exist)
                          {
                             reprConfirmCbox.addItem(db.rset.getString(1));
                          }
                                
                    }
                
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
        }
        
      }
        else
        {
            JOptionPane.showMessageDialog(null,"تم البحث بالفعل");
        }
        
    }//GEN-LAST:event_searchReprBtnActionPerformed

    private void noSearchReprBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSearchReprBtnActionPerformed
        searchReprTxt.setText(null);
        recieptLabel.setVisible(false);
        reprConfirmCbox.setVisible(false);
        reprConfirmBtn.setVisible(false);
        if(model != null)
        model.setRowCount(0);
        reprConfirmCbox.removeAllItems();
    }//GEN-LAST:event_noSearchReprBtnActionPerformed

    private void reprMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprMainBtnActionPerformed
        this.dispose();
        MainPage main = new MainPage() ;
        main.setVisible(true) ;
    }//GEN-LAST:event_reprMainBtnActionPerformed

    private void repairAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairAddBtnActionPerformed
        this.dispose() ;
        estlam repr = new estlam() ;
        repr.setVisible(true) ;
    }//GEN-LAST:event_repairAddBtnActionPerformed

    private void reprConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprConfirmBtnActionPerformed
        if (searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 4).equals(""))
        {
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            String query = "UPDATE repair SET reset_data = '" + timeStamp + "', paid = '" + searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 3) + "' where code = '" + reprConfirmCbox.getSelectedItem().toString() + "'";
            try {
                int rowCount = DB.stmt.executeUpdate(query);
                System.out.println(rowCount);
                if(rowCount == 0)
                {
                    JOptionPane.showMessageDialog(new JPanel(), "خطأ فى تحديث البانات", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                  searchReprTbl.setValueAt(timeStamp, db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 4);
                  searchReprTbl.setValueAt(searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 3), db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 2);
                  searchReprTbl.setValueAt(0.0, db.returnRowIndexForValue(searchReprTbl,8, reprConfirmCbox.getSelectedItem().toString()), 1);
                  JOptionPane.showMessageDialog(null, "تم التسليم بنجاح", "Success", 2, new ImageIcon("Ok.png"));
                }
                
                } catch (SQLException ex) {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error " + ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(null, "تم التسليم بالفعل");
        }

    }//GEN-LAST:event_reprConfirmBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchRepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRepair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchRepair().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPaneRepr;
    private javax.swing.JButton noSearchReprBtn;
    private javax.swing.JLabel recieptLabel;
    private javax.swing.JButton reprConfirmBtn;
    private javax.swing.JComboBox reprConfirmCbox;
    private javax.swing.JButton reprMainBtn;
    private javax.swing.JButton searchReprBtn;
    private javax.swing.JLabel searchReprLbl;
    private javax.swing.JTable searchReprTbl;
    private javax.swing.JTextField searchReprTxt;
    // End of variables declaration//GEN-END:variables
}
