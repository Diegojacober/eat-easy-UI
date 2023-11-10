package com.diegojacober.delivery;

import com.diegojacober.delivery.view.ClientView;
import com.diegojacober.delivery.view.Login;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Delivery {

    public static void main(String[] args) {
         Login loginPage;
            try {
                loginPage = new Login();
                loginPage.setVisible(true);
                loginPage.pack();
                loginPage.setLocationRelativeTo(null);
            } catch (IOException ex) {
                Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
