package com.diegojacober.delivery.services;

import com.diegojacober.delivery.model.UserModel;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;

public class PedidoService {
    
    static String URL = "http://localhost:8080/api/v1";
    
    public static boolean makeOrder(Map<String, Integer> items, Double total, UserModel loggedUser) {
        String path = URL + "/orders";
        
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        
        try {
            HttpPost httpPost = new HttpPost(path);
            
            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("total", total);
            JSONArray itemsArray = new JSONArray();
            for (Map.Entry<String, Integer> entry : items.entrySet()) {
                JSONObject itemObject = new JSONObject();
                itemObject.put("product", entry.getKey());
                itemObject.put("quantity", entry.getValue());
                itemsArray.put(itemObject);
            }
            jsonRequest.put("items", itemsArray);
            
            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Authorization", "Bearer " + loggedUser.getAccessToken());
            
            response = httpClient.execute(httpPost);
            
            return true; 
                       
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
            }
        }
    }
}
