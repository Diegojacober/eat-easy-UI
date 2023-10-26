package com.diegojacober.delivery.model;


public class UserModel {
    
    private String email;
    private String accessToken;
    private String refreshToken;

    public UserModel() {
    }

    public UserModel(String email, String accessToken, String refreshToken) {
        this.email = email;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "UserModel{" + "email=" + email + ", accessToken=" + accessToken + ", refreshToken=" + refreshToken + '}';
    }
}
