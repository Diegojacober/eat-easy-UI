package com.diegojacober.delivery.view.ClientPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DoOrder extends javax.swing.JFrame {

    private JPanel panel;
    private JPanel centeredPanel;
    private JScrollPane panelScrollable;

    public DoOrder(String name, Integer id) {
        initComponents();
        loadComponents();
        setTitle(name);
        jlRestaurantName.setText(name);

        panel.removeAll();
        panelScrollable.getVerticalScrollBar().setUnitIncrement(50);
        panelScrollable.setVisible(false);
        this.add(panelScrollable, BorderLayout.CENTER);
        loadItems();
        panelScrollable.setVisible(true);
    }

    private void loadItems() {
        for (int i = 0; i < 15; i++) {
            JButton btn = new JButton("oi " + i);
            btn.setPreferredSize(new Dimension(150, 100));
            btn.setMinimumSize(new Dimension(150, 100));
            btn.setMaximumSize(new Dimension(150, 100));

            Color bgColor = new Color(191, 191, 191);
            btn.setBackground(bgColor);
            btn.setFont(new Font("Segoe UI", 0, 24));
            btn.setForeground(new Color(51, 51, 51));
            btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            
            
            JPanel panelS = new JPanel();
            panelS.setBackground(new java.awt.Color(0, 102, 102));
            panelS.add(btn);
            panel.add(panelS);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));
        }
    }

    private void loadComponents() {

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        centeredPanel = new JPanel(new GridBagLayout());
        centeredPanel.add(panel);

        panelScrollable = new JScrollPane(centeredPanel);
        panelScrollable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panelScrollable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        panelScrollable.setBackground(new java.awt.Color(255, 255, 255));
        panelScrollable.setBorder(null);
        panelScrollable.setBounds(10, 50, 600, 320);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlRestaurantName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonReset = new javax.swing.JButton();
        jBtnAddItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(610, 500, 0, 0));
        setMaximumSize(new java.awt.Dimension(650, 460));
        setMinimumSize(new java.awt.Dimension(630, 450));
        setPreferredSize(new java.awt.Dimension(610, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 480));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(650, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 420));

        jlRestaurantName.setFont(new java.awt.Font("Bosch Sans Global", 1, 36)); // NOI18N
        jlRestaurantName.setForeground(new java.awt.Color(51, 51, 51));
        jlRestaurantName.setText("Restaurant name");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButtonReset.setBackground(new java.awt.Color(153, 0, 0));
        jButtonReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(null);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jBtnAddItems.setBackground(new java.awt.Color(51, 102, 0));
        jBtnAddItems.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnAddItems.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAddItems.setText("Add items");
        jBtnAddItems.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddItems;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlRestaurantName;
    // End of variables declaration//GEN-END:variables
}
