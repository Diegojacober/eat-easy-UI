package com.diegojacober.delivery.view;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.UserService;
import com.diegojacober.delivery.view.RestaurantPages.HomePageRestaurant;
import com.diegojacober.delivery.view.RestaurantPages.ProductsPage;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class RestaurantView extends JFrame {
    
    public UserModel loggedUser;

    public abstract void initPageComponents();

    public abstract void nextButton();

    public abstract void backButton();
    

    public RestaurantView(UserModel user) throws IOException {
        this.setIconImage(ImageIO.read(getClass().getResource("/com/diegojacober/delivery/img/delivery.png")));
        this.loggedUser = user;
        initComponents();
        initPageComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpContent = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jbtnHome = new javax.swing.JButton();
        jbtnLogout = new javax.swing.JButton();
        jbtnItems = new javax.swing.JButton();
        jbtnOrders1 = new javax.swing.JButton();
        jlPageTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnNextArrow = new javax.swing.JButton();
        jBtnBackArrow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 650));

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

        jbtnItems.setBackground(new java.awt.Color(0, 102, 102));
        jbtnItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/items.png"))); // NOI18N
        jbtnItems.setBorder(null);
        jbtnItems.setFocusPainted(false);
        jbtnItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnItemsActionPerformed(evt);
            }
        });

        jbtnOrders1.setBackground(new java.awt.Color(0, 102, 102));
        jbtnOrders1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diegojacober/delivery/img/orders.png"))); // NOI18N
        jbtnOrders1.setBorder(null);
        jbtnOrders1.setFocusPainted(false);
        jbtnOrders1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOrders1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnItems, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnOrders1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnItems, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnOrders1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpContent, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        HomePageRestaurant HomePageFrame;
        try {
            HomePageFrame = new HomePageRestaurant(loggedUser);
            HomePageFrame.setVisible(true);
            HomePageFrame.pack();
            HomePageFrame.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
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
    
    private void jbtnOrders1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOrders1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnOrders1ActionPerformed
  
    private void jbtnItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnItemsActionPerformed
        try {
            ProductsPage productsPage = new ProductsPage(loggedUser);
            productsPage.setVisible(true);
            productsPage.pack();
            productsPage.setLocationRelativeTo(null);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(RestaurantView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnItemsActionPerformed

    private void jBtnNextArrowMouseClicked(java.awt.event.MouseEvent evt) {                                           
        nextButton();
    }

    private void jBtnNextArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNextArrowActionPerformed

    }//GEN-LAST:event_jBtnNextArrowActionPerformed

    private void jBtnBackArrowMouseClicked(java.awt.event.MouseEvent evt) {                                           
        backButton();
    }
    
     private void jBtnBackArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackArrowActionPerformed

    }//GEN-LAST:event_jBtnBackArrowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton jBtnBackArrow;
    protected javax.swing.JButton jBtnNextArrow;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnItems;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnOrders1;
    protected javax.swing.JLabel jlPageTitle;
    protected javax.swing.JPanel jpContent;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables
}
