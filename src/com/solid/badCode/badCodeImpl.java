package com.solid.badCode;

public class badCodeImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Author1");
        book.setContent("This book has contents written by Author1");
        book.setTitle("Title1");
        book.printBookToConsole();

        /*
        Dependency Inversion Principle says is that instead of a high-level module depending on a low-level module, both should depend on an abstraction.

        In the figure above, without Dependency Inversion Principle, Object A in Package A refers Object B in Package B.
        With Dependency Inversion Principle, an Interface A is introduced as an abstraction in Package A.
        Object A now refers Interface A and Object B inherits from Interface A. What the principle has done is:

        Both Object A and Object B now depends on Interface A, the abstraction.
        It inverted the dependency that existed from Object A to Object B into Object B being dependent on the abstraction (Interface A).

         */
    }
}
