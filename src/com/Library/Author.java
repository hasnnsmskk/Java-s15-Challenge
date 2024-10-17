package com.Library;


import java.util.ArrayList;
import java.util.List;

// Author sınıfı, Person sınıfından miras alır ve yazarlara özgü özellikler ekler.
public class Author extends Person {
    private List<Book> books; // Yazarın kitaplarının listesi

    //constructor metotu
    public Author(String name) {
        super(name);
        books = new ArrayList<>(); //Yazarın kitapları için boş bir ArrayList oluşturulur.
                                    // Bu listeye daha sonra kitaplar eklenebilir.
    }



    @Override
    public String whoYouAre() {
        return "Ben bir yazarım: " + name;
    }
}
