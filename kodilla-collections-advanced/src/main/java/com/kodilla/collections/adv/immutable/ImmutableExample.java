package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("Jhon Stewart", "The last chance");
        BookHacked bk1 =  (BookHacked) book;
        bk1.modifyTitle("New");

        System.out.println(book.title);
        System.out.println(bk1.getTitle());
    }
}
