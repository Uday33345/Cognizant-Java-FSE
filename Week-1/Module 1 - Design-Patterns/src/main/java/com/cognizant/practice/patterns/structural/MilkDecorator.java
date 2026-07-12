package com.cognizant.practice.patterns.structural;

public class MilkDecorator implements Coffee {
    Coffee c;

    public MilkDecorator(Coffee c) {
        this.c = c;
    }

    public double getCost() {
        return c.getCost() + 0.5;
    }

    public String getDesc() {
        return c.getDesc() + " + Milk";
    }
}
