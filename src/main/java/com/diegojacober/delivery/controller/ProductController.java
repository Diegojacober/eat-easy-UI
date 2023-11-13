package com.diegojacober.delivery.controller;

import com.diegojacober.delivery.dao.ProductDAO;
import com.diegojacober.delivery.model.ProductModel;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProductController {

    private ProductDAO dao = new ProductDAO();

    public List<ProductModel> controllerRetrieve(Integer restaurant_id) throws SQLException {
        return dao.retrieve(restaurant_id);
    }

    public void controllerRetrieveTable(Integer restaurant_id, DefaultTableModel model) throws SQLException {
        try {
            dao.retrieveTable(restaurant_id, model);
        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
    }

    public void controllerSaveAndRefreshTable(ProductModel product, boolean isInsert, DefaultTableModel model) {
        dao.save(product, isInsert);

        try {
            controllerRetrieveTable(product.getRestaurant(), model);
        } catch (SQLException ex) {
            System.out.println("erro: " + ex.getMessage());
        }
    }
}
