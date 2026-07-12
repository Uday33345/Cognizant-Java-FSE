package com.cognizant.practice.patterns;

import com.cognizant.practice.patterns.creational.*;
import com.cognizant.practice.patterns.structural.*;
import com.cognizant.practice.patterns.behavioral.*;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();

        DocumentFactory df = new DocumentFactory();
        Document d = df.create("pdf");
        d.open();

        User u = new User.Builder().name("Yash").age(21).email("yash@mail.com").build();
        System.out.println("User: " + u.name + ", " + u.age);

        LegacyPrinter lp = new LegacyPrinter();
        Printer p = new PrinterAdapter(lp);
        p.print("Hello");

        Coffee c = new MilkDecorator(new SimpleCoffee());
        System.out.println(c.getDesc() + " : " + c.getCost());

        NewsAgency agency = new NewsAgency();
        agency.addChannel(new NewsChannel("BBC"));
        agency.addChannel(new NewsChannel("CNN"));
        agency.publish("New update available");

        ShoppingCart cart = new ShoppingCart(100);
        cart.checkout(new CreditCardPayment("1234-5678"));
        cart.checkout(new PayPalPayment("yash@paypal.com"));
    }
}
