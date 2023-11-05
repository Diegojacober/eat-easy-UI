package com.diegojacober.delivery.dao;

import com.diegojacober.delivery.model.ProductModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private String query;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    public void save(Object... value) {

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
