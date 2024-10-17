package com.Library;

import java.util.*;

// Library sınıfı kitapları ve okuyucuları yönetir.
public class Library {
    private Map<Integer, Book> books;    // Kitapların ID ile tutulduğu map
    private List<Reader> readers;        // Okuyucuların listesi
    private Set<String> authors;         // Yazarların seti

    public Library() {
        books = new HashMap<>();
        readers = new ArrayList<>();
        authors = new HashSet<>();
    }

    // Yeni bir kitap ekler.
    public void newBook(Book book) {
        books.put(book.getId(), book); // Kitap ID'si ve kitap nesnesini HashMap'e ekler.
        authors.add(book.getAuthor());  // Kitabın yazarını yazarlar listesine ekler
        System.out.println(book.getTitle() + " kütüphaneye eklendi.");
    }

    // Kitap ID'sine göre kitap arar.
    public Book getBookById(int id) {
        return books.get(id); //// Belirtilen ID'ye sahip kitabı döner.
    }

    // Kitap adına göre kitap arar.
    public Book getBookByName(String name) {

        // Tüm kitapları dolaşarak ismi eşleşen kitabı bulur.
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(name)) { // İsim karşılaştırması büyük-küçük harf duyarlılığı olmadan yapılır.
                return book;
            }
        }
        return null;
    }

    // Yazar adına göre kitapları listeler.
    public void showBooksByAuthor(String author) {
        boolean found = false; // Kitap bulunup bulunmadığını kontrol etmek için
        // Tüm kitapları dolaşarak, yazar ismine göre eşleşen kitapları listeler.
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) { // Yazar ismi eşleşirse:
                book.display(); // Kitap bilgilerini ekrana basar.
                found = true;   // Kitap bulunduğunu belirtir.
            }
        }
        if (!found) {
            System.out.println(author + " adlı yazarın kitapları bulunamadı.");
        }
    }


    //Kategoriye Göre Kitap Listeleme
    public void showBooksByCategory(String category) {
        boolean found = false;
        for (Book book : books.values()) {
            // Tüm kitapları dolaşarak, belirtilen kategoriye ait kitapları bulur..
            if (book.getCategory().equalsIgnoreCase(category)) {
                book.display(); //// Kitap bilgilerini gösterir.
                found = true;
            }
        }
        if (!found) {
            System.out.println(category + " kategorisinde kitap bulunamadı.");
        }
    }



    // Kitabı günceller.
    public void updateBook(int id, String newAuthor, String newTitle, double newPrice, String newEdition) {
        Book book = books.get(id); // Kitap ID'si ile kitabı bulur.
        if (book != null) {
            // Kitabın bilgilerini yeni verilen değerlerle günceller.
            book.setAuthor(newAuthor);
            book.setTitle(newTitle);
            book.setPrice(newPrice);
            book.setEdition(newEdition);
            System.out.println("Kitap bilgileri güncellendi: " + book.getTitle());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Kitabı siler.
    public void removeBook(int id) {
        Book removedBook = books.remove(id); // ID ile kitabı HashMap'ten çıkarır.
        if (removedBook != null) {
            System.out.println("Kitap silindi: " + removedBook.getTitle());
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }

    // Kitabı ödünç verir.
    public void lendBook(int bookId, Reader reader) {
        Book book = books.get(bookId); // Kitap ID ile bulunur.
        if (book != null) {
            // Kitap daha önce ödünç alınmamışsa
            if (book.getOwner().isEmpty()) {
                reader.borrowBook(book); // Okuyucuya kitabı ödünç verir.


            } else {
                // Kitap zaten ödünç alınmışsa mesaj verir.
                System.out.println(book.getTitle() + " şu anda " + book.getOwner() + " tarafından ödünç alınmıştır.");
                System.out.println("İsterseniz başka bir kitap ödünç alabilirsiniz.");
            }
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }



    // Kitabı geri alır.
    public void returnBook(int bookId, Reader reader) {
        Book book = books.get(bookId); // Kitap ID ile bulunur.
        // Kitap okuyucunun ödünç aldığı kitapsa, geri alır.
        if (book != null && book.getOwner().equals(reader.getName())) {
            reader.returnBook(book);  // Okuyucu kitabı geri verir.
        } else {
            System.out.println("Kitap ya bulunamadı ya da bu kitap senin ödünç aldığın kitaplar arasında değil.");
        }
    }

    // Tüm kitapları gösterir.
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Kütüphanede hiç kitap yok.");
        } else {
            System.out.println("Kütüphanedeki tüm kitaplar:");
            for (Book book : books.values()) {
                book.display();
            }
        }
    }

    public List<Reader> getReaders() {
        return readers; // readers, kütüphanedeki okuyucuları tutan bir listedir.
    }

    // Okuyucu ekler.
    public void addReader(Reader reader) {
        readers.add(reader); // Okuyucuyu listeye ekler.
        System.out.println("Okuyucu eklendi: " + reader.getName());
    }


    // Okuyucu bulur.
    public Reader getReaderByName(String name) {
        // Tüm okuyucuları dolaşarak ismi eşleşen okuyucuyu döner.
        for (Reader reader : readers) {
            if (reader.getName().equalsIgnoreCase(name)) { //iki string'in aynı olup olmadığını kontrol ederken büyük/küçük harf farkını göz ardı eder.
                return reader;
            }
        }
        return null;
    }
}
