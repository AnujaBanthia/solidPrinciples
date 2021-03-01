package com.solid.badCode;
//interface segregation
public interface BookProperties {
    void setAuthor(String author);
    void setTitle(String title);
    void setPrice(double price);
    void setAvailability();
}
