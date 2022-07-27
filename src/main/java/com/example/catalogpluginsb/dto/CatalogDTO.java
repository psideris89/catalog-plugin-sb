package com.example.catalogpluginsb.dto;

public class CatalogDTO {
    private final String id;
    private final String product;
    private final String payment;

    public CatalogDTO(String id, String product, String payment) {
        this.id = id;
        this.product = product;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public String getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id='" + id + '\'' +
                ", product='" + product + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
