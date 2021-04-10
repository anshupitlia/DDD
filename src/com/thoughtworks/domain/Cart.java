package com.thoughtworks.domain;

import com.thoughtworks.domain.domain_service.ProductFetcher;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    private List<Item> items= new ArrayList();
    private List<String> deletedItems =new ArrayList<>();
    private boolean isCheckedOut;

    public void add(Item item)
    {
        items.add(item);
    }
    public void remove(Item item)
    {
        items.remove(item);
        deletedItems.add(item.getProduct().getName());
    }

    public List<String> getDeletedItems()
    {
        return(deletedItems);
    }

    public List<Item> getItems() {
        return items;
    }

    public Order checkout() {
        isCheckedOut = true;
        return new Order(ProductFetcher.getProducts(this.items));
    }

    @Override
    public boolean equals(Object obj) {
        Cart secondObj =(Cart) obj;
        return (this.items.equals(secondObj.getItems()));

    }
}
