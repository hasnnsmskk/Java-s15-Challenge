package com.Library;

// Librarian sınıfı kütüphaneciyi temsil eder ve kitap yönetimi yapar.
public class Librarian extends Person {
    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    // Kitap arar (Kitap ID'ye göre).
    public void searchBook(Library library, int bookId) {
        Book book = library.getBookById(bookId);
        if (book != null) {
            book.display();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Kitap arar (Kitap ismine göre).
    public void searchBookByName(Library library, String name) {
        Book book = library.getBookByName(name);
        if (book != null) {
            book.display();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Üyeyi doğrular.
    public boolean verifyMember(Reader reader) {
        // Basit doğrulama: Okuyucu mevcut mu kontrol edilir.
        if (reader != null) {
            return true;
        }
        return false;
    }

    // Kitap verir.
    public void issueBook(Library library, int bookId, Reader reader) {
        if (verifyMember(reader)) {
            library.lendBook(bookId, reader);
            createBill(reader, library.getBookById(bookId));
        } else {
            System.out.println("Üye doğrulanamadı.");
        }
    }

    // Fatura oluşturur.
    public void createBill(Reader reader, Book book) {
        if (book != null) {
            System.out.println("Fatura oluşturuldu: " + reader.getName() + " için " + book.getPrice() + " TL.");
        }
    }

    // Kitabı geri alır.
    public void returnBook(Library library, int bookId, Reader reader) {
        library.returnBook(bookId, reader);
        payBill(reader, library.getBookById(bookId));
    }

    // Fatura öder.
    public void payBill(Reader reader, Book book) {
        if (book != null) {
            System.out.println("Fatura ödendi: " + book.getPrice() + " TL.");
        }
    }


}
