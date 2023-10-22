package com.diegojacober.delivery.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBConnection {
    private static final String driverClass = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/delivery";
    private static final String user = "dev";
    private static final String password = "123456";
    
    public static Connection openConnection() {
        Connection con = null;
        
        try {
            Class.forName(driverClass);
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: " + e.getMessage());
        }
        
        return con;
    }
}
