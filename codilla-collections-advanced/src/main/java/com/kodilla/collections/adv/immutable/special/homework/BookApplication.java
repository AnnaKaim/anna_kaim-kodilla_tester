package com.kodilla.collections.adv.immutable.special.homework;


import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();


        books.add(BookManager.createBook("Daniel Flynn", "Sharp objects"));
        books.add(BookManager.createBook("Daniel Flynn", "Sharper objects"));
        books.add(BookManager.createBook("Daniel Flynn", "The most sharp objects"));

        System.out.println("The number of books: " + books.size());
        for (Book book : books)
            System.out.println(book);


        System.out.println("------------------------------------");


        for (Book book : books) {
            Book book1 = new Book("Daniel Flynn", "Sharp objects");
            if (book1.getTitle() == book.getTitle()) {
                System.out.println("Books titles are the same: " + book1.getTitle() + " & " + book.getTitle());
            } else {
                System.out.println("Books titles are not the same: " + book1.getTitle() + " & " + book.getTitle());
            }
        }

        System.out.println("------------------------------------");

        for (Book book : books) {
            Book book1 = new Book("Daniel Flynn", "Sharp objects");
            Book book2 = new Book("Henry Bronson", "Sharp objects");

            if (book1.getAuthor() == book.getAuthor()) {
                System.out.println("Books authors are the same: " + book1.getAuthor() + " & " + book.getAuthor());
            } else {
                System.out.println("Books authors are not the same: " + book1.getAuthor() + " & " + book.getAuthor());
            }

            if (book2.getAuthor() == book.getAuthor()) {
                System.out.println("Books authors are the same: " + book2.getAuthor() + " & " + book.getAuthor());
            } else {
                System.out.println("Books authors are not the same: " + book2.getAuthor() + " & " + book.getAuthor());
            }
        }

        System.out.println("------------------------------------");


        for (Book book : books) {
            Book book1 = new Book("Daniel Flynn", "Sharp objects");
            Book book2 = new Book("Henry Bronson", "Sharp objects");

            if (book.equals(book1)) {
                System.out.println("Addresses of the objects are the same." + book1 + " & " + book);
            } else {
                System.out.println("Addresses of the objects are not the same. " + book1 + " & " + book);
            }

            if (book.equals(book2)) {
                System.out.println("Addresses of the objects are the same." + book2 + " & " + book);
            } else {
                System.out.println("Addresses of the objects are not the same. " + book2 + " & " + book);
            }
        }
    }
}