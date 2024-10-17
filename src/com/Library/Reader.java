package com.Library;

import java.util.ArrayList;
import java.util.List;

// Reader sınıfı kitapları alıp iade edebilen okuyucuları temsil eder.
public class Reader extends Person {
    private List<Book> borrowedBooks; // Okuyucunun ödünç aldığı kitapların listesi
    private int noBooksIssued;        // Alınan kitap sayısı
    private static final int MAX_BOOK_LIMIT = 5; // Maksimum alınabilecek kitap sayısı

    public Reader(String name) {
        super(name);
        borrowedBooks = new ArrayList<>();
        noBooksIssued = 0;
    }

    // Kitap satın alır.
    public void purchaseBook(Book book) {
        System.out.println(name + " kitabı satın aldı: " + book.getTitle());
    }

    // Kitap ödünç alır.
    public void borrowBook(Book book) {
        if (noBooksIssued < MAX_BOOK_LIMIT && book.getOwner().isEmpty()) {
            borrowedBooks.add(book);
            noBooksIssued++;
            book.setStatus("Ödünç Verildi");
            book.setOwner(this.name);
            System.out.println(name + " kitabı ödünç aldı: " + book.getTitle());
        } else if (noBooksIssued >= MAX_BOOK_LIMIT) {
            System.out.println(name + " kitap limitine ulaştı.");
        } else {
            System.out.println("Kitap zaten ödünç alınmış: " + book.getTitle());
        }
    }

    // Kitap geri iade eder.
    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            noBooksIssued--;
            book.setStatus("Mevcut");
            book.setOwner("");
            System.out.println(name + " kitabı geri iade etti: " + book.getTitle());
        } else {
            System.out.println("Bu kitap senin ödünç aldığın kitaplar arasında değil.");
        }
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    @Override
    public String whoYouAre() {
        return "Ben bir okuyucuyum: " + name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks; // Ödünç alınan kitapları döndür
    }
}
