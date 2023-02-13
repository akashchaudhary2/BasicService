package com.akash.JavaProject.service.book;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookServiceC implements BookService {
    List<String> booksInUpper;

    List<String> booksInLower;

    Optional<Book> cheapestBook;

    Optional<Book> expensiveBook;

    List<String> allBooks;

    List<Book> bookspriceGraeterThenX;

    public List<String> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> books) {
        this.allBooks = books.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Book> getExpensiveBook() {
        return expensiveBook;
    }

    @Override
    public void setExpensiveBook(@NotNull List<Book> books) {
        this.expensiveBook = books.stream()
                .max((x, y) -> {
                    return x.getPrice().compareTo(y.getPrice());
                });
    }

    @Override
    public Optional<Book> getCheapestBook() {
        return cheapestBook;
    }

    @Override
    public void setCheapestBook(@NotNull List<Book> books) {
        cheapestBook = books.stream()
                .min((x, y) -> {
                    return x.getPrice().compareTo(y.getPrice());
                });
    }

    @Override
    public List<String> getBooksInLower() {
        return booksInLower;
    }

    @Override
    public void setBooksInLower(@NotNull List<Book> books) {
        this.booksInLower = books.stream()
                .map(x -> x.getName().toLowerCase())
                .collect(Collectors.toList());
    }


    @Override
    public List<Book> getBookspriceGreaterThenX() {
        return bookspriceGraeterThenX;
    }

    @Override
    public void setBookspriceGreaterThenX(List<Book> books, int x) {
        this.bookspriceGraeterThenX = books.stream()
                .filter(b -> b.getPrice() > x)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getBooksInUpper() {
        return booksInUpper;
    }

    @Override
    public void setBooksInUpper(List<Book> books) {
        this.booksInUpper = books.stream()
                .map(n -> n.getName().toUpperCase())
                .collect(Collectors.toList());
    }
}
