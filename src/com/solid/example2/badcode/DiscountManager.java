package com.solid.example2.badcode;

/*
We already follow the Single Responsibility Principle, so we create two separate classes: CookbookDiscount to hold the details of the discount and DiscountManager
to apply the discount to the price.
 */
public class DiscountManager {
    void processCookbookDiscount(CookbookDiscount discount) {
      //  ...
    }
    void processBiographyDiscount(BiographyDiscount discount) {
        //  ...
        //However, as we changed existing functionality, we violated the Open/Closed Principle.
    }
}
