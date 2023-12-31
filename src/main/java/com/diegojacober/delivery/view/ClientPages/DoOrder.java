package com.diegojacober.delivery.view.ClientPages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.diegojacober.delivery.controller.ProductController;
import com.diegojacober.delivery.model.ProductModel;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.PedidoService;

public class DoOrder extends JFrame {

    private JPanel panel;
    private JPanel centeredPanel;
    private JScrollPane panelScrollable;
    private Map<String, Integer> order = new HashMap<>();
    private ProductController controller = new ProductController();
    private List<ProductModel> products;
    private Integer id;
    JSpinner[] spinners;
    JLabel[] labels;
    
    public UserModel loggedUser;

    public DoOrder(String name, Integer id, UserModel user) throws SQLException {
        loggedUser = user;
        this.id = id;
        initComponents();
        loadComponents();
        setTitle(name);
        jlRestaurantName.setText(name);

        panel.removeAll();
        panelScrollable.getVerticalScrollBar().setUnitIncrement(50);
        panelScrollable.setVisible(false);
        this.add(panelScrollable, BorderLayout.CENTER);

        products = controller.controllerRetrieve(id);

        spinners = new JSpinner[products.size()];
        labels = new JLabel[products.size()];
        loadItems();
        panelScrollable.setVisible(true);
    }

    private void loadItems() {
        for (int i = 0; i < products.size(); i++) {
            JLabel label = new JLabel(products.get(i).getId() + " - " + products.get(i).getName() + ": R$ " + products.get(i).getValue());
            label.setPreferredSize(new Dimension(400, 100));
            label.setMinimumSize(new Dimension(400, 100));
            label.setMaximumSize(new Dimension(400, 100));

            label.setFont(new Font("Segoe UI", 0, 24));
            label.setForeground(new Color(255, 255, 255));
            label.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

            SpinnerModel modelSpinner = new SpinnerNumberModel(0, 0, 20, 1);
            JSpinner spinner = new JSpinner(modelSpinner);

            spinner.setBackground(Color.BLACK);
            spinner.setForeground(Color.WHITE);
            Font font = new Font("Arial", Font.PLAIN, 14);
            spinner.setFont(font);

            JComponent editor = spinner.getEditor();
            if (editor instanceof JSpinner.DefaultEditor) {
                ((JSpinner.DefaultEditor) editor).getTextField().setEditable(false);
            }
            spinner.setPreferredSize(new Dimension(50, 30));

            spinner.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    jBtnAddItems.setText(sumItems() + " - Add items");
                }
            });

            spinners[i] = spinner;
            labels[i] = label;

            JPanel panelS = new JPanel();
            panelS.setBackground(new java.awt.Color(0, 102, 102));
            panelS.setPreferredSize(new Dimension(520, 110));
            panelS.setMinimumSize(new Dimension(520, 110));
            panelS.setMaximumSize(new Dimension(520, 110));
            panelS.add(label);
            panelS.add(spinner);
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
    private void initComponents() {

        jPanel1 = new JPanel();
        jlRestaurantName = new JLabel();
        jSeparator1 = new JSeparator();
        jButtonReset = new JButton();
        jBtnAddItems = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        jBtnAddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddItemsActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jlRestaurantName, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonReset, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnAddItems, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlRestaurantName, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddItems, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        for (JSpinner spinner : spinners) {
            spinner.setValue(0);
        }
    }

    private void jBtnAddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddItemsActionPerformed
        for (int i = 0; i < products.size(); i++) {
            Integer qtd = (Integer) spinners[i].getValue();

            if (qtd > 0) {
                String idItem = labels[i].getText().split("-")[0];
                order.put(idItem, qtd);
            }
        }

        if (PedidoService.makeOrder(order, sumItems(), loggedUser, id)) {
            JOptionPane.showMessageDialog(null, "Seu pedido foi efetuado com sucesso, obrigado pela preferência!!");
        } else {
            JOptionPane.showMessageDialog(null, "Ops! falha, tente novamente mais tarde!");
        }
    }

    private Double sumItems() {
        Double sum = 0.0;
        for (int i = 0; i < products.size(); i++) {
            Integer qtd = (Integer) spinners[i].getValue();
            if (qtd > 0) {
                Double valueItem = Double.valueOf(labels[i].getText().split("R\\$")[1].trim());
                Double subtTotal = qtd * valueItem;
                sum += subtTotal;
            }
        }

        return sum;
    }

    private JButton jBtnAddItems;
    private JButton jButtonReset;
    private JPanel jPanel1;
    private JSeparator jSeparator1;
    private JLabel jlRestaurantName;
}
