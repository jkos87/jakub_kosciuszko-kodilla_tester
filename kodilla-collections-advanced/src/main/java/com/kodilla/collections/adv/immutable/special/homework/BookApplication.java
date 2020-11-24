package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Charakternik", "Jacek Komuda");
        Book book2 = bookManager.createBook("Włam się do mozgu", "Radek Kotarski");
        Book book3 = bookManager.createBook("Charakternik", "Jacek Komuda");


        System.out.println("---------");
        System.out.println(book1 == book3);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        if (book1 == book3) {
            System.out.println("Fine");
        } else {
            System.out.println("Wrong");
        }
    }

}
