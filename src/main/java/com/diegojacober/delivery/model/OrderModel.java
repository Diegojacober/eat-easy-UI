package com.diegojacober.delivery.model;

import java.util.List;

public class OrderModel {

    private Integer id;
    private Double total;
    private String date;
    private String restaurantName;
    private List<OrderItemModel> items;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public OrderModel(Integer id, Double total, String date, String restaurantName, List<OrderItemModel> items) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.restaurantName = restaurantName;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<OrderItemModel> getItems() {
        return items;
    }

    public void addItems(OrderItemModel item) {
        this.items.add(item);
    }
}
