package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.util.Chart;
import com.diegojacober.delivery.view.RestaurantView;
import java.io.IOException;
import javax.swing.JPanel;

public class HomePageRestaurant extends RestaurantView {

    public HomePageRestaurant(UserModel user) throws IOException {
        super(user);
        jlPageTitle.setText("My Restaurant");
    }

    @Override
    public void initPageComponents() {
        jBtnNextArrow.setVisible(false);
        jBtnBackArrow.setVisible(false);
        JPanel chartPanel = Chart.createChartPanel();
        jpContent.add(chartPanel);
    }

    @Override
    public void nextButton() {
        
    }

    @Override
    public void backButton() {
        
    }

}
