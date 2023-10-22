package com.diegojacober.delivery.model;

import java.time.LocalDateTime;


public class RestaurantModel {
    private Integer id;
    private String name;
    private LocalDateTime createdAt;
    private String locationX;
    private String locationY;

    public RestaurantModel() {
    }

    public RestaurantModel(Integer id, String name, LocalDateTime createdAt, String locationX, String locationY) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.locationX = locationX;
        this.locationY = locationY;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getLocationX() {
        return locationX;
    }

    public void setLocationX(String locationX) {
        this.locationX = locationX;
    }

    public String getLocationY() {
        return locationY;
    }

    public void setLocationY(String locationY) {
        this.locationY = locationY;
    }
    
    
}
