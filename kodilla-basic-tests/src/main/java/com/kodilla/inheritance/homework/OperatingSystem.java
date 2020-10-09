package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationDate;

    OperatingSystem(int publicationDate){
        this.publicationDate = publicationDate;
    }

    int getPublicationDate(){
        return publicationDate;
    }

    public void turnOnOffice(){
        System.out.println("System "+ publicationDate+ " is on ");
    }
    public void turnOffOffice() {
        System.out.println("System "+publicationDate+" is off");
    }
}
