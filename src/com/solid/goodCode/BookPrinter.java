package com.solid.goodCode;
//Single Responsibility principle
public class BookPrinter {
    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) { //Dependency Inversion
        this.book = book;
    }

    public void printToConsole(){
        System.out.println("Printing book " + book.getTitle()+"to console \n:"+book.getContent());
    }
}
