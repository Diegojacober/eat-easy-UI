package com.diegojacober.delivery;

import com.diegojacober.delivery.view.Login;

public class Delivery {

    public static void main(String[] args) {
        Login LoginFrame = new Login();
        
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }
}
