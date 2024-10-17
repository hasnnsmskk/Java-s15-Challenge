package com.Library;

// Journal sınıfı Book sınıfından miras alır.
//Book sınıfının tüm özelliklerini ve metodlarını kullanabilir.
public class Journal extends Book {
    public Journal(int id, String author, String title, double price, String status, String edition, String category) {
        super(id, author, title, price, status, edition, category);
    }
}
