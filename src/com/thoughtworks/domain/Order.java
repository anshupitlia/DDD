package com.thoughtworks.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();

    public Order(List<Product> products) {
        this.products = products;
    }
}
