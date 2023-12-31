package com.diegojacober.delivery.services;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.diegojacober.delivery.dao.RestaurantDAO;
import com.diegojacober.delivery.model.RestaurantModel;
import com.diegojacober.delivery.model.UserModel;

public class UserService {

    static String URL = "http://localhost:8080/api/v1";

    public static UserModel login(String username, String password) {
        String path = URL + "/auth/authenticate";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpPost httpPost = new HttpPost(path);

            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("email", username);
            jsonRequest.put("password", password);

            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");

            response = httpClient.execute(httpPost);

            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            JSONObject jsonResponse = new JSONObject(responseString);

            String accessToken = jsonResponse.get("access_token").toString();
            String refreshToken = jsonResponse.get("refresh_token").toString();
            String name = jsonResponse.get("name").toString();
            return new UserModel(username, accessToken, refreshToken, name);

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

    public static String GetRoleLoggedUser(UserModel user) {

        String path = URL + "/users/me";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpGet httpGet = new HttpGet(path);

            httpGet.setHeader("Content-Type", "application/json");
            httpGet.setHeader("Authorization", "Bearer " + user.getAccessToken());

            response = httpClient.execute(httpGet);

            HttpEntity responseEntity = response.getEntity();
            String responseString = EntityUtils.toString(responseEntity);

            JSONObject jsonResponse = new JSONObject(responseString);

            if (jsonResponse.getJSONArray("roles").toList().contains("ROLE_ADMIN")) {
                return "ADMIN";
            } else {
                return "USER";
            }

        } catch (Exception e) {
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

    public static UserModel registerClient(String name, String email, String password) {
        String path = URL + "/auth/register";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpPost httpPost = new HttpPost(path);

            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("firstname", name);
            jsonRequest.put("lastname", name);
            jsonRequest.put("email", email);
            jsonRequest.put("password", password);
            jsonRequest.put("role", "USER");

            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");

            response = httpClient.execute(httpPost);

            HttpEntity responseEntity = response.getEntity();

            String responseString = EntityUtils.toString(responseEntity);

            JSONObject jsonResponse = new JSONObject(responseString);

            if (response.getStatusLine().getStatusCode() == 400) {
                System.out.println(jsonResponse.toString());
                throw new Exception("campos inválidos");
            }

            String accessToken = jsonResponse.get("access_token").toString();
            String refreshToken = jsonResponse.get("refresh_token").toString();

            return new UserModel(name, accessToken, refreshToken, name);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

    public static UserModel registerRestaurant(String name, String email, String password, String locationX, String locationY) {
        String path = URL + "/auth/register";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpPost httpPost = new HttpPost(path);

            JSONObject jsonRequest = new JSONObject();
            jsonRequest.put("firstname", name);
            jsonRequest.put("lastname", name);
            jsonRequest.put("email", email);
            jsonRequest.put("password", password);
            jsonRequest.put("role", "ADMIN");

            StringEntity requestEntity = new StringEntity(jsonRequest.toString());
            httpPost.setEntity(requestEntity);
            httpPost.setHeader("Content-Type", "application/json");

            response = httpClient.execute(httpPost);

            HttpEntity responseEntity = response.getEntity();

            String responseString = EntityUtils.toString(responseEntity);

            JSONObject jsonResponse = new JSONObject(responseString);

            if (response.getStatusLine().getStatusCode() == 400) {
                System.out.println(jsonResponse.toString());
                throw new Exception("campos inválidos");
            }

            String accessToken = jsonResponse.get("access_token").toString();
            String refreshToken = jsonResponse.get("refresh_token").toString();

            RestaurantDAO restaurantDAO = new RestaurantDAO();

            try {
                RestaurantModel restaurant = new RestaurantModel(null, name, LocalDateTime.now(), locationX, locationY);
                restaurantDAO.save(restaurant);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                return new UserModel();
            }

            return new UserModel(name, accessToken, refreshToken, name);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

    public static boolean logout(UserModel user) {
        String path = URL + "/auth/logout";

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;

        try {
            HttpGet httpGet = new HttpGet(path);

            httpGet.setHeader("Content-Type", "application/json");
            httpGet.setHeader("Authorization", "Bearer " + user.getAccessToken());

            response = httpClient.execute(httpGet);

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
