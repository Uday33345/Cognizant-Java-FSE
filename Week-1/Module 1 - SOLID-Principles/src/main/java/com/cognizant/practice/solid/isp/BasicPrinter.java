package com.cognizant.practice.solid.isp;

public class BasicPrinter implements Printer {
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
