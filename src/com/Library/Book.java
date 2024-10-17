package com.Library;

// Book sınıfı kitap bilgilerini tutar ve ilgili işlemleri sağlar.
public class Book implements LibraryItem {
    private int id;                 // Kitap ID'si
    private String author;          // Yazar adı
    private String title;           // Kitap başlığı
    private double price;           // Kitap fiyatı
    private String status;          // Kitap durumu (mevcut/ödünçte/yok)
    private String edition;         // Kitap baskısı
    private String owner;           // Kitabın sahibi (ödünç alan okuyucu adı)
    private String category;        // Yeni kategori değişkeni


    public Book(int id, String author, String title, double price, String status, String edition, String category) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.price = price;
        this.status = status; // Kitap durumu
        this.edition = edition; // Kitap baskısı
        this.owner = "";
        this.category = category;  // Kategori ekleniyor
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public String getEdition() {
        return edition;
    }

    public String getOwner() {
        return owner;
    }

    public String getCategory() {
        return category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Kitap bilgilerini ekrana basar.
    @Override
    public void display() {
        System.out.println("Kitap ID: " + id + ", Başlık: " + title + ", Yazar: " + author + ", Fiyat: " + price + " TL, Durum: " + status + ", Baskı: " + edition + ", Kategori: " + category);
    }
}
