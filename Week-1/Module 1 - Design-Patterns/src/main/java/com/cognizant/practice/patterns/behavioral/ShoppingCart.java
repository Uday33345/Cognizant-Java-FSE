package com.cognizant.practice.patterns.behavioral;

public class ShoppingCart {
    double total;

    public ShoppingCart(double total) {
        this.total = total;
    }

    public void checkout(PaymentStrategy p) {
        p.pay(total);
    }
}
