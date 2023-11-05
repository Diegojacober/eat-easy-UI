package com.diegojacober.delivery.controller;

import com.diegojacober.delivery.dao.ProductDAO;
import com.diegojacober.delivery.model.ProductModel;
import java.sql.SQLException;
import java.util.List;


public class ProductController {

    private ProductDAO dao = new ProductDAO();


    public List<ProductModel> controllerRetrieve(Integer restaurant_id) throws SQLException {
        return dao.retrieve(restaurant_id);
    }
}
