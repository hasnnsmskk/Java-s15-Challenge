package com.Library;

// StudyBook sınıfı Book sınıfından miras alır.
public class StudyBook extends Book {

    public StudyBook(int id, String author, String title, double price, String status, String edition, String category) {
        super(id, author, title, price, status, edition, category);
    }
}
