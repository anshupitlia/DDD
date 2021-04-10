package com.thoughtworks.domain.domain_service;

import com.thoughtworks.domain.Price;

import java.util.HashMap;

public class DiscountCalculator {
    private static HashMap<String, Price> productPrice = new HashMap<>();
    private static final float DISCOUNT_PERCENT = 0.10f;
    public static float getDiscount(String productName) {
        Price competitorPrice = productPrice.get(productName);
        return competitorPrice.getPrice() * DISCOUNT_PERCENT;
    }
}
