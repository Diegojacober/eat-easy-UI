package com.diegojacober.delivery.view.ClientPages;

import com.diegojacober.delivery.view.ClientView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Diego
 */
public class HomePage extends ClientView {

    private JPanel panel;
    private JPanel centeredPanel;
    private JScrollPane panelScrollable;
    private int currentPage = 1;

    public HomePage() {
        jlPageTitle.setText("Available Restaurants");
    }

    private void loadRestaurants(boolean page) {
        jpContent.remove(panelScrollable);
        panel.removeAll();
        panelScrollable.setVisible(false);

        if (!page && currentPage > 1) {
            currentPage--;
        } else if (!page && currentPage == 1) {

        } else {
            currentPage++;
        }

        for (Integer i = 0; i < 12; i++) {
            Integer id = i;
            String txt = "Hello - " + i + ", page " + currentPage;
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
                    // Ação a ser executada quando o botão for clicado
                    loadRestaurant(txt, id);
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

            }
            );

            panel.add(btn);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));
        }

        jpContent.add(panelScrollable, BorderLayout.CENTER);
        panelScrollable.setVisible(true);
    }

    private void loadRestaurant(String name, Integer id) {
        DoOrder DoOrderFrame = new DoOrder(name, id);

        DoOrderFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DoOrderFrame.setVisible(true);
        DoOrderFrame.setLocationRelativeTo(null);
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
        loadRestaurants(false);
    }

    @Override
    public void nextButton() {
        loadRestaurants(true);
    }

    @Override
    public void backButton() {
        loadRestaurants(false);
    }

}
