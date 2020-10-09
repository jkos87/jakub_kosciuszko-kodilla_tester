package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

     Windows10 (int publicationDate){
         super( publicationDate);
     }

     public int getpublicationDate(){
         return super.getPublicationDate();
     }

    @Override
    public void turnOnOffice(){
        System.out.println("Windows "+getPublicationDate()+ " is on ");
    }
    public void turnOffOffice() {
        System.out.println("Windows  is off");
    }
}
