package com.diegojacober.delivery.dao;

import com.diegojacober.delivery.model.RestaurantModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RestaurantDAO {

    private String query;
    private PreparedStatement stmt;
    private ResultSet resultSet;

    public void save(RestaurantModel restaurant) {
        if (restaurant.getId() == null) {
            query = "INSERT INTO restaurants (name, location_x, location_y) VALUES (?, ?, ?)";
        }

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);

            stmt.setString(1, restaurant.getName());
            stmt.setString(2, restaurant.getLocationX());
            stmt.setString(3, restaurant.getLocationY());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<RestaurantModel> retrieve(RestaurantModel restaurant, Integer page) throws SQLException {
        List<RestaurantModel> restaurants = new ArrayList<>();
        if (restaurant.getId() == null) {
            query = "SELECT * FROM restaurants order by created_at DESC LIMIT 10 OFFSET "+ (page * 10);
        } else {
            query = "SELECT * FROM restaurants WHERE id=" + restaurant.getId();
        }

        try {
            stmt = DBConnection.openConnection().prepareStatement(query);
            resultSet = stmt.executeQuery();
            
            while (resultSet.next()) {
                restaurants.add(
                        new RestaurantModel(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getTimestamp("created_at").toLocalDateTime(),
                                resultSet.getString("location_x"),
                                resultSet.getString("location_y")
                        )
                );
            }

            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return restaurants;
    }

    public void delete(Integer id) throws SQLException {

    }
    
    public Integer countRows() throws SQLException{
        
        query = "SELECT COUNT(*) as t_rows FROM restaurants";
        
        try {
            stmt = DBConnection.openConnection().prepareStatement(query);
            resultSet = stmt.executeQuery();
            
            
            while(resultSet.next()) {
                return resultSet.getInt("t_rows");
            }

            stmt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return 0;  
    }
}
