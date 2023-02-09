package com.akash.JavaProject.service.hlevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Books {
    List<Book> booksList;

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList() {
        List<Book> booksList1 = Arrays.asList(new Book(1, "Book1", 100.0)
                , new Book(2, "Book2", 200.00)
                , new Book(3, "Book3", 300.0)
                , new Book(3, "Book3", 300.0)
                , new Book(4, "Book4", 400.0));
        List<Book> booksList2 = Arrays.asList(new Book(5, "Book5", 500.0)
                , new Book(6, "Book6", 600.00)
                , new Book(7, "Book7", 700.0)
                , new Book(8, "Book8", 800.0)
                , new Book(8, "Book8", 800.0));
        List<List<Book>> bookList3 = Arrays.asList(booksList1, booksList2);
        this.booksList = bookList3.stream()
                .flatMap(x -> x.stream())
                .limit(6)
                .collect(Collectors.toList());
    }
}
