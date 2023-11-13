package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.controller.ProductController;
import com.diegojacober.delivery.controller.RestaurantController;
import com.diegojacober.delivery.model.ProductModel;
import com.diegojacober.delivery.model.RestaurantModel;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.util.Table;
import com.diegojacober.delivery.view.RestaurantView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductsPage extends RestaurantView {

    private DefaultTableModel model = new DefaultTableModel();
    private JTable table;
    private Table utilTable;
    private JButton JBtnSaveProduct;
    private JButton JBtnDeleteProduct;
    private JButton JBtnUpdateProduct;
    private JButton JBtnCancel;
    private JTextField JTextProductName;
    private JTextField JTextProductPrice;
    private JTextField JTextProductId;
    private JLabel JLabelName;
    private JLabel JLabelPrice;
    private JLabel JLabelId;

    private RestaurantController restaurantController;
    private ProductController productController;
    RestaurantModel restaurant;

    private Double productPriceConverted;

    public ProductsPage(UserModel user) throws IOException, SQLException {
        super(user);
        jBtnBackArrow.setVisible(false);
        jBtnNextArrow.setVisible(false);
        jlPageTitle.setText("My products");

        createTable();
        try {
            tableData();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void tableData() throws SQLException {
        if (restaurant == null) {
            restaurant = restaurantController.controllerRetrieve(loggedUser.getName());
        }
        //pega todos os produtos
        productController.controllerRetrieveTable(restaurant.getId(), model);

    }

    @Override
    public void initPageComponents() {

        restaurantController = new RestaurantController();
        productController = new ProductController();
        utilTable = new Table();
        JBtnSaveProduct = new JButton("Salvar");
        JBtnDeleteProduct = new JButton("Deletar");
        JBtnUpdateProduct = new JButton("Atualizar");
        JBtnCancel = new JButton("Cancelar");
        JTextProductName = new JTextField();
        JTextProductPrice = new JTextField();
        JTextProductId = new JTextField();
        JLabelName = new JLabel();
        JLabelPrice = new JLabel();
        JLabelId = new JLabel();

        JBtnSaveProduct.setBackground(new java.awt.Color(0, 102, 102));
        JBtnSaveProduct.setForeground(Color.WHITE);
        JBtnSaveProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnSaveProduct.setText("Salvar");
        JBtnSaveProduct.setBounds(100, 200, 110, 30);
        jpContent.add(JBtnSaveProduct);

        JBtnDeleteProduct.setBackground(new java.awt.Color(255, 0, 0));
        JBtnDeleteProduct.setForeground(Color.WHITE);
        JBtnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnDeleteProduct.setText("Deletar");
        JBtnDeleteProduct.setBounds(220, 200, 110, 30);
        jpContent.add(JBtnDeleteProduct);

        JBtnUpdateProduct.setBackground(new java.awt.Color(0, 60, 255));
        JBtnUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnUpdateProduct.setForeground(Color.WHITE);
        JBtnUpdateProduct.setText("Atualizar");
        JBtnUpdateProduct.setBounds(340, 200, 110, 30);
        jpContent.add(JBtnUpdateProduct);

        JBtnCancel.setBackground(new Color(155, 155, 155));
        JBtnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnCancel.setForeground(Color.BLACK);
        JBtnCancel.setText("Cancelar");
        JBtnCancel.setBounds(600, 200, 110, 30);
        JBtnCancel.setEnabled(false);
        jpContent.add(JBtnCancel);

        JLabelName.setBackground(new java.awt.Color(255, 255, 255));
        JLabelName.setForeground(new java.awt.Color(51, 51, 51));
        JLabelName.setText("Nome do produto");
        jpContent.add(JLabelName);
        JLabelName.setBounds(100, 70, 100, 20);

        JTextProductName.setBackground(new java.awt.Color(204, 204, 204));
        JTextProductName.setForeground(new java.awt.Color(51, 51, 51));
        jpContent.add(JTextProductName);
        JTextProductName.setBounds(100, 90, 200, 30);

        JLabelPrice.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPrice.setForeground(new java.awt.Color(51, 51, 51));
        JLabelPrice.setText("Preço do produto");
        jpContent.add(JLabelPrice);
        JLabelPrice.setBounds(310, 70, 100, 20);

        JTextProductPrice.setBackground(new java.awt.Color(204, 204, 204));
        JTextProductPrice.setForeground(new java.awt.Color(51, 51, 51));
        jpContent.add(JTextProductPrice);
        JTextProductPrice.setBounds(310, 90, 200, 30);

        JLabelId.setBackground(new java.awt.Color(255, 255, 255));
        JLabelId.setForeground(new java.awt.Color(51, 51, 51));
        JLabelId.setText("ID");
        jpContent.add(JLabelId);
        JLabelId.setBounds(520, 70, 60, 20);

        JTextProductId.setBackground(new java.awt.Color(204, 204, 204));
        JTextProductId.setForeground(new java.awt.Color(51, 51, 51));
        jpContent.add(JTextProductId);
        JTextProductId.setBounds(520, 90, 100, 30);
        JTextProductId.setVisible(true);
        JTextProductId.setEditable(false);

        JBtnSaveProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBtnSaveProductActionPerformed(evt);
            }
        });

        JBtnUpdateProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBtnUpdateProductActionPerformed(evt);
            }
        });

        JBtnDeleteProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    JBtnDeleteProductActionPerformed(evt);
                } catch (SQLException ex) {
                    System.out.println("erro: " + ex.getMessage());
                }
            }
        });

        JBtnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JBtnCancelActionPerformed(evt);
            }
        });

        disableButtons(true);
    }

    private void createTable() {
        int[] bounds = {100, 250, 950, 380};
        table = utilTable.createTable(jpContent,
                new Object[]{50, 500, 400},
                new Object[]{"center", "center", "left"},
                new Object[]{"ID", "NAME", "PRICE"},
                bounds
        );
        table.setSelectionBackground(new Color(0, 102, 102));
        table.setSelectionForeground(Color.white);

        table.addMouseListener(
                new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                updateForm();
            }
        }
        );

        table.addKeyListener(
                new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateForm();
            }
        }
        );

        model = (DefaultTableModel) table.getModel();
    }

    private void JBtnSaveProductActionPerformed(ActionEvent evt) {
        if (validFields()) {
            saveProduct(0, true);
            JTextProductName.setText("");
            JTextProductPrice.setText("");
        }
    }

    private void updateForm() {
        String value = table.getValueAt(table.getSelectedRow(), 2).toString().replace("R$", "").trim().replace(",", ".");
        JTextProductId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        JTextProductName.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        JTextProductPrice.setText(value.substring(1));
        disableButtons(false);
    }

    private void JBtnCancelActionPerformed(ActionEvent evt) {
        JTextProductId.setText("");
        JTextProductName.setText("");
        JTextProductPrice.setText("");
        disableButtons(true);
    }

    private void JBtnUpdateProductActionPerformed(ActionEvent evt) {
        if (validFields()) {
            saveProduct(Integer.parseInt(JTextProductId.getText()), false);
            JTextProductId.setText("");
            JTextProductName.setText("");
            JTextProductPrice.setText("");
        }

    }

    private void JBtnDeleteProductActionPerformed(ActionEvent evt) throws SQLException {

        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto?", "SIM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            disableButtons(false);
            deleteProduct(Integer.valueOf(JTextProductId.getText()));
            JTextProductId.setText("");
            JTextProductName.setText("");
            JTextProductPrice.setText("");
            try {
                tableData();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
        }
    }

    private void deleteProduct(Integer id) throws SQLException {
        productController.controllerDeleteProduct(id);
    }

    private void saveProduct(int id, boolean isInsert) {
        String productName = JTextProductName.getText();
        ProductModel newProduct = new ProductModel(id, productName, productPriceConverted, restaurant.getId());
        productController.controllerSaveAndRefreshTable(newProduct, isInsert, model);
    }

    private boolean validFields() {
        String productName = JTextProductName.getText();
        String productValue = JTextProductPrice.getText();

        if (productName == null || productValue == null) {
            JOptionPane.showMessageDialog(null, "O nome e preço devem ser preenchidos");
        }

        try {
            productPriceConverted = Double.valueOf(productValue.trim().replace(",", "."));

            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Preencha o preço no valor correto");
        }
        return false;
    }

    private void disableButtons(boolean newOrExistent) {
        JBtnSaveProduct.setEnabled(newOrExistent);
        JBtnUpdateProduct.setEnabled(!newOrExistent);
        JBtnDeleteProduct.setEnabled(!newOrExistent);
        JBtnCancel.setEnabled(!newOrExistent);
    }

    @Override
    public void nextButton() {

    }

    @Override
    public void backButton() {

    }

}
