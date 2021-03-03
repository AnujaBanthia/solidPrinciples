package com.solid.example2.goodcode;
/*
Now, DiscountManager can refer to the BookDiscount interface instead of the concrete classes. When the processBookDiscount() method is called,
we can pass both CookbookDiscount and BiographyDiscount as an argument, as both are the implementation of the BookDiscount interface.

The refactored code follows the Open/Closed principle, as we could add the new CookbookDiscount class without modifying the existing code base.
This also means that in the future, we can extend our app with other discount types (for instance, with CrimebookDiscount).
 */
public class DiscountManager {
    void processBookDiscount(BookDiscount discount) {
        //...
    }
}
