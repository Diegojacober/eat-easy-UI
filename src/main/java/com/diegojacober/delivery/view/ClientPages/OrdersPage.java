/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.diegojacober.delivery.view.ClientPages;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.view.ClientView;

/**
 *
 * @author Diego
 */
public class OrdersPage extends ClientView{
    
    public OrdersPage(UserModel user) {
        super(user);
        setTitle("Your orders in Diego delivery");
        jlPageTitle.setText("My orders");
    }
    
    @Override
    public void initPageComponents() {
     
    }
    
     @Override
    public void nextButton() {
        
    }

    @Override
    public void backButton() {
        
    }  
    
}
