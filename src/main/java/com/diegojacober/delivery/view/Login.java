package com.diegojacober.delivery.view;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.ClientPages.HomePageClient;
import com.diegojacober.delivery.view.RestaurantPages.HomePageRestaurant;

public class Login extends JFrame {

    public Login() throws IOException {

        this.setIconImage(ImageIO.read(getClass().getResource("/com/diegojacober/delivery/img/delivery.png")));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jpnLeft = new JPanel();
        jLabel3 = new JLabel();
        jpnRight = new JPanel();
        jLabel1 = new JLabel();
        jlEmail = new JLabel();
        jtfEmail = new JTextField();
        jlPassword = new JLabel();
        jPasswordField = new JPasswordField();
        jbtnLogin = new JButton();
        jlRegisterMessage = new JLabel();
        jbtnRegister = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jpnLeft.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/delivery.png"))); // NOI18N

        GroupLayout jpnLeftLayout = new GroupLayout(jpnLeft);
        jpnLeft.setLayout(jpnLeftLayout);
        jpnLeftLayout.setHorizontalGroup(
            jpnLeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpnLeftLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jpnLeftLayout.setVerticalGroup(
            jpnLeftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jpnLeftLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(85, 85, 85))
        );

        jPanel1.add(jpnLeft);
        jpnLeft.setBounds(0, 0, 400, 500);

        jpnRight.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        jlEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(51, 51, 51));
        jlEmail.setText("E-mail");

        jtfEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N


        jbtnLogin.setBackground(new java.awt.Color(0, 102, 102));
        jbtnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });

        jlRegisterMessage.setForeground(new java.awt.Color(51, 51, 51));
        jlRegisterMessage.setText("I don't have an account");

        jbtnRegister.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRegister.setForeground(new java.awt.Color(0, 102, 102));
        jbtnRegister.setText("Sign Up");
        jbtnRegister.setBorder(null);
        jbtnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterActionPerformed(evt);
            }
        });

        GroupLayout jpnRightLayout = new GroupLayout(jpnRight);
        jpnRight.setLayout(jpnRightLayout);
        jpnRightLayout.setHorizontalGroup(
            jpnRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpnRightLayout.createSequentialGroup()
                .addGroup(jpnRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRightLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(jpnRightLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jpnRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRightLayout.createSequentialGroup()
                                .addComponent(jlRegisterMessage)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnRegister))
                            .addGroup(jpnRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jlEmail)
                                .addComponent(jtfEmail)
                                .addComponent(jlPassword)
                                .addComponent(jPasswordField, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(jbtnLogin, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpnRightLayout.setVerticalGroup(
            jpnRightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpnRightLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jlEmail)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfEmail, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jlPassword)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbtnLogin, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jpnRightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRegisterMessage)
                    .addComponent(jbtnRegister))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jPanel1.add(jpnRight);
        jpnRight.setBounds(400, 0, 400, 500);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }


    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        SignUp SignUpFrame;
        try {
            SignUpFrame = new SignUp();
            SignUpFrame.setVisible(true);
            SignUpFrame.pack();
            SignUpFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {

        UserModel user = UserService.login(jtfEmail.getText(), String.valueOf(jPasswordField.getPassword()));
        if (user.getEmail() != null) {
            if (UserService.GetRoleLoggedUser(user).equals("ADMIN")) {
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

            } else {
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

        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer login");
        }
    }

    private JLabel jLabel1;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPasswordField jPasswordField;
    private JButton jbtnLogin;
    private JButton jbtnRegister;
    private JLabel jlEmail;
    private JLabel jlPassword;
    private JLabel jlRegisterMessage;
    private JPanel jpnLeft;
    private JPanel jpnRight;
    private JTextField jtfEmail;
}
