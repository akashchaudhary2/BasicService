package com.akash.JavaProject.service.book;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<String> getBooksInUpper();

    void setBooksInUpper(List<Book> books);

    //    lower
    List<String> getBooksInLower();

    void setBooksInLower(@NotNull List<Book> books);

    //cheapest
    Optional<Book> getCheapestBook();

    void setCheapestBook(@NotNull List<Book> books);

    //expensive
    Optional<Book> getExpensiveBook();

    void setExpensiveBook(@NotNull List<Book> books);

    List<Book> getBookspriceGreaterThenX();

    void setBookspriceGreaterThenX(List<Book> books, int x);


    List<String> getAllBooks();

    void setAllBooks(List<Book> books);


}
