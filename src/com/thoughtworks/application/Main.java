package com.thoughtworks.application;

import com.thoughtworks.domain.Cart;
import com.thoughtworks.domain.Order;
import com.thoughtworks.domain.domain_service.DiscountCalculator;
import com.thoughtworks.domain.Product;
import com.thoughtworks.domain.Item;


public class Main {

    public static void main(String[] args) {

        Cart cart =new Cart();
        Item ipad =new Item(new Product("Ipad",100f));
        cart.add(ipad);
        String productName = "Hero ink Pen";
        Product hero_ink_pen = new Product(productName, 200f);
        hero_ink_pen.setDiscountedPrice(DiscountCalculator.getDiscount(productName));
        cart.add(new Item(hero_ink_pen));
        cart.add(new Item(new Product("GM Cricket bat",300f),2));

        cart.remove(ipad);

        System.out.println(cart.getDeletedItems());

        Cart cart2 =new Cart();
        cart2.add(new Item(hero_ink_pen));
        Order order = cart.checkout();

        System.out.println(cart.equals(cart2));

    }
}
