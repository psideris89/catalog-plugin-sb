package com.example.catalogpluginsb.model;

public class CatalogDAO {
    private final String id;
    private final String product;
    private final String payment;
    private final String version;

    public CatalogDAO(String id, String product, String payment, String version) {
        this.id = id;
        this.product = product;
        this.payment = payment;
        this.version = version;
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

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "CatalogDAO{" +
                "id='" + id + '\'' +
                ", product='" + product + '\'' +
                ", payment='" + payment + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
