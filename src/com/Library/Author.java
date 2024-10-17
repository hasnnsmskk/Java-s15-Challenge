package com.Library;

import com.Library.Book;
import com.Library.Person;

import java.util.ArrayList;
import java.util.List;

// Author sınıfı, Person sınıfından miras alır ve yazarlara özgü özellikler ekler.
public class Author extends Person {
    private List<Book> books; // Yazarın kitaplarının listesi

    public Author(String name) {
        super(name);
        books = new ArrayList<>();
    }



    @Override
    public String whoYouAre() {
        return "Ben bir yazarım: " + name;
    }
}
