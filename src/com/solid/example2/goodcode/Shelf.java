package com.solid.example2.goodcode;
/*
also follows the Liskov Substitution Principle, as the Product type can be substituted with both of its subtypes (Book and DVD) without breaking the program.
At the same time, we have also implemented the Dependency Inversion Principle, as in the refactored code, high-level classes (Shelf) don’t depend on low-level classes,
either.
 */
public class Shelf {

    Product product;

    void addProduct(Product product) {
        //...
    }

    void customizeShelf() {
        //...
    }

}
