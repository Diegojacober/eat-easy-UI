package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.view.RestaurantView;
import java.io.IOException;

public class HomePageRestaurant extends RestaurantView {

    public HomePageRestaurant(UserModel user) throws IOException {
        super(user);
        jlPageTitle.setText("My Restaurant");
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
