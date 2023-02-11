package com.akash.JavaProject.service;

import com.akash.JavaProject.service.elevel.ELevel;
import com.akash.JavaProject.service.elevel.ELevalImpl;
import com.akash.JavaProject.service.hlevel.Book;
import com.akash.JavaProject.service.hlevel.Books;
import com.akash.JavaProject.service.hlevel.HLevel;
import com.akash.JavaProject.service.hlevel.HLImpl;
import com.akash.JavaProject.service.mlevel.MLevel;
import com.akash.JavaProject.service.mlevel.MediumImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java {
    private int[] ints = {2, 7};
    private int[] ints1 = {1, 3, 0, 0};
    private String str1[] = {"A", "E", "I"};
    private String str2[] = {"O", "U"};

    public int[] getInts1() {
        return ints1;
    }

    private String string = "       Hello world        ";

    private int anInt;

    public int[] getInts() {
        return ints;
    }

    public int getAnInt() {
        return anInt;
    }

    public String getString() {
        return string;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String[] getStr1() {
        return str1;
    }

    public String[] getStr2() {
        return str2;
    }

    public static void main(String[] args) throws InterruptedException {
        Java java = new Java();
        ELevel ELeval = new ELevalImpl();
        MLevel medium = new MediumImpl();
        HLevel hl = new HLImpl();

        List list = new LinkedList();
        list.add("hello");
        list.add(1);
        System.out.println(list.toString());

        int[] ints = ELeval.twoSum(java.getInts(), 9);
        System.out.println(ints[0] + "and" + ints[1]);
        System.out.println(ELeval.removeDuplicates(java.getInts()));
        System.out.println(ELeval.searchInsert(java.getInts(), 3));
        System.out.println(ELeval.lengthOfLastWord(java.getString()));
        ELeval.merge(java.getInts1(), 3, java.getInts(), 3);
        System.out.println(medium.reverse(23));
        System.out.println(hl.findMedianSortedArrays(java.getInts1(), java.getInts()));
        System.out.println(medium.myAtoi("a"));
        hl.ExHashMap();
        hl.ExLinkedHashMap();
        hl.ExIdentityHashMap();
        hl.ExWeakHashMap();
        hl.ExTreeMap();
        hl.ExHashtable();
        System.out.println();
        List<Book> booksList = new ArrayList<>();
        Books books = new Books();
        books.setBooksList();
        Book book = new Book();
        book.setBooksInUpper(books.getBooksList());
        book.getBooksInUpper().forEach(x->System.out.print(x+" "));;
        book.setBookspriceGraeterThenX(books.getBooksList());
        book.getBookspriceGraeterThenX().forEach(x->System.out.print(x+" "));;
        book.setBooksInLower(books.getBooksList());
        book.getBooksInLower().stream().forEach(x->System.out.print(x+" "));
        book.setCheapestBook(books.getBooksList());
        book.getCheapestBook().stream().forEach(System.out::print);
        book.setExpensiveBook(books.getBooksList());
        book.getExpensiveBook().stream().forEach(System.out::print);
        System.out.println();
        book.setAllBooks(books.getBooksList());
        book.getAllBooks().stream().forEach(System.out::print);
        Thread.sleep(10000);
    }

}
