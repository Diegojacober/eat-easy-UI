package com.diegojacober.delivery.view.ClientPages;

import com.diegojacober.delivery.model.OrderModel;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.PedidoService;
import com.diegojacober.delivery.view.ClientView;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class OrdersPage extends ClientView {

    private JPanel panel;
    private JPanel centeredPanel;
    private JScrollPane panelScrollable;

    public OrdersPage(UserModel user) throws IOException {
        super(user);
        setTitle("Your orders in Diego delivery");
        jlPageTitle.setText("My orders");
        jBtnBackArrow.setVisible(false);
        jBtnNextArrow.setVisible(false);
        loadOrders(user);
    }

    private void loadOrders(UserModel user) {
        List<OrderModel> orders = PedidoService.getOrdersByUser(user);

        orders.forEach(order -> {;

            String txt = "R$ " + order.getTotal() + " - " + order.getRestaurantName() + " (" + order.getDate() + ")";

            JButton btn = createButton(txt, order);

            panel.add(btn);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));

            jpContent.add(panelScrollable, BorderLayout.CENTER);
            panelScrollable.setVisible(true);
        });
    }

    private JButton createButton(String txt, OrderModel order) {
        JButton btn = new JButton(txt);
        btn.setPreferredSize(new Dimension(950, 100));

        btn.setMinimumSize(new Dimension(950, 100));
        btn.setMaximumSize(new Dimension(950, 100));

        Color bgColor = new Color(191, 191, 191);

        btn.setBackground(bgColor);
        btn.setFont(new Font("Segoe UI", 0, 24));
        btn.setForeground(new Color(51, 51, 51));
        btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OrderPage orderPage = new OrderPage(order);

                orderPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                orderPage.setVisible(true);
                orderPage.setLocationRelativeTo(null);
            }
        });

        btn.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                Color newColor = new Color(0, 102, 102);
                btn.setBackground(new java.awt.Color(0, 102, 102));
                btn.setForeground(new java.awt.Color(255, 255, 255));
            }

        }
        );

        btn.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new java.awt.Color(191, 191, 191));
                btn.setForeground(new java.awt.Color(51, 51, 51));
            }

        });

        return btn;
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
        panelScrollable.setBounds(80, 70, 990, 500);
    }

    @Override
    public void initPageComponents() {
        loadComponents();
    }

    @Override
    public void nextButton() {
    }

    @Override
    public void backButton() {

    }

}
