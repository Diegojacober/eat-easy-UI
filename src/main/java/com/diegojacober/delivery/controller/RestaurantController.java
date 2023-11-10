package com.diegojacober.delivery.controller;

import com.diegojacober.delivery.dao.RestaurantDAO;
import com.diegojacober.delivery.model.RestaurantModel;
import java.sql.SQLException;
import java.util.List;

public class RestaurantController {

    private RestaurantDAO dao = new RestaurantDAO();


    public void controllerSave(RestaurantModel restaurant) {
        dao.save(restaurant);
    }

    public void controllerDelete() {

    }

    public List<RestaurantModel> controllerRetrieve(RestaurantModel restaurant, Integer page) throws SQLException {
        return dao.retrieve(restaurant, page);
    }
    
    public RestaurantModel controllerRetrieve(String restaurantName) throws SQLException {
        return dao.retrieve(restaurantName);
    }
    
    public Integer countRows() throws SQLException {
        return dao.countRows();
    }

}
