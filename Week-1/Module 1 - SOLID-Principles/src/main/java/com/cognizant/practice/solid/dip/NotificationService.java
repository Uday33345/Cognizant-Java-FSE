package com.cognizant.practice.solid.dip;

public class NotificationService {
    MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String msg) {
        sender.send(msg);
    }
}
