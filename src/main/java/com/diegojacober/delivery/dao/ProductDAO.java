package com.diegojacober.delivery.dao;

import com.diegojacober.delivery.model.ProductModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductDAO {

    private String query;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    public void save(ProductModel product, boolean insert) {
        if (insert) {
            query = "INSERT INTO products (name, value, restaurant_id) VALUES (?, ?, ?)";
        } else {
            query = "UPDATE products SET name=?, value=? WHERE id=?";
        }

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getValue());

            if (product.getId() > 0) {
                stmt.setInt(3, product.getId());
            } else {
                stmt.setInt(3, product.getRestaurant());
            }

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ProductModel> retrieve(Integer restaurant_id) throws SQLException {
        List<ProductModel> products = new ArrayList<>();

        query = "SELECT * FROM products WHERE restaurant_id=" + restaurant_id;

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                products.add(
                        new ProductModel(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getDouble("value"),
                                resultSet.getInt("restaurant_id")
                        )
                );
            }

            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return products;
    }

    public void retrieveTable(Integer restaurant_id, DefaultTableModel model) throws SQLException {

        query = "SELECT * FROM products WHERE restaurant_id=" + restaurant_id;

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                model.addRow(
                        new Object[]{
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(resultSet.getDouble("value"))
                        }
                );

            }

            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void delete(Integer id) throws SQLException {

    }
}
