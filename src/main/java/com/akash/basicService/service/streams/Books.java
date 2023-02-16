package com.akash.basicService.service.streams;

public class Books {
    private String author;
    private String name;

    public Books(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
