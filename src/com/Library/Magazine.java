package com.Library;

// Magazine sınıfı Book sınıfından miras alır.
public class Magazine extends Book {
    public Magazine(int id, String author, String title, double price, String status, String edition, String category) {
        super(id, author, title, price, status, edition, category);
    }
}
