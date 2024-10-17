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
        borrowedBooks = new ArrayList<>(); //// Ödünç alınan kitaplar için boş bir liste başlatılır.
        noBooksIssued = 0; //// İlk başta ödünç alınan kitap sayısı sıfırdır.
    }

    // Kitap satın alır.
    public void purchaseBook(Book book) {
        System.out.println(name + " kitabı satın aldı: " + book.getTitle());
    }

    // Kitap ödünç alır.
    public void borrowBook(Book book) {

        //Eğer okuyucu 5 kitap limitine ulaşmamışsa ve kitap henüz başka biri tarafından ödünç alınmamışsa,
        // kitap okuyucunun ödünç aldığı kitaplar listesine eklenir.
        if (noBooksIssued < MAX_BOOK_LIMIT && book.getOwner().isEmpty()) {
            borrowedBooks.add(book); // Kitap listeye eklenir.
            noBooksIssued++;  // Alınan kitap sayısı bir artırılır.
            book.setStatus("Ödünç Verildi");  // Kitap durumu "Ödünç Verildi" olarak güncellenir.
            book.setOwner(this.name); // Kitabın sahibi bu okuyucu olarak belirlenir.
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
            borrowedBooks.remove(book); // Kitap listeden çıkarılır.
            noBooksIssued--; // Ödünç alınan kitap sayısı bir azaltılır.
            book.setStatus("Mevcut");  // Kitabın durumu "Mevcut" olarak güncellenir.
            book.setOwner("");  // Kitabın sahibi boşaltılır.
            System.out.println(name + " kitabı geri iade etti: " + book.getTitle());
        } else {
            System.out.println("Bu kitap senin ödünç aldığın kitaplar arasında değil.");
        }
    }

    public int getNoBooksIssued() {
        return noBooksIssued; // Ödünç alınan kitap sayısını döndürür.
    }

    @Override
    public String whoYouAre() {
        return "Ben bir okuyucuyum: " + name; // Kim olduğunu döndürür.
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks; // Ödünç alınan kitapları döndür
    }
}
