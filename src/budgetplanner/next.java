/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetplanner;

/**
 *
 * @author tech city
 */
public class next extends javax.swing.JFrame {

    /**
     * Creates new form next
     */
    public next() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tour = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tte1 = new javax.swing.JTextField();
        tte2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        toury = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        travr = new javax.swing.JTextField();
        edur = new javax.swing.JTextField();
        eduy = new javax.swing.JTextField();
        trasum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 6, 3, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Travel & Tour Expenses :");

        tour.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Travel :");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Accomodation&Food :");

        tte1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tte1.setText("0");

        tte2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tte2.setText("0");
        tte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tte2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Income :");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Recommended expenses:");

        totin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        totin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totinActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your Expenses : ");

        toury.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        toury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                touryActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton3.setText("Next..");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        travr.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N

        edur.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        edur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edurActionPerformed(evt);
            }
        });

        eduy.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        eduy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eduyActionPerformed(evt);
            }
        });

        trasum.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Education Expenses:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recommended Education Expenses:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tour, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(564, 564, 564))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(tte1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tte2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(126, 126, 126)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(edur, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(eduy, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(travr, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toury, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(trasum, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(travr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toury, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(trasum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eduy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(76, 76, 76))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourActionPerformed

    private void tte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tte2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tte2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String ttee1=tte1.getText();
        int tte1 = Integer.parseInt(ttee1);
        
        String ttee2=tte2.getText();
        int tte2 = Integer.parseInt(ttee2);
                       
        int total;
        total = tte1+tte2;
        
        String totale = String.valueOf(total);
        tour.setText(totale);
        
       toury.setText(totale);
            
             
       String trare = travr.getText();
       double tra;
        tra  = Double.parseDouble(trare);
        if(total == tra ){
            trasum.setText("Your travelling and tour expenses is good!!\nCarry on");
        }
        else if(total > tra){
             trasum.setText("Your travelling and tour expenses is more!!\n Please concentrate on it..I think you are a travelfreak!!");
        }
        else{
             trasum.setText("You are spending less in travel and tour expenses...You can enjoy by making plans to tours and keep your mind relaxed");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        next1 n = new next1();
        n.setVisible(true);
                
        String persav = totin.getText();
        n.totin.setText(persav);
        int pertotal = Integer.parseInt(persav);
        double perloan = 0.1*pertotal;
        String perloans = String.valueOf(perloan);
        n.loanr.setText(perloans);
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void edurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edurActionPerformed

    private void eduyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eduyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eduyActionPerformed

    private void touryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_touryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_touryActionPerformed

    private void totinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totinActionPerformed

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
            java.util.logging.Logger.getLogger(next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(next.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new next().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField edur;
    private javax.swing.JTextField eduy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField totin;
    public static javax.swing.JTextField tour;
    public static javax.swing.JTextField toury;
    private javax.swing.JTextField trasum;
    public static javax.swing.JTextField travr;
    public static javax.swing.JTextField tte1;
    public static javax.swing.JTextField tte2;
    // End of variables declaration//GEN-END:variables
}
