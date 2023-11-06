package com.diegojacober.delivery.view.ClientPages;

import com.diegojacober.delivery.model.OrderItemModel;
import com.diegojacober.delivery.model.OrderModel;
import com.diegojacober.delivery.util.Table;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderPage extends javax.swing.JFrame {

    private OrderModel order;
    private JTable table;
    private DefaultTableModel model = new DefaultTableModel();
    private Table utilTable = new Table();

    public OrderPage(OrderModel order) {
        initComponents();
        this.order = order;
        loadInfo();
    }

    private void loadInfo() {

        jlRestaurantName.setText(order.getRestaurantName());
        jlOrderValue.setText(NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                .format(order.getTotal()));
        jlOrderDate.setText(order.getDate());

        table = utilTable.createTable(jpnContent,
                new Object[]{250, 200, 130},
                new Object[]{"center", "left", "left"},
                new Object[]{"PRODUCT", "PRICE", "QUANTITY"}
        );

        table.setSelectionBackground(new Color(0, 102, 102));
        table.setSelectionForeground(Color.white);

        model = (DefaultTableModel) table.getModel();

        for (OrderItemModel item : order.getItems()) {
            model.addRow(new Object[]{
                item.getName(),
                NumberFormat.getCurrencyInstance(new Locale("pt", "BR"))
                .format(item.getPrice()),
                item.getQuantity()
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlRestaurantName = new javax.swing.JLabel();
        jlOrderDate = new javax.swing.JLabel();
        jlOrderValue = new javax.swing.JLabel();
        jpnContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jlRestaurantName.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jlRestaurantName.setForeground(new java.awt.Color(0, 0, 0));
        jlRestaurantName.setText("Nome do restaurante");

        jlOrderDate.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jlOrderDate.setForeground(new java.awt.Color(0, 0, 0));
        jlOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlOrderDate.setText("00/00/0000");

        jlOrderValue.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jlOrderValue.setForeground(new java.awt.Color(51, 153, 0));
        jlOrderValue.setText("R$ 5500,00");

        jpnContent.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jpnContentLayout = new javax.swing.GroupLayout(jpnContent);
        jpnContent.setLayout(jpnContentLayout);
        jpnContentLayout.setHorizontalGroup(
            jpnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnContentLayout.setVerticalGroup(
            jpnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlOrderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jlOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOrderDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlOrderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlOrderDate;
    private javax.swing.JLabel jlOrderValue;
    private javax.swing.JLabel jlRestaurantName;
    private javax.swing.JPanel jpnContent;
    // End of variables declaration//GEN-END:variables
}
