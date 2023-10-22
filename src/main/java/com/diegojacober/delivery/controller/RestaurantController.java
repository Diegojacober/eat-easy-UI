package com.diegojacober.delivery.controller;

import com.diegojacober.delivery.dao.RestaurantDAO;
import com.diegojacober.delivery.model.RestaurantModel;
import java.sql.SQLException;
import java.util.List;

public class RestaurantController {

    private RestaurantDAO dao = new RestaurantDAO();


    public void controllerSave(RestaurantModel restaurant) {
        //Validar dados

        //salvar no banco de dados
        dao.save(restaurant);
    }

    public void controllerDelete() {

    }

    public List<RestaurantModel> controllerRetrieve(RestaurantModel restaurant, Integer page) throws SQLException {
        return dao.retrieve(restaurant, page);
    }

}
