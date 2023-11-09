package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.model.ProductSales;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.SalesService;
import com.diegojacober.delivery.util.Chart;
import com.diegojacober.delivery.view.RestaurantView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        
        List<ProductSales> productsSales = new ArrayList<>();
        
        productsSales.addAll(Arrays.asList(
                SalesService.getSalesProduct(loggedUser, 1),
                SalesService.getSalesProduct(loggedUser, 2),
                SalesService.getSalesProduct(loggedUser, 8)
        ));
        
        productsSales.forEach(System.out::println);
        JPanel chartPanel = Chart.createChartPanel(productsSales);
        jpContent.add(chartPanel);
    }

    @Override
    public void nextButton() {

    }

    @Override
    public void backButton() {

    }

}
