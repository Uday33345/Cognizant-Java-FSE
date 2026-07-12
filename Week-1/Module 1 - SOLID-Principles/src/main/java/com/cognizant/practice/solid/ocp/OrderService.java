package com.cognizant.practice.solid.ocp;

public class OrderService {
    public double getFinalPrice(double total, DiscountPolicy policy) {
        return total - policy.getDiscount(total);
    }
}
