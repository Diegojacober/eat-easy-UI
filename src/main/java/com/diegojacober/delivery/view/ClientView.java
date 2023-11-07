package com.diegojacober.delivery.view;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.ClientPages.HomePageClient;
import com.diegojacober.delivery.view.ClientPages.OrdersPage;

public abstract class ClientView extends JFrame {

    public abstract void initPageComponents();

    public abstract void nextButton();

    public abstract void backButton();
    public UserModel loggedUser;

    public ClientView(UserModel user) throws IOException {
        this.setIconImage(ImageIO.read(getClass().getResource("/com/diegojacober/delivery/img/delivery.png")));
        initComponents();
        initPageComponents();
        this.loggedUser = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContent = new JPanel();
        jpMenu = new JPanel();
        jbtnHome = new JButton();
        jbtnLogout = new JButton();
        jbtnOrders = new JButton();
        jlPageTitle = new JLabel();
        jSeparator1 = new JSeparator();
        jBtnNextArrow = new JButton();
        jBtnBackArrow = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Do your order");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jpContent.setBackground(new java.awt.Color(255, 255, 255));
        jpContent.setLayout(null);

        jpMenu.setBackground(new java.awt.Color(0, 102, 102));

        jbtnHome.setBackground(new java.awt.Color(0, 102, 102));
        jbtnHome.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHome.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/home.png"))); // NOI18N
        jbtnHome.setBorder(null);
        jbtnHome.setFocusPainted(false);
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });

        jbtnLogout.setBackground(new java.awt.Color(0, 102, 102));
        jbtnLogout.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/loogut.png"))); // NOI18N
        jbtnLogout.setBorder(null);
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });

        jbtnOrders.setBackground(new java.awt.Color(0, 102, 102));
        jbtnOrders.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/orders.png"))); // NOI18N
        jbtnOrders.setBorder(null);
        jbtnOrders.setFocusPainted(false);
        jbtnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOrdersActionPerformed(evt);
            }
        });

        GroupLayout jpMenuLayout = new GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnHome, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLogout, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOrders, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbtnHome, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnOrders, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(jbtnLogout, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jpContent.add(jpMenu);
        jpMenu.setBounds(0, 0, 70, 700);

        jlPageTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlPageTitle.setForeground(new java.awt.Color(102, 102, 102));
        jlPageTitle.setText("Page Title");
        jpContent.add(jlPageTitle);
        jlPageTitle.setBounds(80, 10, 600, 40);
        jpContent.add(jSeparator1);
        jSeparator1.setBounds(80, 50, 990, 10);

        jBtnNextArrow.setBackground(new java.awt.Color(255, 255, 255));
        jBtnNextArrow.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/next-icon.png"))); // NOI18N
        jBtnNextArrow.setBorder(null);
        jBtnNextArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnNextArrowMouseClicked(evt);
            }
        });
        jpContent.add(jBtnNextArrow);
        jBtnNextArrow.setBounds(580, 580, 60, 50);

        jBtnBackArrow.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBackArrow.setIcon(new ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/back-arrow.png"))); // NOI18N
        jBtnBackArrow.setBorder(null);
        jBtnBackArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnBackArrowMouseClicked(evt);
            }
        });
        jpContent.add(jBtnBackArrow);
        jBtnBackArrow.setBounds(520, 580, 60, 50);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jpContent, GroupLayout.PREFERRED_SIZE, 1080, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jpContent, GroupLayout.PREFERRED_SIZE, 650, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    } // </editor-fold>//GEN-END:initComponents

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        HomePageClient HomePageFrame;
        try {
            HomePageFrame = new HomePageClient(loggedUser);
            HomePageFrame.setVisible(true);
            HomePageFrame.pack();
            HomePageFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }


    }

    private void jbtnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOrdersActionPerformed
        OrdersPage OrdersPageFrame;
        try {
            OrdersPageFrame = new OrdersPage(loggedUser);
            OrdersPageFrame.setVisible(true);
            OrdersPageFrame.pack();
            OrdersPageFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    private void jBtnNextArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNextArrowMouseClicked
        nextButton();
    }

    private void jBtnBackArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnBackArrowMouseClicked
        backButton();
    }

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
        if (UserService.logout(loggedUser)) {
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected JButton jBtnBackArrow;
    protected JButton jBtnNextArrow;
    private JSeparator jSeparator1;
    private JButton jbtnHome;
    private JButton jbtnLogout;
    private JButton jbtnOrders;
    protected JLabel jlPageTitle;
    protected JPanel jpContent;
    private JPanel jpMenu;
    // End of variables declaration//GEN-END:variables
}
