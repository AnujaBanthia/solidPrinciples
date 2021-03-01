package com.solid.goodCode;



public class goodCodeImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Author1");
        book.setContent("This book has contents written by Author1");
        book.setTitle("Title1");

        EBook ebook = new EBook();
        ebook.setAuthor("Author2");
        ebook.setContent("This book has contents written by Author2");
        ebook.setTitle("Title2");

        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.setBook(book);
        bookPrinter.printToConsole();


        bookPrinter.setBook(ebook);
        bookPrinter.printToConsole();

    }
}
