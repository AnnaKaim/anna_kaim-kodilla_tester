package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        Book book = new BookManager("Daniel Flynn", "Sharp objects");
        Book book1 = new BookManager("Daniel Flynn", "Sharp objects");
        Book book2 = new BookManager("Daniel Flynn", "Sharper objects");
        Book book3 = new BookManager("Daniel Flynn", "Sharper objects");

        BookManager bookManager = (BookManager) book;
        bookManager.createBook("Sharper objects", "Daniel Flynn");



        System.out.println("----------------");
        System.out.println("Books titles are the same: " + (book.getTitle() == book1.getTitle()));
        System.out.println("Addresses of the objects are the same: " + book.equals(book1));

        System.out.println("----------------");
        System.out.println("Books titles are the same: " + (bookManager.getTitle() == book2.getTitle()));
        System.out.println("Addresses of the objects are the same: " + book.equals(book2));

        System.out.println("----------------");
        System.out.println("Books titles are the same: " + (bookManager.getTitle() == book3.getTitle()));
        System.out.println("Addresses of the objects are the same: " + book.equals(book3));

        System.out.println("----------------");

        System.out.println("Books titles are the same: " + (book2.getTitle() == book3.getTitle()));
        System.out.println("Addresses of the objects are the same: " + book2.equals(book3));

        System.out.println("----------------");

    }
}
