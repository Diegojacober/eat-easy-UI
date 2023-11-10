package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.util.Table;
import com.diegojacober.delivery.view.RestaurantView;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductsPage extends RestaurantView {

    public ProductsPage(UserModel user) throws IOException {
        super(user);
        jBtnBackArrow.setVisible(false);
        jBtnNextArrow.setVisible(false);
        jlPageTitle.setText("My products");
    }

    @Override
    public void initPageComponents() {        
        JTable table;
        DefaultTableModel model = new DefaultTableModel();
        Table utilTable = new Table();
        JButton JBtnSaveProduct = new JButton("Salvar");
        JButton JBtnDeleteProduct = new JButton("Deletar");
        JButton JBtnUpdateProduct = new JButton("Atualizar");
        JTextField JTextProductName = new JTextField();
        JTextField JTextProductPrice = new JTextField();
        JLabel JLabelName = new JLabel();
        JLabel JLabelPrice = new JLabel();
        
        JBtnSaveProduct.setBackground(new java.awt.Color(0, 102, 102));
        JBtnSaveProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnSaveProduct.setText("Salvar");
        JBtnSaveProduct.setBounds(100, 220, 110, 30);
        jpContent.add(JBtnSaveProduct);
        
        JBtnDeleteProduct.setBackground(new java.awt.Color(255, 0, 0));
        JBtnDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnDeleteProduct.setText("Deletar");
        JBtnDeleteProduct.setBounds(120, 220, 110, 30);
        jpContent.add(JBtnDeleteProduct);
        
        
        JBtnUpdateProduct.setBackground(new java.awt.Color(0, 60, 255));
        JBtnUpdateProduct.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JBtnUpdateProduct.setText("Atualizar");
        JBtnUpdateProduct.setBounds(140, 220, 110, 30);
        jpContent.add(JBtnUpdateProduct);
        
        JLabelName.setBackground(new java.awt.Color(255, 255, 255));
        JLabelName.setForeground(new java.awt.Color(51, 51, 51));
        JLabelName.setText("Nome do produto");
        jpContent.add(JLabelName);
        JLabelName.setBounds(240, 170, 100, 20);
        
        JTextProductName.setBackground(new java.awt.Color(204, 204, 204));
        JTextProductName.setForeground(new java.awt.Color(51, 51, 51));
        jpContent.add(JTextProductName);
        JTextProductName.setBounds(240, 180, 200, 30);
        
        JLabelPrice.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPrice.setForeground(new java.awt.Color(51, 51, 51));
        JLabelPrice.setText("Preço do produto");
        jpContent.add(JLabelPrice);
        JLabelPrice.setBounds(280, 170, 100, 20);
        
        JTextProductPrice.setBackground(new java.awt.Color(204, 204, 204));
        JTextProductPrice.setForeground(new java.awt.Color(51, 51, 51));
        jpContent.add(JTextProductPrice);
        JTextProductPrice.setBounds(280, 180, 200, 30);

        
        int[] bounds =  {100, 250, 950, 380};
        table = utilTable.createTable(jpContent,
                new Object[]{525, 425},
                new Object[]{"center", "left"},
                new Object[]{"NAME", "PRICE"},
                bounds
        );
        table.setSelectionBackground(new Color(0, 102, 102));
        table.setSelectionForeground(Color.white);

        model = (DefaultTableModel) table.getModel();
    }

    @Override
    public void nextButton() {

    }

    @Override
    public void backButton() {

    }

}
