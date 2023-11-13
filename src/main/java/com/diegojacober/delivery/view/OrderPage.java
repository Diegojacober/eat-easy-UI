package com.diegojacober.delivery.view;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import com.diegojacober.delivery.model.OrderItemModel;
import com.diegojacober.delivery.model.OrderModel;
import com.diegojacober.delivery.util.Table;

public class OrderPage extends JFrame {

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
        int[] bounds = {10, 40, 580, 380};
        table = utilTable.createTable(jpnContent,
                new Object[]{250, 200, 130},
                new Object[]{"center", "left", "left"},
                new Object[]{"PRODUCT", "PRICE", "QUANTITY"},
                bounds
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
    private void initComponents() {

        jPanel1 = new JPanel();
        jlRestaurantName = new JLabel();
        jlOrderDate = new JLabel();
        jlOrderValue = new JLabel();
        jpnContent = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jlRestaurantName.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jlRestaurantName.setForeground(new java.awt.Color(0, 0, 0));
        jlRestaurantName.setText("Nome do restaurante");

        jlOrderDate.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jlOrderDate.setForeground(new java.awt.Color(0, 0, 0));
        jlOrderDate.setHorizontalAlignment(SwingConstants.CENTER);
        jlOrderDate.setText("00/00/0000");

        jlOrderValue.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jlOrderValue.setForeground(new java.awt.Color(51, 153, 0));
        jlOrderValue.setText("R$ 5500,00");

        jpnContent.setBackground(new java.awt.Color(204, 204, 204));

        GroupLayout jpnContentLayout = new GroupLayout(jpnContent);
        jpnContent.setLayout(jpnContentLayout);
        jpnContentLayout.setHorizontalGroup(
            jpnContentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnContentLayout.setVerticalGroup(
            jpnContentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpnContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlOrderValue, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlRestaurantName, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jlOrderDate, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRestaurantName, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlOrderDate))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlOrderValue, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private JPanel jPanel1;
    private JLabel jlOrderDate;
    private JLabel jlOrderValue;
    private JLabel jlRestaurantName;
    private JPanel jpnContent;
}
