package com.diegojacober.delivery.services;

import com.diegojacober.delivery.model.UserModel;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class UserService {

    static String URL = "http://localhost:8080/api/v1/auth";

    public static UserModel login(String username, String password) {
        String path = URL + "/authenticate";
        
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            // Crie um objeto HttpPost
            HttpPost httpPost = new HttpPost(path);

            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("email", username);
            jsonRequest.put("password", password);
            
            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");
            // Execute a solicitação POST
            response = httpClient.execute(httpPost);

            // Obtenha a resposta
            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            // Converta a resposta em um objeto JSONObject
            JSONObject jsonResponse = new JSONObject(responseString);
            
            String accessToken = jsonResponse.get("access_token").toString();
            String refreshToken = jsonResponse.get("refresh_token").toString();
            

            return new UserModel(username, accessToken, refreshToken);

        } catch (Exception e) {
            return new UserModel();
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
