/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed
 */
public class SearchBill extends javax.swing.JFrame {

    DB dbase = new DB() ;
    DefaultTableModel model ;
    
    public SearchBill() {
        initComponents();
        DB.initializeconnection();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        searchBillLbl.setText("رقم الفاتورة:");

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
        ));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noSearchBillBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBillBtn))
                    .addComponent(searchBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(billMainBtn)
                .addContainerGap(277, Short.MAX_VALUE))
            .addComponent(jScrollPaneBill)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBillLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBillTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noSearchBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPaneBill, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(billMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noSearchBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSearchBillBtnActionPerformed
        searchBillTxt.setText(null);
        model.setRowCount(0);
    }//GEN-LAST:event_noSearchBillBtnActionPerformed

    private void searchBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBillBtnActionPerformed
        Object[] row = new Object[4] ;
        String query = "Select * from bill where ID = '" + searchBillTxt.getText() + "'" ;
        
        try 
        {
            dbase.rset = DB.stmt.executeQuery(query) ;
            if (!dbase.rset.next())
            {
                JOptionPane.showMessageDialog(null,"no search result, ID may be wrong ");
            }
            
            else
            {
                
            row[3] = dbase.rset.getString(1) ;
            row[2] = dbase.rset.getString(4) ;
            row[1] = dbase.rset.getDate(3) ;
            row[0] = dbase.rset.getDouble(2) ;
                
                  model = (DefaultTableModel) searchBillTbl.getModel() ;
                  model.addRow(row) ;
                
            }
        }
        
        catch (SQLException ex) 
        {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
        }
    }//GEN-LAST:event_searchBillBtnActionPerformed

    private void searchBillTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBillTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBillTxtActionPerformed

    private void billMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billMainBtnActionPerformed
        this.dispose();
        MainPage main = new MainPage() ;
        main.setVisible(true) ;
    }//GEN-LAST:event_billMainBtnActionPerformed

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
    private javax.swing.JScrollPane jScrollPaneBill;
    private javax.swing.JButton noSearchBillBtn;
    private javax.swing.JButton searchBillBtn;
    private javax.swing.JLabel searchBillLbl;
    private javax.swing.JTable searchBillTbl;
    private javax.swing.JTextField searchBillTxt;
    // End of variables declaration//GEN-END:variables
}
