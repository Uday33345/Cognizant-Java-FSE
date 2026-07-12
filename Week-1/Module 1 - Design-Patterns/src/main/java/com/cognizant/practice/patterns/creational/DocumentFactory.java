package com.cognizant.practice.patterns.creational;

public class DocumentFactory {
    public Document create(String type) {
        if (type.equals("pdf")) return new PdfDocument();
        if (type.equals("word")) return new WordDocument();
        return null;
    }
}
