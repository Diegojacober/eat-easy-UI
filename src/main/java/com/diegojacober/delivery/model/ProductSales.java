package com.diegojacober.delivery.model;

public class ProductSales {

    private Integer productId;
    private String productName;
    private Double productValue;
    private Integer salesQuantity;
    private Double salesTotal;

    public ProductSales(Integer productId, String productName, Double productValue, Integer salesQuantity, Double salesTotal) {
        this.productId = productId;
        this.productName = productName;
        this.productValue = productValue;
        this.salesQuantity = salesQuantity;
        this.salesTotal = salesTotal;
    }

    public ProductSales() {
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    public void setProductValue(Double productValue) {
        this.productValue = productValue;
    }

    public Integer getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(Integer salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public Double getSalesTotal() {
        return salesTotal;
    }

    public void setSalesTotal(Double salesTotal) {
        this.salesTotal = salesTotal;
    }

    @Override
    public String toString() {
        return "ProductSales{" + "productId=" + productId + ", productName=" + productName + ", productValue=" + productValue + ", salesQuantity=" + salesQuantity + ", salesTotal=" + salesTotal + '}';
    }
    
    

}
