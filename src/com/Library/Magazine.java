package com.Library;

//Magazine sınıfı, Book sınıfının tüm özelliklerini ve metodlarını devralır
// ve bu sayede tekrar kod yazmadan aynı özelliklerden faydalanabilirsiniz.
public class Magazine extends Book {
    public Magazine(int id, String author, String title, double price, String status, String edition, String category) {
        super(id, author, title, price, status, edition, category);
    }
}
