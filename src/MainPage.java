/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mohamed
 */
public class MainPage extends javax.swing.JFrame {

    
    
    public MainPage() {
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

        mainSearchLbl = new javax.swing.JLabel();
        mainSearchCBox = new javax.swing.JComboBox();
        mainSearchBtn = new javax.swing.JButton();
        mainSellBtn = new javax.swing.JButton();
        mainReprBtn = new javax.swing.JButton();
        mainCompBtn = new javax.swing.JButton();
        mainAddBtn = new javax.swing.JButton();
        mainLogOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainSearchLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainSearchLbl.setText("بحث عن:");

        mainSearchCBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainSearchCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "منتج", "شركة", "فاتورة", "تصليحات" }));

        mainSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainSearchBtn.setText("بحث");
        mainSearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSearchBtnActionPerformed(evt);
            }
        });

        mainSellBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainSellBtn.setText("بيع");
        mainSellBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainSellBtn.setPreferredSize(new java.awt.Dimension(50, 25));

        mainReprBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainReprBtn.setText("تصليح");
        mainReprBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainReprBtn.setPreferredSize(new java.awt.Dimension(50, 25));

        mainCompBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainCompBtn.setText("شركات");
        mainCompBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainCompBtn.setPreferredSize(new java.awt.Dimension(50, 25));

        mainAddBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainAddBtn.setText("اضافة");
        mainAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainAddBtn.setPreferredSize(new java.awt.Dimension(50, 25));

        mainLogOutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mainLogOutBtn.setText("خروج");
        mainLogOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainLogOutBtn.setPreferredSize(new java.awt.Dimension(50, 25));
        mainLogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainLogOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainSellBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainSearchCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mainReprBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainCompBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLogOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainSearchLbl)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainSearchLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainSearchCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(mainSellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainReprBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(mainCompBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(mainAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(mainLogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSearchBtnActionPerformed
        if (mainSearchCBox.getSelectedIndex()== 0) 
        {
            this.dispose() ;
          //  SearchProduct product  = new SearchProduct() ;
           // product.setVisible(true) ;
        }
        else if (mainSearchCBox.getSelectedIndex()== 1) 
        {
            this.dispose() ;
            //SearchCompany company = new SearchCompany() ;
            //company.setVisible(true) ;
        }
        else if (mainSearchCBox.getSelectedIndex()== 2) 
        {
            this.dispose() ;
           // SearchBill bill = new SearchBill() ;
            //bill.setVisible(true) ;
        }
        else if (mainSearchCBox.getSelectedIndex()== 3) 
        {
            this.dispose() ;
            //SearchRepair repair = new SearchRepair() ;
            //repair.setVisible(true) ;
        }
    }//GEN-LAST:event_mainSearchBtnActionPerformed

    private void mainLogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainLogOutBtnActionPerformed
         this.dispose() ;
          Login log  = new Login() ;
          log.setVisible(true) ;
    }//GEN-LAST:event_mainLogOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mainAddBtn;
    private javax.swing.JButton mainCompBtn;
    private javax.swing.JButton mainLogOutBtn;
    private javax.swing.JButton mainReprBtn;
    private javax.swing.JButton mainSearchBtn;
    private javax.swing.JComboBox mainSearchCBox;
    private javax.swing.JLabel mainSearchLbl;
    private javax.swing.JButton mainSellBtn;
    // End of variables declaration//GEN-END:variables
}
