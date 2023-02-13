package com.akash.JavaProject.book;

import com.akash.JavaProject.service.book.Book;
import com.akash.JavaProject.service.book.BookService;
import com.akash.JavaProject.service.book.BookServiceC;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 implements BookTest {
    @Override @Test
    public void testExpensiveBook() {
        BookService bookService = new BookServiceC();
        List<Book> booksList = Arrays.asList(new Book(1, "Book1", 100.0)
                , new Book(2, "Book2", 200.00)
                , new Book(3, "Book3", 300.0)
                , new Book(3, "Book3", 300.0)
                , new Book(4, "Book4", 400.0));
        bookService.setExpensiveBook(booksList);
        assertEquals(400.0, bookService.getExpensiveBook().stream()
                .map(x -> x.getPrice())
                .collect(Collectors.toList())
                .get(0));

    }

    @Override @Test
    public void testCheapestBook() {
        BookService bookService = new BookServiceC();
        List<Book> booksList = Arrays.asList(new Book(1, "Book1", 100.0)
                , new Book(2, "Book2", 200.00)
                , new Book(3, "Book3", 300.0)
                , new Book(3, "Book3", 300.0)
                , new Book(4, "Book4", 400.0));
        bookService.setCheapestBook(booksList);
        assertEquals(100.0, bookService.getCheapestBook().stream()
                .map(x -> x.getPrice())
                .collect(Collectors.toList())
                .get(0));
    }

}
