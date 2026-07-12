package com.cognizant.practice.solid.srp;

public class InvoicePrinter {
    public void printInvoice(Invoice inv) {
        for (Item i : inv.items) {
            System.out.println(i.name + " : " + i.price);
        }
        System.out.println("Total : " + inv.getTotal());
    }
}
