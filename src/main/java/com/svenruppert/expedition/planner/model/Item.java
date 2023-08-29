package com.svenruppert.expedition.planner.model;

import java.time.LocalDate;

public abstract class Item {

    private int weight;
    private String productLink;
    private String productName;


    private double price;
    private LocalDate priceDate;
    private PriceCurrency priceCurrency;



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(LocalDate priceDate) {
        this.priceDate = priceDate;
    }

    public PriceCurrency getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(PriceCurrency priceCurrency) {
        this.priceCurrency = priceCurrency;
    }


    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", productLink='" + productLink + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", priceDate=" + priceDate +
                ", priceCurrency=" + priceCurrency +
                '}';
    }
}
