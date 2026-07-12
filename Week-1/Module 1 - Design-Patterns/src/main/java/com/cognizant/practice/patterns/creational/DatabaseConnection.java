package com.cognizant.practice.patterns.creational;

public class DatabaseConnection {
    private static DatabaseConnection obj;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (obj == null) {
            obj = new DatabaseConnection();
        }
        return obj;
    }

    public void connect() {
        System.out.println("Connected to DB");
    }
}
