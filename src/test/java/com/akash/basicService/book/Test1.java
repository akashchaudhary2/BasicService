package com.akash.basicService.book;

import com.akash.basicService.model.Book;
import com.akash.basicService.service.book.BookRepo;
import com.akash.basicService.service.book.BookService;
import com.akash.basicService.service.book.BookServiceC;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
        List<Book> booksList = bookList3.stream()
                .flatMap(x -> x.stream())
                .limit(6)
                .collect(Collectors.toList());

        bookService.setCheapestBook(booksList);

        assertEquals(100.0, bookService.getCheapestBook().stream()
                .map(x -> x.getPrice())
                .collect(Collectors.toList())
                .get(0));
    }

    @Override @Test
    public void testFindAll() {
        BookRepo bookRepo = Mockito.mock(BookRepo.class);
        List<Book> booksList = Arrays.asList(new Book(1, "Book1", 100.0)
                , new Book(2, "Book2", 200.00)
                , new Book(3, "Book3", 300.0)
                , new Book(3, "Book3", 300.0)
                , new Book(4, "Book4", 400.0));
        Mockito.when(bookRepo.findAll()).thenReturn(booksList);
        assertEquals(5,booksList.stream()
                .count());

    }

}
