import com.Library.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader = new Reader("Hasan");
        Librarian librarian = new Librarian("Gökhan", "1234");
        Scanner scanner = new Scanner(System.in);

        // Okuyucu ekleme
        library.addReader(reader);

        // Kütüphaneye gerçek kitap örnekleri ekleyelim


        library.newBook(new Book(1, "Robert C. Martin", "Clean Code", 45, "mevcut", "1st", "Programming"));
        library.newBook(new Book(2, "Joshua Bloch", "Effective Java", 60, "mevcut", "3rd", "Programming"));
        library.newBook(new Book(3, "Andrew Hunt, David Thomas", "The Pragmatic Programmer", 55, "mevcut", "1st", "Programming"));
        library.newBook(new Book(4, "Eric Evans", "Domain-Driven Design", 65, "mevcut", "1st", "Software Engineering"));
        library.newBook(new Book(5, "Martin Fowler", "Refactoring", 50, "mevcut", "2nd", "Software Engineering"));
        library.newBook(new Book(6, "Brian Goetz", "Java Concurrency in Practice", 70, "mevcut", "1st", "Programming"));
        library.newBook(new Book(7, "Donald Knuth", "The Art of Computer Programming", 120, "mevcut", "3rd", "Computer Science"));
        library.newBook(new Book(8, "Kent Beck", "Test Driven Development: By Example", 40, "mevcut", "1st", "Software Engineering"));
        library.newBook(new Book(9, "Robert C. Martin", "Agile Software Development", 55, "mevcut", "1st", "Software Development Methodologies"));



        // StudyBook kategorisi
        library.newBook(new StudyBook(10, "K. F. Riley", "Vector Calculus", 70, "mevcut", "2nd", "StudyBook"));
        library.newBook(new StudyBook(11, "K. F. Riley", "Advanced Engineering Mathematics", 85, "mevcut", "3rd", "StudyBook"));
        library.newBook(new StudyBook(12, "K. F. Riley, M. P. Hobson", "Mathematical Methods for Physics and Engineering", 80, "mevcut", "2nd", "StudyBook"));
        library.newBook(new StudyBook(13, "Gilbert Strang", "Linear Algebra and Its Applications", 75, "mevcut", "4th", "StudyBook"));
        library.newBook(new StudyBook(14, "David Griffiths", "Introduction to Electrodynamics", 85, "mevcut", "3rd", "StudyBook"));
        library.newBook(new StudyBook(15, "Michael Spivak", "Calculus", 90, "mevcut", "4th", "StudyBook"));
        library.newBook(new StudyBook(16, "Daniel Kleppner, Robert Kolenkow", "An Introduction to Mechanics", 60, "mevcut", "1st", "StudyBook"));

        // Journal kategorisi
        library.newBook(new Journal(17, "Nature", "Nature Reviews", 35, "mevcut", "2nd", "Journal"));
        library.newBook(new Journal(18, "Nature", "Nature Communications", 40, "mevcut", "3rd", "Journal"));
        library.newBook(new Journal(19, "Nature", "Scientific Reports", 45, "mevcut", "1st", "Journal"));
        library.newBook(new Journal(20, "Nature", "Nature Journal", 30, "mevcut", "1st", "Journal"));
        library.newBook(new Journal(21, "IEEE", "IEEE Transactions on Computers", 35, "mevcut", "2nd", "Journal"));
        library.newBook(new Journal(22, "ACM", "ACM Computing Surveys", 25, "mevcut", "3rd", "Journal"));
        library.newBook(new Journal(23, "Elsevier", "Journal of Applied Physics", 40, "mevcut", "5th", "Journal"));
        library.newBook(new Journal(24, "Wiley", "Journal of Computational Physics", 50, "mevcut", "4th", "Journal"));

        // Magazine kategorisi
        library.newBook(new Magazine(25, "Wired", "Wired UK", 25, "mevcut", "1st", "Magazine"));
        library.newBook(new Magazine(26, "Wired", "Wired Japan", 30, "mevcut", "2nd", "Magazine"));
        library.newBook(new Magazine(27, "Wired", "Wired Magazine", 20, "mevcut", "2nd","Magazine"));
        library.newBook(new Magazine(28, "Forbes", "Forbes Magazine", 25, "mevcut", "3rd", "Magazine"));
        library.newBook(new Magazine(29, "National Geographic", "National Geographic Magazine", 30, "mevcut", "1st", "Magazine"));
        library.newBook(new Magazine(30, "Time", "Time Magazine", 35, "mevcut", "4th", "Magazine"));
        library.newBook(new Magazine(31, "Scientific American", "Scientific American Magazine", 28, "mevcut", "5th", "Magazine"));

        while (true) {
            // Ana menü
            System.out.println("\n=== Kütüphane Yönetim Sistemi ===");
            System.out.println("1.  Kitap Ekle");
            System.out.println("2.  Kitapları Listele");
            System.out.println("3.  Kitap Ara (ID ile)");
            System.out.println("4.  Kitap Ara (İsim ile)");
            System.out.println("5.  Yazarın Tüm Kitaplarını Listele");
            System.out.println("6.  Kitap Güncelle");
            System.out.println("7.  Kitap Sil");
            System.out.println("8.  Kitap Ödünç Al");
            System.out.println("9.  Kitap İade Et");
            System.out.println("10. Okuyucunun Ödünç Aldığı Kitapları Göster");
            System.out.println("11. Kitap Satın Al");
            System.out.println("12. Okuyucunun Alınan Kitap Sayısını Göster");
            System.out.println("13. Yeni Üye Oluştur");
            System.out.println("14. Kayıtlı Okuyucuları Göster");
            System.out.println("15. Kategoriye Göre Kitaları Göster");
            System.out.println("0.  Çıkış");
            System.out.print("Bir seçenek giriniz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu yakalamak için

            switch (choice) {
                case 1: // Kitap Ekleme
                    System.out.print("Kitap ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    System.out.print("Yazar: ");
                    String author = scanner.nextLine();
                    System.out.print("Başlık: ");
                    String title = scanner.nextLine();
                    System.out.print("Fiyat: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    System.out.print("Baskı: ");
                    String edition = scanner.nextLine();
                    System.out.print("Kitap Türü (1- Book, 2- StudyBook, 3- Journal, 4- Magazine): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için

                    Book newBook;
                    String category = "belirtilen_kategori"; // Kategoriyi burada belirtin, kullanıcıdan alabilirsiniz

                    switch (type) {
                        case 1:
                            newBook = new Book(id, author, title, price, "mevcut", edition, category);
                            break;
                        case 2:
                            newBook = new StudyBook(id, author, title, price, "mevcut", edition, category);
                            break;
                        case 3:
                            newBook = new Journal(id, author, title, price, "mevcut", edition, category);
                            break;
                        case 4:
                            newBook = new Magazine(id, author, title, price, "mevcut", edition, category);
                            break;
                        default:
                            System.out.println("Geçersiz kitap türü. Book olarak eklendi.");
                            newBook = new Book(id, author, title, price, "mevcut", edition, category);
                    }

                    library.newBook(newBook);


                case 2: // Kitapları Listeleme
                    library.showBooks();
                    break;

                case 3: // Kitap Arama (ID ile)
                    System.out.print("Aranacak Kitap ID'si: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    librarian.searchBook(library, searchId);
                    break;

                case 4: // Kitap Arama (İsim ile)
                    System.out.print("Aranacak Kitap İsmi: ");
                    String searchName = scanner.nextLine();
                    librarian.searchBookByName(library, searchName);
                    break;

                case 5: // Yazarın Tüm Kitaplarını Listele
                    System.out.print("Yazarın İsmi: ");
                    String searchAuthor = scanner.nextLine();
                    library.showBooksByAuthor(searchAuthor);
                    break;

                case 6: // Kitap Güncelleme
                    System.out.print("Güncellenecek Kitap ID'si: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    Book bookToUpdate = library.getBookById(updateId);
                    if (bookToUpdate != null) {
                        System.out.print("Yeni Yazar: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Yeni Başlık: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Yeni Fiyat: ");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine(); // Boşluğu yakalamak için
                        System.out.print("Yeni Baskı: ");
                        String newEdition = scanner.nextLine();
                        library.updateBook(updateId, newAuthor, newTitle, newPrice, newEdition);
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;

                case 7: // Kitap Silme
                    System.out.print("Silinecek Kitap ID'si: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    library.removeBook(removeId);
                    break;

                case 8: // Kitap Ödünç Alma
                    System.out.print("Ödünç alınacak kitap ID'si: ");
                    int borrowId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    Book bookToBorrow = library.getBookById(borrowId);
                    if (bookToBorrow != null) {
                        if (bookToBorrow.getStatus().equals("mevcut")) {
                            librarian.issueBook(library, borrowId, reader);
                            bookToBorrow.setStatus("ödünçte"); // Durumu güncelle
                        } else {
                            System.out.println("Kitap kütüphanede bulunmamaktadır.");
                        }
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;

                // Kitap iade işlemi sonrası kitap durumunu güncelle
                case 9: // Kitap İade Etme
                    System.out.print("İade edilecek kitap ID'si: ");
                    int returnId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    Book bookToReturn = library.getBookById(returnId);
                    if (bookToReturn != null) {
                        librarian.returnBook(library, returnId, reader);
                        bookToReturn.setStatus("mevcut"); // Durumu güncelle
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;

                case 10: // Okuyucunun Ödünç Aldığı Kitapları Göster
                    System.out.print("Ödünç alınan kitapları görmek istediğiniz okuyucunun adını girin: ");
                    String readerNameToShow = scanner.nextLine();
                    Reader readerToShow = library.getReaderByName(readerNameToShow);
                    if (readerToShow != null) {
                        System.out.println(readerToShow.getName() + " tarafından ödünç alınan kitaplar:");
                        for (Book borrowedBook : readerToShow.getBorrowedBooks()) {
                            borrowedBook.display(); // Okuyucunun ödünç aldığı kitapları göster
                        }
                    } else {
                        System.out.println("Okuyucu bulunamadı.");
                    }
                    break;
                case 11: // Kitap Satın Alma
                    System.out.print("Satın alınacak kitap ID'si: ");
                    int purchaseId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    Book bookToPurchase = library.getBookById(purchaseId);
                    if (bookToPurchase != null) {
                        reader.purchaseBook(bookToPurchase); // Reader üzerinden satın alma
                        bookToPurchase.setStatus("satıldı"); // Durumu güncelle
                        System.out.println("Kitap başarıyla satın alındı.");

                        // Fatura oluşturma mesajı
                        System.out.println("Faturanızı oluşturduk: " + bookToPurchase.getTitle() + " - Fiyat: " + bookToPurchase.getPrice() + " TL");
                    } else {
                        System.out.println("Kitap bulunamadı.");
                    }
                    break;


                case 12: // Okuyucunun alınan kitap sayısını göster
                    System.out.println(reader.getName() + " tarafından alınan kitap sayısı: " + reader.getNoBooksIssued());
                    break;

                case 13: // Yeni Üye Oluştur
                    System.out.print("Üye ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    System.out.print("Üye Adı: ");
                    String name = scanner.nextLine();
                    System.out.print("Üye Adresi: ");
                    String address = scanner.nextLine();
                    System.out.print("Üye Telefon Numarası: ");
                    String phoneNo = scanner.nextLine();
                    System.out.print("Üye Türü: ");
                    String memberType = scanner.nextLine();

                    // Yeni üye oluşturma
                    MemberRecord newMember = new MemberRecord(memberId, name, address, phoneNo, memberType);
                    library.addReader(new Reader(name)); // Okuyucu olarak ekliyoruz
                    System.out.println("Yeni üye başarıyla oluşturuldu: " + newMember.getName());
                    break;

                case 14: // Kayıtlı Üyeleri Göster
                    System.out.println("Kayıtlı Üyeler:");
                    for (Reader r : library.getReaders()) {
                        System.out.println("Üye Adı: " + r.getName());
                    }
                    break;

                case 15: // Kategoriye göre kitapları listele
                    System.out.print("Görüntülemek istediğiniz kategori: ");
                    String selectedCategory = scanner.nextLine(); // Değişken adını değiştirdik
                    library.showBooksByCategory(selectedCategory);
                    break;


                case 0: // Çıkış
                    System.out.println("Sistemden çıkılıyor...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
    }
}
