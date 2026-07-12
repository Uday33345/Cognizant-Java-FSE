package com.cognizant.practice.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {
    PaymentProcessor pp;
    OrderService service;

    @BeforeEach
    void setUp() {
        pp = mock(PaymentProcessor.class);
        service = new OrderService(pp);
    }

    @Test
    void testOrderSuccess() {
        when(pp.processPayment(50.0)).thenReturn(true);
        assertTrue(service.placeOrder("Book", 50.0));
    }

    @Test
    void testOrderPaymentFail() {
        when(pp.processPayment(50.0)).thenReturn(false);
        assertFalse(service.placeOrder("Book", 50.0));
    }

    @Test
    void testOrderInvalidPrice() {
        assertFalse(service.placeOrder("Book", -5.0));
        verifyNoInteractions(pp);
    }
}
