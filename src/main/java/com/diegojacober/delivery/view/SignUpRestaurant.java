package com.diegojacober.delivery.view;

import com.diegojacober.delivery.controller.RestaurantController;
import com.diegojacober.delivery.model.RestaurantModel;
import java.time.LocalDateTime;


public class SignUpRestaurant extends javax.swing.JFrame {
   
    private RestaurantController controller = new RestaurantController();
    
    public SignUpRestaurant() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jplLeft = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jplRight = new javax.swing.JPanel();
        lbSignUp = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtfRestaurantName = new javax.swing.JTextField();
        jlPassword = new javax.swing.JLabel();
        jbtnRegister = new javax.swing.JButton();
        jlLoginMessage = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jtfEmail = new javax.swing.JTextField();
        jlEmail1 = new javax.swing.JLabel();
        jlEmail2 = new javax.swing.JLabel();
        jtfPasswordField = new javax.swing.JTextField();
        jtfRestaurantPositionX = new javax.swing.JTextField();
        jlEmail3 = new javax.swing.JLabel();
        jtfRestaurantPositionY = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplLeft.setBackground(new java.awt.Color(0, 102, 102));
        jplLeft.setForeground(new java.awt.Color(51, 51, 51));
        jplLeft.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/delivery.png"))); // NOI18N

        javax.swing.GroupLayout jplLeftLayout = new javax.swing.GroupLayout(jplLeft);
        jplLeft.setLayout(jplLeftLayout);
        jplLeftLayout.setHorizontalGroup(
            jplLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jplLeftLayout.setVerticalGroup(
            jplLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplLeftLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(85, 85, 85))
        );

        jplRight.setBackground(new java.awt.Color(255, 255, 255));
        jplRight.setForeground(new java.awt.Color(51, 51, 51));

        lbSignUp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbSignUp.setForeground(new java.awt.Color(0, 102, 102));
        lbSignUp.setText("SIGN UP RESTAURANT");

        jlEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail.setText("Restaurant Name");

        jtfRestaurantName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfRestaurantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRestaurantNameActionPerformed(evt);
            }
        });

        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jbtnRegister.setBackground(new java.awt.Color(0, 102, 102));
        jbtnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnRegister.setForeground(new java.awt.Color(255, 255, 255));
        jbtnRegister.setText("Register");
        jbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterActionPerformed(evt);
            }
        });

        jlLoginMessage.setForeground(new java.awt.Color(51, 51, 51));
        jlLoginMessage.setText("i've an account");

        jbtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLogin.setForeground(new java.awt.Color(0, 102, 102));
        jbtnLogin.setText("Login");
        jbtnLogin.setBorder(null);
        jbtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        jtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        jlEmail1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail1.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail1.setText("E-mail");

        jlEmail2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail2.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail2.setText("Position X");

        jtfPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordFieldActionPerformed(evt);
            }
        });

        jtfRestaurantPositionX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfRestaurantPositionX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRestaurantPositionXActionPerformed(evt);
            }
        });

        jlEmail3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail3.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail3.setText("Position Y");

        jtfRestaurantPositionY.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfRestaurantPositionY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRestaurantPositionYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplRightLayout = new javax.swing.GroupLayout(jplRight);
        jplRight.setLayout(jplRightLayout);
        jplRightLayout.setHorizontalGroup(
            jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplRightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfRestaurantPositionY, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplRightLayout.createSequentialGroup()
                        .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlLoginMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLogin))
                    .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlEmail)
                        .addComponent(jlEmail1)
                        .addComponent(jlPassword)
                        .addComponent(jlEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfRestaurantName)
                        .addComponent(jtfEmail)
                        .addComponent(jtfPasswordField)
                        .addComponent(jlEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfRestaurantPositionX, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jplRightLayout.setVerticalGroup(
            jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplRightLayout.createSequentialGroup()
                .addComponent(lbSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfRestaurantPositionX, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmail3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRestaurantPositionY, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginMessage)
                    .addComponent(jbtnLogin)
                    .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jplLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jplRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jplLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jplRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRestaurantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRestaurantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRestaurantNameActionPerformed

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed

        //Criar usuario atraves da api com a role de restaurant
        //        jtfRestaurantName.getText();
        //        jtfEmail.getText();
        //        jtfPasswordField.getText();
        
        //criar restaurante
        RestaurantModel newRestaurant = new RestaurantModel(null, jtfRestaurantName.getText(), LocalDateTime.now(), jtfRestaurantPositionX.getText(), jtfRestaurantPositionY.getText());
        controller.controllerSave(newRestaurant);
        //fazer login na api

    }//GEN-LAST:event_jbtnRegisterActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        Login LoginFrame = new Login();

        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jtfPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPasswordFieldActionPerformed

    private void jtfRestaurantPositionXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRestaurantPositionXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRestaurantPositionXActionPerformed

    private void jtfRestaurantPositionYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRestaurantPositionYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfRestaurantPositionYActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnRegister;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEmail2;
    private javax.swing.JLabel jlEmail3;
    private javax.swing.JLabel jlLoginMessage;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JPanel jplLeft;
    private javax.swing.JPanel jplRight;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfPasswordField;
    private javax.swing.JTextField jtfRestaurantName;
    private javax.swing.JTextField jtfRestaurantPositionX;
    private javax.swing.JTextField jtfRestaurantPositionY;
    private javax.swing.JLabel lbSignUp;
    // End of variables declaration//GEN-END:variables
}
