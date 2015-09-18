/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class SearchRepair extends javax.swing.JFrame {

    DB db = new DB() ;
    DefaultTableModel model ;
    ResultSet rset;
    String query;
    
    public SearchRepair() {
        initComponents();
        
        try{
			UIManager.setLookAndFeel("com.easynth.lookandfeel.EaSynthLookAndFeel")	;
			SwingUtilities.updateComponentTreeUI(this);
			}catch(Exception e){e.printStackTrace();
    }
        
        DB.initializeconnection();
        recieptLabel.hide();
        reprConfirmCbox.hide();
        reprConfirmBtn.hide();
    }
    
    private void search(String query)
    {
        Object[] row = new Object[10] ;
        
        try 
        {
            rset = DB.stmt.executeQuery(query) ;
            if (!rset.next())
            {
                JOptionPane.showMessageDialog(null,"لا يوجد بيانات");
            }
            
            else
            {
                do{
                    row[9] = rset.getString(1) ;   
                    row[8] = rset.getString(2) ;
                    row[7] = rset.getString(9) ;
                    row[6] = rset.getString(3) ;
                    row[5] = rset.getString(5) ;
                    row[4] = rset.getString(4) ;
                    row[3] = rset.getString(6) ;
                    row[2] = rset.getString(7) ;
                    row[0] = rset.getString(8) ;
            
                  if(!row[3].toString().equals("") && !row[2].toString().equals(""))
                    {
                      row[1] = Double.parseDouble(row[3].toString())  - Double.parseDouble(row[2].toString()) ;
                    }
                 else 
                   {
                      row[1] = row[3] ;
                   }
                
                  model = (DefaultTableModel) searchReprTbl.getModel() ;
                  if(!db.ValueIsExist(searchReprTbl, 9 , row[9].toString()))
                  {
                      model.addRow(row) ;
                  }
                 
                  if(row[4]== null ||row[4].equals(""))
                    {
                        recieptLabel.setVisible(true);
                        reprConfirmCbox.setVisible(true);
                        reprConfirmBtn.setVisible(true);
                        
                        boolean exist = false ;
                        for(int i=0; i<reprConfirmCbox.getItemCount(); i++)
                            {
                              if (reprConfirmCbox.getItemAt(i).toString().equalsIgnoreCase(rset.getString(1)))
                                 {
                                    exist = true ;
                                    break;
                                 }
                        
                            }
                        
                        if (!exist)
                          {
                             reprConfirmCbox.addItem(rset.getString(1));
                          }
                                
                     }
                  
                }while (rset.next());
                
            }//end else
            
        }//end try
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JPanel(), "خطأ فى الاتصال بقاعدة البيانات.. تأكد من تشغيل السيرفر", "Error", JOptionPane.ERROR_MESSAGE);
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
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        searchReprTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReprTxtActionPerformed(evt);
            }
        });
        getContentPane().add(searchReprTxt);
        searchReprTxt.setBounds(400, 20, 180, 24);

        searchReprLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchReprLbl.setText("بحث بواسطة :");
        getContentPane().add(searchReprLbl);
        searchReprLbl.setBounds(710, 20, 120, 24);

        searchReprBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchReprBtn.setText("بحث");
        searchReprBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchReprBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchReprBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchReprBtn);
        searchReprBtn.setBounds(520, 70, 63, 30);

        noSearchReprBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noSearchReprBtn.setText("عميل جديد");
        noSearchReprBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noSearchReprBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSearchReprBtnActionPerformed(evt);
            }
        });
        getContentPane().add(noSearchReprBtn);
        noSearchReprBtn.setBounds(400, 70, 103, 30);

        searchReprTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "اسم العامل", "المتبقى", "المدفوع", "التكلفة", "تاريخ التسليم", "تاريخ الاستلام", "العطل", "رقم التليفون", "اسم العميل", "كود العميل"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchReprTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchReprTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReprTblMouseClicked(evt);
            }
        });
        jScrollPaneRepr.setViewportView(searchReprTbl);
        searchReprTbl.getColumnModel().getColumn(0).setPreferredWidth(130);
        searchReprTbl.getColumnModel().getColumn(4).setPreferredWidth(140);
        searchReprTbl.getColumnModel().getColumn(5).setPreferredWidth(140);
        searchReprTbl.getColumnModel().getColumn(7).setPreferredWidth(100);
        searchReprTbl.getColumnModel().getColumn(8).setPreferredWidth(130);

        getContentPane().add(jScrollPaneRepr);
        jScrollPaneRepr.setBounds(0, 159, 930, 220);

        reprMainBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reprMainBtn.setText("القائمة الرئيسية");
        reprMainBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reprMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprMainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reprMainBtn);
        reprMainBtn.setBounds(380, 410, 137, 42);

        reprConfirmCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprConfirmCboxActionPerformed(evt);
            }
        });
        getContentPane().add(reprConfirmCbox);
        reprConfirmCbox.setBounds(130, 20, 60, 30);

        reprConfirmBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reprConfirmBtn.setText("تأكيد");
        reprConfirmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reprConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reprConfirmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reprConfirmBtn);
        reprConfirmBtn.setBounds(30, 20, 70, 30);

        recieptLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recieptLabel.setText("تسليم لعميل رقم:");
        getContentPane().add(recieptLabel);
        recieptLabel.setBounds(200, 20, 130, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "كود العميل", "اسم العميل", "الكل" }));
        jComboBox1.setMinimumSize(new java.awt.Dimension(56, 15));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(586, 20, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchReprTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReprTxtActionPerformed
        searchReprBtnActionPerformed(evt) ;
    }//GEN-LAST:event_searchReprTxtActionPerformed

    private void searchReprBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchReprBtnActionPerformed

        if(jComboBox1.getSelectedIndex() == 0)
        {
            query = "Select * from repair where code = '" + searchReprTxt.getText() + "'" ;
            if(!db.ValueIsExist(searchReprTbl, 9 , searchReprTxt.getText()))
            {
                search(query);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"تم البحث بالفعل");
            }
            
        }//end if of index 0
        
        else if(jComboBox1.getSelectedIndex() == 1)
        {
            query = "Select * from repair where agent_name = '" + searchReprTxt.getText() + "'" ;
            search(query);
            
        }//end if of index 1
        
        else if(jComboBox1.getSelectedIndex() == 2)
        {
            query = "Select * from repair " ;
            search(query);
            
        }//end if of index 2
        
    }//GEN-LAST:event_searchReprBtnActionPerformed

    private void noSearchReprBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSearchReprBtnActionPerformed
        searchReprTxt.setText(null);
        recieptLabel.setVisible(false);
        reprConfirmCbox.setVisible(false);
        reprConfirmBtn.setVisible(false);
        model.setRowCount(0);
        reprConfirmCbox.removeAllItems();
    }//GEN-LAST:event_noSearchReprBtnActionPerformed

    private void reprMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprMainBtnActionPerformed
        
        new MainPage().setVisible(true) ;
        this.dispose();
    }//GEN-LAST:event_reprMainBtnActionPerformed

    private void repairAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairAddBtnActionPerformed
        
        new estlam().setVisible(true) ;
        this.dispose() ;
    }//GEN-LAST:event_repairAddBtnActionPerformed

    private void reprConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprConfirmBtnActionPerformed
        if (searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 4)== null||searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 4).equals(""))         
        {
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
            query = "UPDATE repair SET reset_data = '" + timeStamp + "', paid = '" + searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 3) + "' where code = '" + reprConfirmCbox.getSelectedItem().toString() + "'";
            try {
                int rowCount = DB.stmt.executeUpdate(query);
                if(rowCount == 0)
                {
                    JOptionPane.showMessageDialog(new JPanel(), "خطأ فى تحديث البانات", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                  searchReprTbl.setValueAt(timeStamp, db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 4);
                  searchReprTbl.setValueAt(searchReprTbl.getValueAt(db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 3), db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 2);
                  searchReprTbl.setValueAt(0.0, db.returnRowIndexForValue(searchReprTbl,9, reprConfirmCbox.getSelectedItem().toString()), 1);
                  JOptionPane.showMessageDialog(null, "تم التسليم بنجاح", "Success", 2, new ImageIcon("Ok.png"));
                  reprConfirmCbox.removeItemAt(reprConfirmCbox.getSelectedIndex());
                }
                
              }
            
            catch (SQLException ex) 
            {
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(new JPanel(), "خطأ فى الاتصال بقاعدة البيانات.. تأكد من تشغيل السيرفر", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        else 
          {
            JOptionPane.showMessageDialog(null, "تم التسليم بالفعل");
          }

    }//GEN-LAST:event_reprConfirmBtnActionPerformed

    private void reprConfirmCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reprConfirmCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reprConfirmCboxActionPerformed

    private void searchReprTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReprTblMouseClicked
        reprConfirmBtn.setVisible(true);
    }//GEN-LAST:event_searchReprTblMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0 || jComboBox1.getSelectedIndex() == 1)
        {
            searchReprTxt.setText(null);
            searchReprTxt.setVisible(true);
        }
        else
        {
            searchReprTxt.setText(null);
            searchReprTxt.setVisible(false);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private javax.swing.JComboBox jComboBox1;
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
