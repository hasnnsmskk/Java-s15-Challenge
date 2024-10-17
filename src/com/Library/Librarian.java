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
        Book book = library.getBookById(bookId); //Kitap ID'sine göre kitabı bulmaya çalışır.

        //Eğer kitap bulunursa, book.display() ile kitabın bilgilerini ekrana basar.
        // Bulunamazsa, "Kitap bulunamadı." mesajı yazdırılır.
        if (book != null) {
            book.display();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Kitap arar (Kitap ismine göre).
    public void searchBookByName(Library library, String name) {
        Book book = library.getBookByName(name); //kitap ismiyle arama yapar.
        if (book != null) {
            book.display();
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Üyenin geçerli olup olmadığını kontrol eder.
    public boolean verifyMember(Reader reader) {
        //Üyenin var olup olmadığını kontrol eder. Eğer üye varsa true, yoksa false döner.
        if (reader != null) {
            return true;
        }
        return false;
    }

    // Üyeye kitap ödünç verir.
    public void issueBook(Library library, int bookId, Reader reader) {
        if (verifyMember(reader)) {  //ile üyenin geçerli olup olmadığını kontrol eder.
            library.lendBook(bookId, reader); //ye geçerliyse, kitabı ödünç verir
            createBill(reader, library.getBookById(bookId)); //fatura oluşturur.
        } else {
            System.out.println("Üye doğrulanamadı.");
        }
    }

    // Kitap ödünç verildiğinde üye adına fatura oluşturur.
    public void createBill(Reader reader, Book book) {
        if (book != null) { //Eğer kitap geçerliyse  fatura oluşturur ve ekrana yazdırır.
            System.out.println("Fatura oluşturuldu: " + reader.getName() + " için " + book.getPrice() + " TL.");
        }
    }

    // Kitap iadesi yapar ve fatura ödeme işlemini başlatır.
    public void returnBook(Library library, int bookId, Reader reader) {
        library.returnBook(bookId, reader); //Kitabı kütüphaneye iade eder.
        payBill(reader, library.getBookById(bookId)); //fatura ödenir.
    }

    // Kitap iade edildiğinde fatura ödemesini gerçekleştirir.
    public void payBill(Reader reader, Book book) {
        if (book != null) {
            System.out.println("Fatura ödendi: " + book.getPrice() + " TL.");
        }
    }


}
