package com.diegojacober.delivery.model;

public class ProductModel {
    private Integer id;
    private String name;
    private Double value;
    private Integer restaurant_id;

    public ProductModel() {
    }

    public ProductModel(Integer id, String name, Double value, Integer restaurant_id) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.restaurant_id = restaurant_id;
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

    public Integer getRestaurant() {
        return restaurant_id;
    }

    public void setRestaurant(Integer restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    @Override
    public String toString() {
        return "ProductModel{" + "id=" + id + ", name=" + name + ", value=" + value + ", restaurant=" + restaurant_id + '}';
    }
    
    
}
