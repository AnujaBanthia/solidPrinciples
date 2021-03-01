package com.solid.goodCode;
//Open Close Principle
public class EBook extends Book {
    public String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
