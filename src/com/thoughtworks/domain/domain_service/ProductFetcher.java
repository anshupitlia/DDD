package com.thoughtworks.domain.domain_service;

import com.thoughtworks.domain.Item;
import com.thoughtworks.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFetcher {
    public static List<Product> getProducts(List<Item> items) {
        return items.stream().map(Item::getProduct).collect(Collectors.toList());
    }
}
