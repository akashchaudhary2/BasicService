package com.akash.basicService.service.book;

import com.akash.basicService.model.Book;

import java.util.List;

public interface BookRepo {
    List<Book> findAll();
}
