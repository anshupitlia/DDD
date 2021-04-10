package com.thoughtworks.domain;

public class Product {

    private String name;
    private int quantity;
    private Price price;
    private Price discountedPrice;

    public Product(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price=new Price(price);
    }

    public Product(String name,float price) {
        this.name = name;
        this.quantity = 1;
        this.price=new Price(price);
    }

    public String getName() {
        return name;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = new Price(this.price.getPrice() - discountedPrice);
    }
}
