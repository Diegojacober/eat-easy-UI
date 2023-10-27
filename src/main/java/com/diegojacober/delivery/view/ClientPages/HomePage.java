package com.diegojacober.delivery.view.ClientPages;

import com.diegojacober.delivery.controller.RestaurantController;
import com.diegojacober.delivery.model.RestaurantModel;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.view.ClientView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class HomePage extends ClientView {

//   private RestaurantController controller = new RestaurantController();
    private JPanel panel;
    private JPanel centeredPanel;
    private JScrollPane panelScrollable;
    private int currentPage = 0;

    public HomePage(UserModel user) {
        super(user);
        jlPageTitle.setText("Available Restaurants");
    }

    private void loadRestaurants(boolean page) throws SQLException {
        RestaurantController controller = new RestaurantController();
        Integer rows = controller.countRows();
        
        jpContent.remove(panelScrollable);
        panel.removeAll();
        panelScrollable.getVerticalScrollBar().setUnitIncrement(50);
        panelScrollable.setVisible(false);
        jBtnNextArrow.setVisible(true);
        jBtnBackArrow.setVisible(true);

        if (!page && currentPage > 0) {
            currentPage--;
        } else if (!page && currentPage == 0) {

        } else {
            currentPage++;
        }
        
        Integer rowsToShow = currentPage > 1 ? rows - (currentPage * 10) : rows - ((currentPage + 1) * 10);
        if (rowsToShow < 0) {
            jBtnNextArrow.setVisible(false);
        }
        
        if (currentPage == 0) {
            jBtnBackArrow.setVisible(false);
        }
        

        List<RestaurantModel> availableRestaurants = controller.controllerRetrieve(new RestaurantModel(), currentPage);

        for (RestaurantModel restaurant : availableRestaurants) {
            String txt = restaurant.getName();

            JButton btn = createButton(txt, restaurant.getId());
            panel.add(btn);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));
        }

        jpContent.add(panelScrollable, BorderLayout.CENTER);
        panelScrollable.setVisible(true);

    }

    private JButton createButton(String txt, Integer id) {
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

        });
        
        return btn;
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
        panelScrollable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        panelScrollable.setBackground(new java.awt.Color(255, 255, 255));
        panelScrollable.setBorder(null);
        panelScrollable.setBounds(80, 70, 990, 500);
    }

    @Override
    public void initPageComponents() {
        loadComponents();
        try {
            loadRestaurants(false);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void nextButton() {
        try {
            loadRestaurants(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void backButton() {
        try {
            loadRestaurants(false);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
