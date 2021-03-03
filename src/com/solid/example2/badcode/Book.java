package com.solid.example2.badcode;
/*
the above code violates the Single Responsibility Principle, as the Book class has two responsibilities. First, it sets the data related to the books (title and author).
Second, it searches for the book in the inventory.
 */
class Book {

    String title;
    String author;

    String getTitle() {
        return title;
    }
    void setTitle(String title) {
        this.title = title;
    }
    String getAuthor() {
        return author;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void searchBook() {
        //search for book in the inventory
    }

}
