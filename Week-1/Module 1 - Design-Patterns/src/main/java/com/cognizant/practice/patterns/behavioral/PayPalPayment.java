package com.cognizant.practice.patterns.behavioral;

public class PayPalPayment implements PaymentStrategy {
    String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal: " + email);
    }
}
