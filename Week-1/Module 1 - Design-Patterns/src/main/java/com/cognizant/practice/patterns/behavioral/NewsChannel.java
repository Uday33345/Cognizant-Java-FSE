package com.cognizant.practice.patterns.behavioral;

public class NewsChannel {
    String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(name + " got news: " + news);
    }
}
