package com.cognizant.practice.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {
    Logger log = LoggerFactory.getLogger(OrderService.class);
    PaymentProcessor processor;

    OrderService(PaymentProcessor processor) {
        this.processor = processor;
    }

    boolean placeOrder(String item, double price) {
        log.info("Placing order: {} for {}", item, price);
        if (price <= 0) {
            log.warn("Invalid price: {}", price);
            return false;
        }
        boolean result = processor.processPayment(price);
        if (result) {
            log.info("Order success: {}", item);
        } else {
            log.error("Payment failed: {}", item);
        }
        return result;
    }
}
