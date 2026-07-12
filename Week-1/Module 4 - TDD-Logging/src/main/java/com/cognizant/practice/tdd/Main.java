package com.cognizant.practice.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("App started");

        OrderService service = new OrderService(amount -> amount > 0);
        service.placeOrder("Headphones", 89.99);
        service.placeOrder("InvalidItem", -5.0);

        log.info("App done");
    }
}
