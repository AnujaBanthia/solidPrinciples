package com.solid.example2.badcode;

public class AudiobookUI implements BookAction {

    @Override
    public void seeReviews() {
      //  ...
    }

    @Override
    public void searchSecondhand() {
        //    ...
    }

    @Override
    public void listenSample() {
      //  ...
    }

}
/*
Both classes depend on methods they don’t use, so we have broken the Interface Segregation Principle. Hardcover books can’t be listened to,
so the HardcoverUI class doesn’t need the listenSample() method. Similarly, audiobooks don’t have second-hand copies, so the AudiobookUI class doesn’t need it, either.
 */
