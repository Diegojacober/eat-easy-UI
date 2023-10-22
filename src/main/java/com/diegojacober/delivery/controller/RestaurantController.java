package com.diegojacober.delivery.controller;

import com.diegojacober.delivery.dao.RestaurantDAO;
import com.diegojacober.delivery.model.RestaurantModel;

public class RestaurantController {

    RestaurantDAO dao = new RestaurantDAO();
  
    public void controllerSave(RestaurantModel restaurant) {
        //Validar dados
        
        //salvar no banco de dados
        dao.save(restaurant);
    }

   
    public void controllerDelete() {
        
    }

  
    public void controllerRetrieve() {
        
    }
    
}
