package com.akash.JavaProject.service.hlevel;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Book {
    int id;
    String name;
    Double price;

    List<String> booksInUpper;

    List<String> booksInLower;

    Optional<Book> cheapestBook;

    Optional<Book> expensiveBook;

    List<String> allBooks;

    public List<String> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(List<Book> books) {
        this.allBooks = books.stream()
                .map(x->x.getName())
                .collect(Collectors.toList());
    }

    public Optional<Book> getExpensiveBook() {
        return expensiveBook;
    }

    public void setExpensiveBook(@NotNull List<Book> books) {
        this.expensiveBook = books.stream()
                .max((x,y)->{return x.getPrice().compareTo(y.getPrice());});
    }

    public Optional<Book> getCheapestBook() {
        return cheapestBook;
    }

    public void setCheapestBook(@NotNull List<Book> books) {
        cheapestBook= books.stream()
                .min((x,y)->{return x.getPrice().compareTo(y.getPrice());});
    }

    public List<String> getBooksInLower() {
        return booksInLower;
    }

    public void setBooksInLower(@NotNull List<Book> books) {
        this.booksInLower= books.stream()
                .map(x->x.getName().toLowerCase())
                .collect(Collectors.toList());
    }

    List<Book> bookspriceGraeterThenX;

    public List<Book> getBookspriceGraeterThenX() {
        return bookspriceGraeterThenX;
    }

    public void setBookspriceGraeterThenX(List<Book> priceGraeterThen) {
        this.bookspriceGraeterThenX = priceGraeterThen.stream()
                .filter(b -> b.getPrice() > 200)
                .collect(Collectors.toList());
    }

    public Book() {
    }

    public Book(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public List<String> getBooksInUpper() {
        return booksInUpper;
    }


    public void setBooksInUpper(List<Book> books) {
        this.booksInUpper = books.stream()
                .map(n -> n.getName().toUpperCase())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
