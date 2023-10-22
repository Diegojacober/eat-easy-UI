package com.diegojacober.delivery.dao;

import com.diegojacober.delivery.model.RestaurantModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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


    public void retrieve(RestaurantModel value) throws SQLException {
        
    }

    
    public void delete(Integer id) throws SQLException {
        
    }
}
