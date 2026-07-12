package com.cognizant.practice.solid.srp;

import java.util.ArrayList;

public class Invoice {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (Item i : items) {
            total += i.price;
        }
        return total;
    }
}
