package com.cognizant.practice.solid.srp;

import java.io.FileWriter;

public class InvoiceRepository {
    public void saveToFile(Invoice inv) {
        try {
            FileWriter fw = new FileWriter("invoice.txt");
            fw.write("Total: " + inv.getTotal());
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
