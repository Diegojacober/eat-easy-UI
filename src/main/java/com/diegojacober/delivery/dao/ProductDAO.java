package com.diegojacober.delivery.dao;

import com.diegojacober.delivery.model.ProductModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductDAO {

    private String query;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    public void save(ProductModel product, Integer restaurant_id) {
        query = "INSERT INTO products (name, value, restaurant_id) VALUES (?, ?, ?)";
       

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);

            stmt.setString(1, product.getName());
            stmt.setDouble(2, product.getValue());
            stmt.setInt(3, restaurant_id);

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
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

    public void delete(Integer id) throws SQLException {

    }
}
