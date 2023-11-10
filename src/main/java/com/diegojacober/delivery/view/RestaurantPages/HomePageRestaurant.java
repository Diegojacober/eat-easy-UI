package com.diegojacober.delivery.view.RestaurantPages;

import com.diegojacober.delivery.controller.ProductController;
import com.diegojacober.delivery.controller.RestaurantController;
import com.diegojacober.delivery.model.ProductModel;
import com.diegojacober.delivery.model.ProductSales;
import com.diegojacober.delivery.model.RestaurantModel;
import com.diegojacober.delivery.model.UserModel;
import com.diegojacober.delivery.services.SalesService;
import com.diegojacober.delivery.util.Chart;
import com.diegojacober.delivery.view.RestaurantView;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HomePageRestaurant extends RestaurantView {

    private ProductController productController;
    private RestaurantController restaurantController;

    public HomePageRestaurant(UserModel user) throws IOException {
        super(user);
        jlPageTitle.setText("My Restaurant");
    }

    @Override
    public void initPageComponents() {
        jBtnNextArrow.setVisible(false);
        jBtnBackArrow.setVisible(false);

        List<ProductSales> productsSales = new ArrayList<>();
        productController = new ProductController();
        restaurantController = new RestaurantController();

        try {
            RestaurantModel restaurant = restaurantController.controllerRetrieve(loggedUser.getName());
            List<ProductModel> produtos = productController.controllerRetrieve(restaurant.getId());
            if (produtos.size() > 0) {
                for (int i = 0; i < 4; i++) {
                    productsSales.add(SalesService.getSalesProduct(loggedUser, produtos.get(i).getId()));
                    productsSales.forEach(System.out::println);
                    JPanel chartPanel = Chart.createChartPanel(productsSales);
                    jpContent.add(chartPanel);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum produto ou venda cadastrado");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void nextButton() {

    }

    @Override
    public void backButton() {

    }

}
