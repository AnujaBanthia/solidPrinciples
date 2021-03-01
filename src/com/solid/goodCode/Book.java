package com.solid.goodCode;

//Single Responsibility principle
public class Book implements  BookCoreProperties, BookDynamicProperties{
    String Author;
    String Title;
    String content;
    double price;
    boolean availability;


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return content;
    }
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setAvailability() {
        this.availability =true;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
