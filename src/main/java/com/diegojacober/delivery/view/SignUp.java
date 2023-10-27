package com.diegojacober.delivery.view;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.ClientPages.HomePageClient;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jplLeft = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jplRight = new javax.swing.JPanel();
        lbSignUp = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtfNewEmail = new javax.swing.JTextField();
        jlPassword = new javax.swing.JLabel();
        jNewPasswordField = new javax.swing.JPasswordField();
        jbtnRegister = new javax.swing.JButton();
        jlLoginMessage = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jtfFullName = new javax.swing.JTextField();
        jlEmail1 = new javax.swing.JLabel();
        jlRegisterRestaurantMessage = new javax.swing.JLabel();
        jbtnRegisterRestaurant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(null);

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
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(85, 85, 85))
        );

        jPanel3.add(jplLeft);
        jplLeft.setBounds(0, 0, 400, 500);

        jplRight.setBackground(new java.awt.Color(255, 255, 255));
        jplRight.setForeground(new java.awt.Color(51, 51, 51));

        lbSignUp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbSignUp.setForeground(new java.awt.Color(0, 102, 102));
        lbSignUp.setText("SIGN UP");

        jlEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail.setText("E-mail");

        jtfNewEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfNewEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNewEmailActionPerformed(evt);
            }
        });

        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jNewPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jNewPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewPasswordFieldActionPerformed(evt);
            }
        });

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

        jtfFullName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jtfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFullNameActionPerformed(evt);
            }
        });

        jlEmail1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail1.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail1.setText("Full Name");

        jlRegisterRestaurantMessage.setForeground(new java.awt.Color(51, 51, 51));
        jlRegisterRestaurantMessage.setText("I'm a restaurant");

        jbtnRegisterRestaurant.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegisterRestaurant.setForeground(new java.awt.Color(0, 102, 102));
        jbtnRegisterRestaurant.setText("Register restaurant");
        jbtnRegisterRestaurant.setBorder(null);
        jbtnRegisterRestaurant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnRegisterRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterRestaurantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplRightLayout = new javax.swing.GroupLayout(jplRight);
        jplRight.setLayout(jplRightLayout);
        jplRightLayout.setHorizontalGroup(
            jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSignUp)
                .addGap(130, 130, 130))
            .addGroup(jplRightLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEmail)
                    .addComponent(jtfNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEmail1)
                    .addComponent(jtfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlPassword)
                        .addComponent(jNewPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                    .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplRightLayout.createSequentialGroup()
                        .addComponent(jlLoginMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLogin))
                    .addGroup(jplRightLayout.createSequentialGroup()
                        .addComponent(jlRegisterRestaurantMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnRegisterRestaurant)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jplRightLayout.setVerticalGroup(
            jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplRightLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jlEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginMessage)
                    .addComponent(jbtnLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegisterRestaurantMessage)
                    .addComponent(jbtnRegisterRestaurant))
                .addGap(67, 67, 67))
        );

        jPanel3.add(jplRight);
        jplRight.setBounds(400, 0, 410, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNewEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNewEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNewEmailActionPerformed

    private void jNewPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNewPasswordFieldActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        Login LoginFrame = new Login();

        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jtfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFullNameActionPerformed

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed
        UserModel user = UserService.registerClient(jtfFullName.getText(), jtfNewEmail.getText(), String.valueOf(jNewPasswordField.getPassword()));
        if (user.getAccessToken() != null) {
            ClientView clientView = new HomePageClient(user);
            clientView.setVisible(true);
            clientView.pack();
            clientView.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_jbtnRegisterActionPerformed

    private void jbtnRegisterRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterRestaurantActionPerformed
        SignUpRestaurant SignUpFrame = new SignUpRestaurant();

        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnRegisterRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jNewPasswordField;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnRegister;
    private javax.swing.JButton jbtnRegisterRestaurant;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlLoginMessage;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlRegisterRestaurantMessage;
    private javax.swing.JPanel jplLeft;
    private javax.swing.JPanel jplRight;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfNewEmail;
    private javax.swing.JLabel lbSignUp;
    // End of variables declaration//GEN-END:variables
}
