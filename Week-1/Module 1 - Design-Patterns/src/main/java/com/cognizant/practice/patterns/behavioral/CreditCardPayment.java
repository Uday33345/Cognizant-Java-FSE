package com.cognizant.practice.patterns.behavioral;

public class CreditCardPayment implements PaymentStrategy {
    String cardNo;

    public CreditCardPayment(String cardNo) {
        this.cardNo = cardNo;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " via card " + cardNo);
    }
}
