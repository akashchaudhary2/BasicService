package com.akash.JavaProject.service.book;

public class Book {
    int id;
    String name;
    Double price;

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


    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
