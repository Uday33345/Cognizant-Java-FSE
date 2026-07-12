package com.cognizant.practice.solid.isp;

public class AllInOnePrinter implements Printer, Scanner, Fax {
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }

    public void scan(String doc) {
        System.out.println("Scanning: " + doc);
    }

    public void fax(String doc) {
        System.out.println("Faxing: " + doc);
    }
}
