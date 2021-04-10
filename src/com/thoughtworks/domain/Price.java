package com.thoughtworks.domain;
import java.util.Currency;

public class Price {

    public float getPrice() {
        return price;
    }

    private float price;
    private Currency currency=Currency.getInstance("INR");

    public Price(float price) {
        this.price = price;
    }
}
