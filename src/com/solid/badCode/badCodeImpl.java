package com.solid.badCode;

public class badCodeImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Author1");
        book.setContent("This book has contents written by Author1");
        book.setTitle("Title1");
        book.printBookToConsole();
    }
}
