package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager extends Book {

    private static List<Book> books = new ArrayList<>();

    public BookManager(String author, String title) {
        super(author, title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public static void createBook(String title, String author) {
    }

}

