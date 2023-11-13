package com.diegojacober.delivery.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import com.diegojacober.delivery.model.OrderItemModel;
import com.diegojacober.delivery.model.OrderModel;
import com.diegojacober.delivery.model.UserModel;

public class PedidoService {

    static String URL = "http://localhost:8080/api/v1";

    public static boolean makeOrder(Map<String, Integer> items, Double total, UserModel loggedUser, Integer restaurantId) {
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
            jsonRequest.put("restaurantId", restaurantId);

            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");
            httpPost.setHeader("Authorization", "Bearer " + loggedUser.getAccessToken());

            response = httpClient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public static List<OrderModel> getOrdersByUser(UserModel loggedUser) {
        String path = URL + "/orders/myorders";
        List<OrderModel> orders = new ArrayList<>();

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

            JSONArray jsonArray = jsonResponse.getJSONArray("data");

            for (Object order : jsonArray) {
                JSONObject orderJson = (JSONObject) order;

                List<OrderItemModel> orderItems = new ArrayList<>();

                JSONArray itemsArray = orderJson.getJSONArray("items");

                for (Object item : itemsArray) {
                    JSONObject itemJson = (JSONObject) item;
                    orderItems.add(new OrderItemModel(
                            itemJson.getString("name"),
                            itemJson.getInt("quantity"),
                            itemJson.getDouble("price")
                    ));
                }

                orders.add(new OrderModel(
                        orderJson.getInt("code"),
                        orderJson.getDouble("total"),
                        orderJson.getString("orderDate"),
                        orderJson.getJSONObject("restaurant").getString("name"),
                        orderItems
                ));

            }

            return orders;
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
    
    public  static List<OrderModel> getOrdersByRestaurant(Integer restaurantId, UserModel loggedUser) {
        String path = URL + "/orders/restaurants/"+restaurantId;
        System.out.println(path);
        List<OrderModel> orders = new ArrayList<>();

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

            JSONArray jsonArray = jsonResponse.getJSONArray("data");

            for (Object order : jsonArray) {
                JSONObject orderJson = (JSONObject) order;

                List<OrderItemModel> orderItems = new ArrayList<>();

                JSONArray itemsArray = orderJson.getJSONArray("items");

                for (Object item : itemsArray) {
                    JSONObject itemJson = (JSONObject) item;
                    orderItems.add(new OrderItemModel(
                            itemJson.getString("name"),
                            itemJson.getInt("quantity"),
                            itemJson.getDouble("price")
                    ));
                }

                orders.add(new OrderModel(
                        orderJson.getInt("code"),
                        orderJson.getDouble("total"),
                        orderJson.getString("orderDate"),
                        orderJson.getJSONObject("restaurant").getString("name"),
                        orderItems,
                        orderJson.getString("clientName")
                ));

            }

            return orders;
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