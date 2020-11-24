package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookManager {


    public Book createBook(String title, String author) {
        Set<Book> books = new HashSet<>();
        Book book1 = new Book(title, author);

        if (books.add(new Book(title, author)))
            return book1;
        else
            return null;
    }
}