package com.cognizant.practice.solid.dip;

public class SmsSender implements MessageSender {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}
