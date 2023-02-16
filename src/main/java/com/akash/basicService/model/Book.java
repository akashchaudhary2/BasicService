package com.akash.basicService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    int id;
    @Column(length = 35)
    @JsonProperty("author_name")
    String authorName;
    @Column(length = 35)
    Double price;

    public Book() {
    }

    public Book(int id, String authorName, Double price) {
        this.id = id;
        this.authorName = authorName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + authorName + '\'' + ", price=" + price + '}';
    }
}
