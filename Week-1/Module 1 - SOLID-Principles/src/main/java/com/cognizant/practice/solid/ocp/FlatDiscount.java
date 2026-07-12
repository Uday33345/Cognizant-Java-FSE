package com.cognizant.practice.solid.ocp;

public class FlatDiscount implements DiscountPolicy {
    double amount;

    public FlatDiscount(double amount) {
        this.amount = amount;
    }

    public double getDiscount(double price) {
        return amount;
    }
}
