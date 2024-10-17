import com.Library.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(); //Yeni bir kütüphane nesnesi oluşturuluyor.
        Reader reader = new Reader("Hasan"); //Yeni bir okuyucu nesnesi oluşturuluyor.
        Librarian librarian = new Librarian("Gökhan", "1234"); //Yeni bir kütüphaneci nesnesi oluşturuluyor.
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
            System.out.println("12. Okuyucunun Aldığı Kitap Sayısını Göster");
            System.out.println("13. Yeni Üye Oluştur");
            System.out.println("14. Kayıtlı Okuyucuları Göster");
            System.out.println("15. Kategoriye Göre Kitaları Göster");
            System.out.println("0.  Çıkış");
            System.out.print("Bir seçenek giriniz: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu yakalamak için

            switch (choice) {
                case 1: // Kitap Ekleme
                    System.out.print("Kitap ID: "); // Kullanıcıdan kitap ID'sini alır.
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için, nextInt() çağrısından sonra satır sonunu temizler.
                    System.out.print("Yazar: "); // Kullanıcıdan yazar adını alır.
                    String author = scanner.nextLine();
                    System.out.print("Başlık: "); // Kullanıcıdan kitabın başlığını alır.
                    String title = scanner.nextLine();
                    System.out.print("Fiyat: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Boşluğu yakalamak için
                    System.out.print("Baskı: ");
                    String edition = scanner.nextLine();
                    System.out.print("Kitap Türü (1- Book, 2- StudyBook, 3- Journal, 4- Magazine): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu yakalamak için

                    Book newBook; // Yeni bir Book nesnesi için bir referans tanımlanıyor.
                    String category = "belirtilen_kategori"; // Kategoriyi burada belirtin, kullanıcıdan alabilirsiniz

                    switch (type) { //kitap türüne göre uygun nesneyi oluşturmak için switch yapısı kullanılır
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
                    library.showBooks(); //// Kütüphanedeki tüm kitapları listele
                    break;

                case 3: // Kitap Arama (ID ile)
                    System.out.print("Aranacak Kitap ID'si: "); // Kullanıcıdan aramak istediği kitap ID'sini iste
                    int searchId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için
                    librarian.searchBook(library, searchId); // Kütüphanede arama işlemini yap
                    break;

                case 4: // Kitap Arama (İsim ile)
                    System.out.print("Aranacak Kitap İsmi: "); // Kullanıcıdan aramak istediği kitap ismini iste
                    String searchName = scanner.nextLine(); // Kullanıcının girdiği ismi al
                    librarian.searchBookByName(library, searchName); // Kütüphanede arama işlemini yap
                    break;

                case 5: // Yazarın Tüm Kitaplarını Listele
                    System.out.print("Yazarın İsmi: "); // Kullanıcıdan yazarın ismini iste
                    String searchAuthor = scanner.nextLine(); // Kullanıcının girdiği ismi al
                    library.showBooksByAuthor(searchAuthor); // Yazarın kitaplarını kütüphanede listele
                    break;

                case 6: // Kitap Güncelleme
                    System.out.print("Güncellenecek Kitap ID'si: "); // Kullanıcıdan güncellemek istediği kitap ID'sini iste
                    int updateId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için

                    Book bookToUpdate = library.getBookById(updateId); // Kütüphaneden belirtilen ID ile kitabı al
                    if (bookToUpdate != null) { // Eğer kitap bulunmuşsa
                        System.out.print("Yeni Yazar: "); // Kullanıcıdan yeni yazar ismini iste
                        String newAuthor = scanner.nextLine(); // Yeni yazar ismini al
                        System.out.print("Yeni Başlık: "); // Kullanıcıdan yeni başlık iste
                        String newTitle = scanner.nextLine(); // Yeni başlığı al
                        System.out.print("Yeni Fiyat: "); // Kullanıcıdan yeni fiyat iste
                        double newPrice = scanner.nextDouble(); // Yeni fiyatı al
                        scanner.nextLine(); // Boşluğu yakalamak için
                        System.out.print("Yeni Baskı: "); // Kullanıcıdan yeni baskı bilgisi iste
                        String newEdition = scanner.nextLine(); // Yeni baskıyı al

                        library.updateBook(updateId, newAuthor, newTitle, newPrice, newEdition); // Kitap bilgilerini güncelle
                    } else {
                        System.out.println("Kitap bulunamadı."); // Eğer kitap bulunamazsa mesaj ver
                    }
                    break;

                case 7: // Kitap Silme
                    System.out.print("Silinecek Kitap ID'si: "); // Kullanıcıdan silmek istediği kitap ID'sini iste
                    int removeId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için
                    library.removeBook(removeId); // Kütüphaneden belirtilen ID ile kitabı sil
                    break;

                case 8: // Kitap Ödünç Alma
                    System.out.print("Ödünç alınacak kitap ID'si: "); // Kullanıcıdan ödünç alınacak kitabın ID'sini iste
                    int borrowId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için
                    Book bookToBorrow = library.getBookById(borrowId); // Kütüphaneden belirtilen ID ile kitabı al
                    if (bookToBorrow != null) { // Eğer kitap bulunmuşsa
                        if (bookToBorrow.getStatus().equals("mevcut")) { // Kitap mevcutsa
                            librarian.issueBook(library, borrowId, reader); // Kitabı ödünç ver
                            bookToBorrow.setStatus("ödünçte"); // Kitabın durumunu "ödünçte" olarak güncelle
                        } else {
                            System.out.println("Kitap kütüphanede bulunmamaktadır."); // Kitap mevcut değilse hata mesajı ver
                        }
                    } else {
                        System.out.println("Kitap bulunamadı."); // Eğer kitap bulunamazsa hata mesajı ver
                    }
                    break;


                // Kitap iade işlemi sonrası kitap durumunu güncelle
                case 9:
                    System.out.print("İade edilecek kitap ID'si: "); // Kullanıcıdan iade edilecek kitabın ID'sini al
                    int returnId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için (nextInt() sonrası)
                    Book bookToReturn = library.getBookById(returnId); // ID'ye göre kitap bul

                    if (bookToReturn != null) { // Eğer kitap bulunmuşsa
                        librarian.returnBook(library, returnId, reader); // Kitabı iade et
                        bookToReturn.setStatus("mevcut"); // Kitap durumunu "mevcut" olarak güncelle
                    } else {
                        System.out.println("Kitap bulunamadı."); // Kitap bulunamazsa hata mesajı ver
                    }
                    break; // Durumu kontrol ettikten sonra case'den çık

                case 10: // Okuyucunun Ödünç Aldığı Kitapları Göster
                    System.out.print("Ödünç alınan kitapları görmek istediğiniz okuyucunun adını girin: "); // Kullanıcıdan okuyucu ismini al
                    String readerNameToShow = scanner.nextLine(); // Okuyucu ismini kaydet
                    Reader readerToShow = library.getReaderByName(readerNameToShow); // Okuyucu ismine göre okuyucu bul

                    if (readerToShow != null) { // Eğer okuyucu bulunmuşsa
                        System.out.println(readerToShow.getName() + " tarafından ödünç alınan kitaplar:"); // Okuyucu ismini yazdır
                        for (Book borrowedBook : readerToShow.getBorrowedBooks()) { // Okuyucunun ödünç aldığı kitaplar için döngü
                            borrowedBook.display(); // Her bir kitabı göster
                        }
                    } else {
                        System.out.println("Okuyucu bulunamadı."); // Okuyucu bulunamazsa hata mesajı ver
                    }
                    break;


                case 11: // Kitap Satın Alma
                    System.out.print("Satın alınacak kitap ID'si: "); // Kullanıcıdan satın alınacak kitabın ID'sini al
                    int purchaseId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için (nextInt() sonrası)
                    Book bookToPurchase = library.getBookById(purchaseId); // ID'ye göre kitap bul

                    if (bookToPurchase != null) { // Eğer kitap bulunmuşsa
                        reader.purchaseBook(bookToPurchase); // Okuyucu üzerinden kitabı satın alma işlemi
                        bookToPurchase.setStatus("satıldı"); // Kitap durumunu "satıldı" olarak güncelle
                        System.out.println("Kitap başarıyla satın alındı."); // Başarılı satın alma mesajı

                        // Fatura oluşturma mesajı
                        System.out.println("Faturanızı oluşturduk: " + bookToPurchase.getTitle() + " - Fiyat: " + bookToPurchase.getPrice() + " TL"); // Kitap ismi ve fiyatı ile fatura bilgisi
                    } else {
                        System.out.println("Kitap bulunamadı."); // Kitap bulunamazsa hata mesajı ver
                    }
                    break;



                case 12: // Okuyucunun aldığı kitap sayısını göster
                    System.out.println(reader.getName() + " tarafından alınan kitap sayısı: " + reader.getNoBooksIssued()); // Okuyucunun adı ve ödünç aldığı kitap sayısını göster
                    break;


                case 13: // Yeni Üye Oluştur
                    System.out.print("Üye ID: "); // Kullanıcıdan üye ID'sini al
                    int memberId = scanner.nextInt(); // Kullanıcının girdiği ID'yi al
                    scanner.nextLine(); // Boşluğu yakalamak için (nextInt() sonrası)

                    System.out.print("Üye Adı: "); // Kullanıcıdan üye adını al
                    String name = scanner.nextLine(); // Kullanıcının girdiği ismi al

                    System.out.print("Üye Adresi: "); // Kullanıcıdan üye adresini al
                    String address = scanner.nextLine(); // Kullanıcının girdiği adresi al

                    System.out.print("Üye Telefon Numarası: "); // Kullanıcıdan üye telefon numarasını al
                    String phoneNo = scanner.nextLine(); // Kullanıcının girdiği telefon numarasını al

                    System.out.print("Üye Türü: "); // Kullanıcıdan üye türünü al
                    String memberType = scanner.nextLine(); // Kullanıcının girdiği üye türünü al

                    // Yeni üye oluşturma
                    MemberRecord newMember = new MemberRecord(memberId, name, address, phoneNo, memberType); // Yeni üye kaydını oluştur
                    library.addReader(new Reader(name)); // Okuyucu olarak ekliyoruz
                    System.out.println("Yeni üye başarıyla oluşturuldu: " + newMember.getName()); // Başarılı üye oluşturma mesajı
                    break;

                case 14: // Kayıtlı Üyeleri Göster
                    System.out.println("Kayıtlı Üyeler:"); // Kayıtlı üyelerin listeleneceğini belirt
                    for (Reader r : library.getReaders()) { // Kütüphanedeki tüm okuyucuları döngü ile gez
                        System.out.println("Üye Adı: " + r.getName()); // Her üyenin adını yazdır
                    }
                    break;


                case 15: // Kategoriye göre kitapları listele
                    System.out.print("Görüntülemek istediğiniz kategori: "); // Kullanıcıdan görüntülemek istediği kitap kategorisini al
                    String selectedCategory = scanner.nextLine(); // Kullanıcının girdiği kategoriyi al
                    library.showBooksByCategory(selectedCategory); // Belirtilen kategoriye göre kitapları listele
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
