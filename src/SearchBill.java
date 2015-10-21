/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class SearchBill extends javax.swing.JFrame {

    DB dbase = new DB() ;
   DefaultTableModel model ;
    ResultSet rset;
    String query;
     ByteArrayInputStream bais;
     ObjectInputStream ins;
      String   qu ;
    public SearchBill() {
        initComponents();
        
        
        searchBillTbl.addMouseListener(new MouseAdapter() {
    public void mousePressed(MouseEvent me) {
        JTable table =(JTable) me.getSource();
        Point p = me.getPoint();
        int row = table.rowAtPoint(p);
        if (me.getClickCount() == 2) {
            System.out.println("I am here " + searchBillTbl.getSelectedRow());
            
              qu = "Select details from bill where ID ="+ model.getValueAt(searchBillTbl.getSelectedRow(), 3).toString()  ;
        try {
         rset =    DB.stmt.executeQuery(qu);
         rset.next();
       //  obj = rs.getObject(1) ; 
         byte[] buf = rset.getBytes(1);
         ObjectInputStream objectIn = null;
		if (buf != null)
			objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));

		Object deSerializedObject = objectIn.readObject();
         new Bill_details((DefaultTableModel) deSerializedObject).setVisible(true) ;
            
        } 
        catch(Exception e){
        
            System.out.println(e.getMessage());
        
        }

        }
    }
});
        
        
        
        
        
        
        
        
        
        
    }
    
    private void search(String q)
    {
        double sum = 0 ;
            try {
                rset = DB.stmt.executeQuery(q);
                if(!rset.next())
                {
                   JOptionPane.showMessageDialog(null,"لا يوجد مبيعات بهذا التاريخ"); 
                   jTextField1.setText(null);
                }
                else
                {
                    do
                    {
                        sum = sum + Double.parseDouble(rset.getString("price")) ;
                    }while(rset.next());
                    
                   jTextField1.setText(Double.toString(sum)+" LE");
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(SearchBill.class.getName()).log(Level.SEVERE, null, ex);
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

        noSearchBillBtn = new javax.swing.JButton();
        searchBillBtn = new javax.swing.JButton();
        searchBillLbl = new javax.swing.JLabel();
        searchBillTxt = new javax.swing.JTextField();
        jScrollPaneBill = new javax.swing.JScrollPane();
        searchBillTbl = new javax.swing.JTable();
        billMainBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        noSearchBillBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noSearchBillBtn.setText("الغاء");
        noSearchBillBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noSearchBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSearchBillBtnActionPerformed(evt);
            }
        });

        searchBillBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBillBtn.setText("بحث");
        searchBillBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBillBtnActionPerformed(evt);
            }
        });

        searchBillLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchBillLbl.setText("بحث عن:");

        searchBillTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBillTxtActionPerformed(evt);
            }
        });

        searchBillTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "السعر الكلى", "التاريخ", "اسم العامل", "رقم الفاتورة"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchBillTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneBill.setViewportView(searchBillTbl);

        billMainBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billMainBtn.setText("القائمة الرئيسية");
        billMainBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billMainBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("بحث عن مبيعات:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "يوم", "شهر", "سنة" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("اليوم");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("الشهر");

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("السنة");

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("الغاء");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("بحث");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 51, 51));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "فاتورة", "الكل" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("رقم الفاتوره:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneBill, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(68, 68, 68)
                                    .addComponent(jButton2))
                                .addComponent(billMainBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noSearchBillBtn)
                        .addGap(56, 56, 56)
                        .addComponent(searchBillBtn))
                    .addComponent(searchBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noSearchBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPaneBill, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noSearchBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSearchBillBtnActionPerformed
        searchBillTxt.setText(null);
        if(model!= null)
        model.setRowCount(0);
    }//GEN-LAST:event_noSearchBillBtnActionPerformed
    
    private void searchBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBillBtnActionPerformed
        if(jComboBox5.getSelectedIndex() == 0)
        {
        if(searchBillTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"من فضلك ادخل رقم الفاتورة");
        }
        else
        {
        if(!dbase.ValueIsExist(searchBillTbl, 3 , searchBillTxt.getText()))
        {
        Object[] row = new Object[4] ;
        query = "Select * from bill where ID = '" + searchBillTxt.getText() + "'" ;
        
        try 
        {
            rset = DB.stmt.executeQuery(query) ;
            if (!rset.next())
            {
                JOptionPane.showMessageDialog(null,"لا يوجد فاتورة بهذا الرقم");
                searchBillTxt.setText(null);
            }
            
            else
            {
                
                row[3] = rset.getString(1) ;
                row[2] = rset.getString(4) ;
                row[1] = rset.getString(3);
                row[0] = rset.getDouble(2) ;
                
                model = (DefaultTableModel) searchBillTbl.getModel() ;
                model.addRow(row) ;
               
             
            }
        }
        
        catch (Exception ex) 
        {
            
            JOptionPane.showMessageDialog(new JPanel(), "خطأ فى الاتصال بقاعدة البيانات.. تأكد من تشغيل السيرفر", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"تم البحث بالفعل");
        }
        
      }
        }//end if
        
        else if(jComboBox5.getSelectedIndex()==1)
        {
            Object[] row = new Object[4] ;
        query = "Select * from bill ORDER by ID DESC " ;
        
        try 
        {
            rset = DB.stmt.executeQuery(query) ;
            if (!rset.next())
            {
                JOptionPane.showMessageDialog(null,"لا يوجد فواتير");   
            }
            
            else
            {
                do
                {
                row[3] = rset.getString(1) ;
                row[2] = rset.getString(4) ;
                row[1] = rset.getString(3);
                row[0] = rset.getDouble(2) ;
                
                model = (DefaultTableModel) searchBillTbl.getModel() ;
                if (!dbase.ValueIsExist(searchBillTbl, 3 , row[3].toString()))
                {
                    model.addRow(row) ;
                }
                
                }while(rset.next()) ;
            }
        }
        
          catch (Exception ex) 
          {
            JOptionPane.showMessageDialog(new JPanel(), "خطأ فى الاتصال بقاعدة البيانات.. تأكد من تشغيل السيرفر", "Error", JOptionPane.ERROR_MESSAGE);
          }
        
        }
        
        
    }//GEN-LAST:event_searchBillBtnActionPerformed

    private void searchBillTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBillTxtActionPerformed
          searchBillBtnActionPerformed(evt) ;        
         
    }//GEN-LAST:event_searchBillTxtActionPerformed

    private void billMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billMainBtnActionPerformed
        this.dispose();
        MainPage main = new MainPage() ;
        main.setVisible(true) ;
    }//GEN-LAST:event_billMainBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MainPage().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jLabel2.setVisible(true);
        jComboBox2.setVisible(true);
        jLabel3.setVisible(true);
        jComboBox3.setVisible(true);
        
        if(jComboBox1.getSelectedIndex() == 1)
        {
            jLabel2.setVisible(false);
            jComboBox2.setVisible(false);
        }
        else if(jComboBox1.getSelectedIndex() == 2)
        {
            jLabel2.setVisible(false);
            jComboBox2.setVisible(false);
            jLabel3.setVisible(false);
            jComboBox3.setVisible(false);
        }
            
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedIndex() == 0)
        {
            query = "SELECT price from bill WHERE data = '" + jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString() + "/" + jComboBox2.getSelectedItem().toString() + "'" ;
            search(query);
        }
        
        else if(jComboBox1.getSelectedIndex() == 1)
        {
            query = "SELECT price from bill WHERE data LIKE '" + jComboBox4.getSelectedItem().toString() + "/" + jComboBox3.getSelectedItem().toString() + "/%'" ;
            search(query);
        }
            
        else if(jComboBox1.getSelectedIndex() == 2)
        {
            query = "SELECT price from bill WHERE data LIKE '" + jComboBox4.getSelectedItem().toString() + "/%'" ;
            search(query);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        if(jComboBox5.getSelectedIndex() == 0)
        {
            searchBillTxt.setEnabled(true);
            searchBillTxt.requestFocus();
        }
        else
        {
            searchBillTxt.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(SearchBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchBill().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billMainBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneBill;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton noSearchBillBtn;
    private javax.swing.JButton searchBillBtn;
    private javax.swing.JLabel searchBillLbl;
    private javax.swing.JTable searchBillTbl;
    private javax.swing.JTextField searchBillTxt;
    // End of variables declaration//GEN-END:variables



public  void show_details (){

  qu = "Select details from bill where ID ="+ model.getValueAt(searchBillTbl.getSelectedRow(), 5)  ;
        try {
         rset =    DB.stmt.executeQuery(qu);
         rset.next();
       //  obj = rs.getObject(1) ; 
         byte[] buf = rset.getBytes(1);
         ObjectInputStream objectIn = null;
		if (buf != null)
			objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));

		Object deSerializedObject = objectIn.readObject();
         new Bill_details((DefaultTableModel) deSerializedObject).setVisible(true) ;
            
        } 
        catch(Exception e){
        
            System.out.println(e.getMessage());
        
        }







}






}
