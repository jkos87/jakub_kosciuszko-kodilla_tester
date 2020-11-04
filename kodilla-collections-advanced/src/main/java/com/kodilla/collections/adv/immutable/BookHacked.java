package com.kodilla.collections.adv.immutable;

public class BookHacked extends Book {
    private String realtitle;

    public BookHacked(String author, String title) {
        super(author, title);
        realtitle = title;
    }

    public void modifyTitle (String newTitle){
        realtitle = newTitle;
    }

    @Override
    public String getTitle() {
        return realtitle;
    }
}
