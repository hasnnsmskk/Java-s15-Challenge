package com.Library;

public abstract class Person {
    protected String name; // Kişinin adı

    public Person(String name) {
        this.name = name;
    }

    public String whoYouAre() {
        return "Ben bir kişi: " + name;
    }

    public String getName() {
        return name;
    }
}
