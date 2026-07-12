package com.cognizant.practice.solid.ocp;

public class PercentageDiscount implements DiscountPolicy {
    double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    public double getDiscount(double price) {
        return price * percent / 100;
    }
}
