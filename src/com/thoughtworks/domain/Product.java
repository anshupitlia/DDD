package com.thoughtworks.domain;

public class Product {

    private String name;
    private Price price;
    private Price discountedPrice;

    public Product(String name,float price) {
        this.name = name;
        this.price=new Price(price);
    }

    public String getName() {
        return name;
    }

    public void setDiscountedPrice(float discountedPrice) {
        this.discountedPrice = new Price(this.price.getPrice() - discountedPrice);
    }
}
