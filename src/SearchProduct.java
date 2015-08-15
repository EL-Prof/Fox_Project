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
public class SearchProduct extends javax.swing.JFrame {

    DB dbase = new DB() ;
    DefaultTableModel model ;
    
    public SearchProduct() {
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

        noSearchProBtn = new javax.swing.JButton();
        searchProBtn = new javax.swing.JButton();
        searchProLbl = new javax.swing.JLabel();
        jScrollPanePro = new javax.swing.JScrollPane();
        searchProTbl = new javax.swing.JTable();
        proMainBtn = new javax.swing.JButton();
        searchProCBox = new javax.swing.JComboBox();
        searchProTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        noSearchProBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noSearchProBtn.setText("منتج اخر");
        noSearchProBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noSearchProBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSearchProBtnActionPerformed(evt);
            }
        });

        searchProBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchProBtn.setText("بحث");
        searchProBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchProBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProBtnActionPerformed(evt);
            }
        });

        searchProLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchProLbl.setText("بحث بواسطة:");

        searchProTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الكمية", "سعر البيع", "سعر الجملة", "الباركود", "النوع", "اسم المنتج"
            }
        ));
        searchProTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPanePro.setViewportView(searchProTbl);

        proMainBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proMainBtn.setText("القائمة الرئيسية");
        proMainBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proMainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proMainBtnActionPerformed(evt);
            }
        });

        searchProCBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchProCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "الباركود", "اسم المنتج", "نوع المنتج", "" }));
        searchProCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProCBoxActionPerformed(evt);
            }
        });

        searchProTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanePro, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchProTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchProCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchProLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(proMainBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(noSearchProBtn)
                .addGap(60, 60, 60)
                .addComponent(searchProBtn)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchProLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noSearchProBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPanePro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proMainBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noSearchProBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSearchProBtnActionPerformed
        searchProTxt.setText(null);
        model.setRowCount(0);
    }//GEN-LAST:event_noSearchProBtnActionPerformed

    private void searchProBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProBtnActionPerformed
        if (searchProCBox.getSelectedIndex()== 0) 
        {
           Object[] row = new Object[6] ;
           String query = "Select * from product where barcode = '" + searchProTxt.getText() + "'" ;  
        
        try 
        {
            dbase.rset = DB.stmt.executeQuery(query) ;
            System.out.println(query);
            if (!dbase.rset.next())
            {
                JOptionPane.showMessageDialog(null,"no search result, product not found ");
            }
            
            else
            {
                do
                {
                  row[5] = dbase.rset.getString(2) ;
                  row[4] = dbase.rset.getString(3) ;
                  row[3] = dbase.rset.getString(1) ;
                  row[2] = dbase.rset.getDouble(5) ;
                  row[1] = dbase.rset.getDouble(6) ;
                  row[0] = dbase.rset.getLong(4) ;
                
                  model = (DefaultTableModel) searchProTbl.getModel() ;
                  model.addRow(row) ;
                } while(dbase.rset.next());
            }
       }
        
        catch (SQLException ex) 
         {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
         }
        
        }
        else if (searchProCBox.getSelectedIndex()== 1)
        {
           Object[] row = new Object[6] ;
           String query = "Select * from product where name = '" + searchProTxt.getText() + "'" ;  
        
        try 
        {
            dbase.rset = DB.stmt.executeQuery(query) ;
            System.out.println(query);
            if (!dbase.rset.next())
            {
                JOptionPane.showMessageDialog(null,"no search result, product not found ");
            }
            
            else
            {
                do
                {
                  row[5] = dbase.rset.getString(2) ;
                  row[4] = dbase.rset.getString(3) ;
                  row[3] = dbase.rset.getString(1) ;
                  row[2] = dbase.rset.getDouble(5) ;
                  row[1] = dbase.rset.getDouble(6) ;
                  row[0] = dbase.rset.getLong(4) ;
                
                  model = (DefaultTableModel) searchProTbl.getModel() ;
                  model.addRow(row) ;
                } while(dbase.rset.next());
            }
       }
        
        catch (SQLException ex) 
         {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
         }
            
        }
      
        /*
        else if (searchProCBox.getSelectedIndex()== 2)
        {
           String query = "Select * from product where type = '" + searchProTxt.getText() + "'" ;  
            try {
                dbase.rset = dbase.stmt.executeQuery(query) ;
                searchProTbl.setModel(DbUtils.resultSetToTableModel(dbase.rset));
            }
            catch (SQLException ex) {
                Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex.getMessage());
            }
             
            */
        
        else if (searchProCBox.getSelectedIndex()== 2)
       {
           Object[] row = new Object[6] ;
           String query = "Select * from product where type = '" + searchProTxt.getText() + "'" ;  
        
        try 
        {
            dbase.rset = DB.stmt.executeQuery(query) ;
            System.out.println(query);
            if (!dbase.rset.next())
            {
                JOptionPane.showMessageDialog(null,"no search result, product not found ");
            }
            
            else
            {
                do
                {
                  row[5] = dbase.rset.getString(2) ;
                  row[4] = dbase.rset.getString(3) ;
                  row[3] = dbase.rset.getString(1) ;
                  row[2] = dbase.rset.getDouble(5) ;
                  row[1] = dbase.rset.getDouble(6) ;
                  row[0] = dbase.rset.getLong(4) ;
                
                  model = (DefaultTableModel) searchProTbl.getModel() ;
                  model.addRow(row) ;
                } while(dbase.rset.next());
            }
       }
        
        catch (SQLException ex) 
         {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error "+ex.getMessage());
         }
        
     }
    
       
    
    }//GEN-LAST:event_searchProBtnActionPerformed

    private void proMainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proMainBtnActionPerformed
        this.dispose();
        MainPage main = new MainPage() ;
        main.setVisible(true) ;
    }//GEN-LAST:event_proMainBtnActionPerformed

    private void searchProCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProCBoxActionPerformed

    private void searchProTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchProTxtActionPerformed

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
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchProduct().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPanePro;
    private javax.swing.JButton noSearchProBtn;
    private javax.swing.JButton proMainBtn;
    private javax.swing.JButton searchProBtn;
    private javax.swing.JComboBox searchProCBox;
    private javax.swing.JLabel searchProLbl;
    private javax.swing.JTable searchProTbl;
    private javax.swing.JTextField searchProTxt;
    // End of variables declaration//GEN-END:variables
}
