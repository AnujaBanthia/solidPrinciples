package com.solid.badCode;
//Single Responsibility principle
public class Book implements BookProperties{
    String Author;
    String Title;
    String content;
    double price;
    boolean availability;

        String url;


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

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setAvailability() {
        this.availability =true;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void printBookToConsole(){
        System.out.println("printing to console: \n"+content);
    }

    public void readBook(){
        System.out.println("Reading book out loud");
    }

    /*
        Getter and setter for url
     */

}
