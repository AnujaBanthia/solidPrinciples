package com.solid.example2.goodcode;
/*
The refactored code follows the Interface Segregation Principle, as neither classes depend on methods they don’t use.
 */
public class AudiobookUI implements AudioAction {

    @Override
    public void seeReviews() {
     //   ..
    }

    @Override
    public void listenSample() {
      //  ...
    }

}
