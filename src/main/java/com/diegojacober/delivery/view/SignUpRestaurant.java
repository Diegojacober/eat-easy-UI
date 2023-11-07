package com.diegojacober.delivery.view;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import com.diegojacober.delivery.controller.RestaurantController;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.RestaurantPages.HomePageRestaurant;

public class SignUpRestaurant extends JFrame {

    private RestaurantController controller = new RestaurantController();

    public SignUpRestaurant() throws IOException {
        this.setIconImage(ImageIO.read(getClass().getResource("/com/diegojacober/delivery/img/delivery.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jplLeft = new JPanel();
        jLabel3 = new JLabel();
        jplRight = new JPanel();
        lbSignUp = new JLabel();
        jlEmail = new JLabel();
        jtfRestaurantName = new JTextField();
        jlPassword = new JLabel();
        jbtnRegister = new JButton();
        jlLoginMessage = new JLabel();
        jbtnLogin = new JButton();
        jtfEmail = new JTextField();
        jlEmail1 = new JLabel();
        jlEmail2 = new JLabel();
        jtfPasswordField = new JTextField();
        jtfRestaurantPositionX = new JTextField();
        jlEmail3 = new JLabel();
        jtfRestaurantPositionY = new JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jplLeftLayout.setVerticalGroup(
            jplLeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jplLeftLayout.createSequentialGroup()
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

        jlEmail1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail1.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail1.setText("E-mail");

        jlEmail2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail2.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail2.setText("Position X");

        jtfPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N


        jtfRestaurantPositionX.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N


        jlEmail3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail3.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail3.setText("Position Y");

        jtfRestaurantPositionY.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        GroupLayout jplRightLayout = new GroupLayout(jplRight);
        jplRight.setLayout(jplRightLayout);
        jplRightLayout.setHorizontalGroup(
            jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jplRightLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jtfRestaurantPositionY, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplRightLayout.createSequentialGroup()
                        .addComponent(jbtnRegister, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlLoginMessage)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLogin))
                    .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbSignUp, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlEmail)
                        .addComponent(jlEmail1)
                        .addComponent(jlPassword)
                        .addComponent(jlEmail3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfRestaurantName)
                        .addComponent(jtfEmail)
                        .addComponent(jtfPasswordField)
                        .addComponent(jlEmail2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfRestaurantPositionX, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jplRightLayout.setVerticalGroup(
            jplRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jplRightLayout.createSequentialGroup()
                .addComponent(lbSignUp)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRestaurantName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmail1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPassword)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPasswordField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEmail2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfRestaurantPositionX, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlEmail3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRestaurantPositionY, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jplRightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginMessage)
                    .addComponent(jbtnLogin)
                    .addComponent(jbtnRegister, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jplLeft, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jplRight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jplLeft, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jplRight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed

        UserModel user = UserService.registerRestaurant(jtfRestaurantName.getText(), jtfEmail.getText(), jtfPasswordField.getText(), jtfRestaurantPositionX.getText(), jtfRestaurantPositionY.getText());
        if (user.getAccessToken() != null) {
            RestaurantView restaurantView;
            try {
                restaurantView = new HomePageRestaurant(user);
                restaurantView.setVisible(true);
                restaurantView.pack();
                restaurantView.setLocationRelativeTo(null);
                this.dispose();
            } catch (IOException ex) {
                System.err.println("ERRO: " + ex.getMessage());
            }

        }

    }

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JButton jbtnLogin;
    private JButton jbtnRegister;
    private JLabel jlEmail;
    private JLabel jlEmail1;
    private JLabel jlEmail2;
    private JLabel jlEmail3;
    private JLabel jlLoginMessage;
    private JLabel jlPassword;
    private JPanel jplLeft;
    private JPanel jplRight;
    private JTextField jtfEmail;
    private JTextField jtfPasswordField;
    private JTextField jtfRestaurantName;
    private JTextField jtfRestaurantPositionX;
    private JTextField jtfRestaurantPositionY;
    private JLabel lbSignUp;
    // End of variables declaration//GEN-END:variables
}
