package com.solid.example2.goodcode;

class Book implements Product {

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

    @Override
    public void getSample() {
        //...
    }
}
