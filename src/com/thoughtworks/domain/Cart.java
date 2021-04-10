package com.thoughtworks.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    private List<Item> items= new ArrayList();
    private List<String> deletedItems =new ArrayList<>();

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

    @Override
    public boolean equals(Object obj) {
        Cart secondObj =(Cart) obj;
        return (this.items.equals(secondObj.getItems()));

    }
}
