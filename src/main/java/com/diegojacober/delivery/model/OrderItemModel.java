package com.diegojacober.delivery.model;

public class OrderItemModel {

    private String name;
    private Integer quantity;
    private Double price;

    public OrderItemModel(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderItemModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItemModel{" + "name=" + name + ", quantity=" + quantity + ", price=" + price + '}';
    }

}
