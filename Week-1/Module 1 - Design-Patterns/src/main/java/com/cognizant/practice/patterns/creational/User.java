package com.cognizant.practice.patterns.creational;

public class User {
    public String name;
    public int age;
    public String email;

    private User() {}

    public static class Builder {
        String name;
        int age;
        String email;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            User u = new User();
            u.name = this.name;
            u.age = this.age;
            u.email = this.email;
            return u;
        }
    }
}
