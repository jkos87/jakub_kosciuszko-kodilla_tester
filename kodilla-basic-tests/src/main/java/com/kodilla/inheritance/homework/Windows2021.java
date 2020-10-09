package com.kodilla.inheritance.homework;

public class Windows2021 extends Windows10 {

    Windows2021(int publicationDate) {
        super(publicationDate);
    }

    public int getpublicationDate(){
        return super.getPublicationDate();
    }

    @Override
    public void turnOnOffice(){
        System.out.println("Office is on ");
    }
    public void turnOffOffice() {
        System.out.println("Office "+getPublicationDate()+ " is off");
    }
}
