package com.diegojacober.delivery.model;

public class ProductModel {
    private Integer id;
    private String name;
    private Double value;
    private RestaurantModel restaurant;

    public ProductModel() {
    }

    public ProductModel(Integer id, String name, Double value, RestaurantModel restaurant) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.restaurant = restaurant;
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

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public RestaurantModel getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantModel restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "ProductModel{" + "id=" + id + ", name=" + name + ", value=" + value + ", restaurant=" + restaurant + '}';
    }
    
    
}
