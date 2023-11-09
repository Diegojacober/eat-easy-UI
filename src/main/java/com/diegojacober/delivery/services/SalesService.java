package com.diegojacober.delivery.services;

import com.diegojacober.delivery.model.ProductSales;
import com.diegojacober.delivery.model.UserModel;
import javax.swing.JOptionPane;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class SalesService {

    static String URL = "http://localhost:8080/api/v1";

    public static ProductSales getSalesProduct(UserModel loggedUser, Integer productId) {
        String path = URL + "/sales/products/" + productId;

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpGet httpGet = new HttpGet(path);

            httpGet.setHeader("Content-Type", "application/json");
            httpGet.setHeader("Authorization", "Bearer " + loggedUser.getAccessToken());

            response = httpClient.execute(httpGet);

            int statusCode = response.getStatusLine().getStatusCode();

            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            JSONObject jsonResponse = new JSONObject(responseString);

            if (statusCode == 200) {
                ProductSales p = new ProductSales(
                        jsonResponse.getInt("productId"),
                        jsonResponse.getString("productName"),
                        jsonResponse.getDouble("productValue"),
                        jsonResponse.getInt("sales"),
                        jsonResponse.getDouble("total")
                );
                
                return p;
            }

            throw new Exception(jsonResponse.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
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
