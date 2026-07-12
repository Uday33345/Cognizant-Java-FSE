package com.cognizant.practice.patterns.behavioral;

import java.util.ArrayList;

public class NewsAgency {
    ArrayList<NewsChannel> list = new ArrayList<>();

    public void addChannel(NewsChannel c) {
        list.add(c);
    }

    public void publish(String news) {
        for (NewsChannel c : list) {
            c.update(news);
        }
    }
}
