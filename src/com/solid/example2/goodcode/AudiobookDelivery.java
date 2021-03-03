package com.solid.example2.goodcode;

public class AudiobookDelivery extends OnlineDelivery {

    @Override
    void getSoftwareOptions() {
      //  ...
    }

}
/*
After the refactoring, we could use any subclass in place of its superclass without breaking the application.
 */