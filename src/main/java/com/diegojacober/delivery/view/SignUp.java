package com.diegojacober.delivery.view;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.ClientPages.HomePageClient;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class SignUp extends JFrame {

    public SignUp() throws IOException {
        this.setIconImage(ImageIO.read(getClass().getResource("/com/diegojacober/delivery/img/delivery.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new JPanel();
        jplLeft = new JPanel();
        jLabel3 = new JLabel();
        jplRight = new JPanel();
        lbSignUp = new JLabel();
        jlEmail = new JLabel();
        jtfNewEmail = new JTextField();
        jlPassword = new JLabel();
        jNewPasswordField = new JPasswordField();
        jbtnRegister = new JButton();
        jlLoginMessage = new JLabel();
        jbtnLogin = new JButton();
        jtfFullName = new JTextField();
        jlEmail1 = new JLabel();
        jlRegisterRestaurantMessage = new JLabel();
        jbtnRegisterRestaurant = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/delivery.png"))); // NOI18N

        GroupLayout jplLeftLayout = new GroupLayout(jplLeft);
        jplLeft.setLayout(jplLeftLayout);
        jplLeftLayout.setHorizontalGroup(
                jplLeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jplLeftLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addContainerGap(42, Short.MAX_VALUE)));
        jplLeftLayout.setVerticalGroup(
                jplLeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jplLeftLayout.createSequentialGroup()
                                .addContainerGap(106, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(85, 85, 85)));

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


        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jNewPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N


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

        GroupLayout jplRightLayout = new GroupLayout(jplRight);
        jplRight.setLayout(jplRightLayout);
        jplRightLayout.setHorizontalGroup(
                jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jplRightLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbSignUp)
                                .addGap(130, 130, 130))
                        .addGroup(jplRightLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jlEmail)
                                        .addComponent(jtfNewEmail, GroupLayout.PREFERRED_SIZE, 330,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlEmail1)
                                        .addComponent(jtfFullName, GroupLayout.PREFERRED_SIZE, 330,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGroup(
                                                jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jlPassword)
                                                        .addComponent(jNewPasswordField, GroupLayout.DEFAULT_SIZE, 330,
                                                                Short.MAX_VALUE))
                                        .addComponent(jbtnRegister, GroupLayout.PREFERRED_SIZE, 90,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jplRightLayout.createSequentialGroup()
                                                .addComponent(jlLoginMessage)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnLogin))
                                        .addGroup(jplRightLayout.createSequentialGroup()
                                                .addComponent(jlRegisterRestaurantMessage)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtnRegisterRestaurant)))
                                .addContainerGap(35, Short.MAX_VALUE)));
        jplRightLayout.setVerticalGroup(
                jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jplRightLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lbSignUp)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(jlEmail)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNewEmail, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlEmail1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfFullName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlPassword)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNewPasswordField, GroupLayout.PREFERRED_SIZE, 36,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnRegister, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlLoginMessage)
                                        .addComponent(jbtnLogin))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlRegisterRestaurantMessage)
                                        .addComponent(jbtnRegisterRestaurant))
                                .addGap(67, 67, 67)));

        jPanel3.add(jplRight);
        jplRight.setBounds(400, 0, 410, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        Login loginPage;
        try {
            loginPage = new Login();
            loginPage.setVisible(true);
            loginPage.pack();
            loginPage.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        UserModel user = UserService.registerClient(jtfFullName.getText(), jtfNewEmail.getText(),
                String.valueOf(jNewPasswordField.getPassword()));
        if (user.getAccessToken() != null) {
            ClientView clientView;
            try {
                clientView = new HomePageClient(user);
                clientView.setVisible(true);
                clientView.pack();
                clientView.setLocationRelativeTo(null);
                this.dispose();
            } catch (IOException ex) {
                System.err.println("ERRO: " + ex.getMessage());
            }

        }
    }

    private void jbtnRegisterRestaurantActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbtnRegisterRestaurantActionPerformed
        SignUpRestaurant SignUpFrame;
        try {
            SignUpFrame = new SignUpRestaurant();
            SignUpFrame.setVisible(true);
            SignUpFrame.pack();
            SignUpFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel3;
    private JPasswordField jNewPasswordField;
    private JPanel jPanel3;
    private JButton jbtnLogin;
    private JButton jbtnRegister;
    private JButton jbtnRegisterRestaurant;
    private JLabel jlEmail;
    private JLabel jlEmail1;
    private JLabel jlLoginMessage;
    private JLabel jlPassword;
    private JLabel jlRegisterRestaurantMessage;
    private JPanel jplLeft;
    private JPanel jplRight;
    private JTextField jtfFullName;
    private JTextField jtfNewEmail;
    private JLabel lbSignUp;
    // End of variables declaration//GEN-END:variables
}
