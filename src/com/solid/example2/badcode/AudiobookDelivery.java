package com.solid.example2.badcode;

public class AudiobookDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {/* can't be implemented */}
}
/*
a child class should never change the characteristics of its parent class (such as the argument list and return types).

After the modification, we couldn’t replace the BookDelivery superclass with the AudiobookDelivery subclass without breaking the application.
 */
