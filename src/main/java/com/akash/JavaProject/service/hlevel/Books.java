package com.akash.JavaProject.service.hlevel;

import java.util.List;

public class Books {
    List<Book> booksList;

    public List<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Book> booksList) {
        booksList.add(new Book(1, "Book1", 100.0));
        booksList.add(new Book(2, "Book2", 200.00));
        booksList.add(new Book(3, "Book3", 300.0));
        booksList.add(new Book(4, "Book4", 400.0));
        this.booksList=booksList;
    }
}
