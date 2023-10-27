package com.diegojacober.delivery.view;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.ClientPages.HomePageClient;
import com.diegojacober.delivery.view.ClientPages.OrdersPage;

public abstract class ClientView extends javax.swing.JFrame {

    public abstract void initPageComponents();
    public abstract void nextButton();
    public abstract void backButton();
    public UserModel loggedUser;
    
    public ClientView(UserModel user) {
        initComponents();
        initPageComponents();
        this.loggedUser = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContent = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jbtnHome = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();
        jbtnOrders = new javax.swing.JButton();
        jbtnCart = new javax.swing.JButton();
        jlPageTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnNextArrow = new javax.swing.JButton();
        jBtnBackArrow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Do your order");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));

        jpContent.setBackground(new java.awt.Color(255, 255, 255));
        jpContent.setLayout(null);

        jpMenu.setBackground(new java.awt.Color(0, 102, 102));

        jbtnHome.setBackground(new java.awt.Color(0, 102, 102));
        jbtnHome.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/home.png"))); // NOI18N
        jbtnHome.setBorder(null);
        jbtnHome.setFocusPainted(false);
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });

        jbtnLogout.setBackground(new java.awt.Color(0, 102, 102));
        jbtnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/loogut.png"))); // NOI18N
        jbtnLogout.setBorder(null);
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });

        jbtnOrders.setBackground(new java.awt.Color(0, 102, 102));
        jbtnOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/orders.png"))); // NOI18N
        jbtnOrders.setBorder(null);
        jbtnOrders.setFocusPainted(false);
        jbtnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOrdersActionPerformed(evt);
            }
        });

        jbtnCart.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/cart.png"))); // NOI18N
        jbtnCart.setBorder(null);
        jbtnCart.setFocusPainted(false);

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jBtnNextArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/next-icon.png"))); // NOI18N
        jBtnNextArrow.setBorder(null);
        jBtnNextArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnNextArrowMouseClicked(evt);
            }
        });
        jBtnNextArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNextArrowActionPerformed(evt);
            }
        });
        jpContent.add(jBtnNextArrow);
        jBtnNextArrow.setBounds(580, 580, 60, 50);

        jBtnBackArrow.setBackground(new java.awt.Color(255, 255, 255));
        jBtnBackArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/back-arrow.png"))); // NOI18N
        jBtnBackArrow.setBorder(null);
        jBtnBackArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnBackArrowMouseClicked(evt);
            }
        });
        jBtnBackArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackArrowActionPerformed(evt);
            }
        });
        jpContent.add(jBtnBackArrow);
        jBtnBackArrow.setBounds(520, 580, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        HomePageClient HomePageFrame = new HomePageClient(loggedUser);
        
        HomePageFrame.setVisible(true);
        HomePageFrame.pack();
        HomePageFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOrdersActionPerformed
        OrdersPage OrdersPageFrame = new OrdersPage(loggedUser);
        
        OrdersPageFrame.setVisible(true);
        OrdersPageFrame.pack();
        OrdersPageFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jbtnOrdersActionPerformed

    private void jBtnBackArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackArrowActionPerformed
     
    }//GEN-LAST:event_jBtnBackArrowActionPerformed

    private void jBtnNextArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNextArrowActionPerformed
        
    }//GEN-LAST:event_jBtnNextArrowActionPerformed

    private void jBtnNextArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNextArrowMouseClicked
        nextButton();
    }//GEN-LAST:event_jBtnNextArrowMouseClicked

    private void jBtnBackArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnBackArrowMouseClicked
        backButton();
    }//GEN-LAST:event_jBtnBackArrowMouseClicked

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
       if (UserService.logout(loggedUser)) {
           Login loginPage = new Login();
           loginPage.setVisible(true);
           loginPage.pack();
           loginPage.setLocationRelativeTo(null);
           this.dispose();
       }
    }//GEN-LAST:event_jbtnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBtnBackArrow;
    protected javax.swing.JButton jBtnNextArrow;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnCart;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnOrders;
    protected javax.swing.JLabel jlPageTitle;
    protected javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables
}
