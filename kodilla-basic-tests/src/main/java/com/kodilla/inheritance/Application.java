package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args){
        Car car = new Car(4,5);
        car.turnOnLights();
        System.out.println(car.getSeats());

        Convertible convertible = new Convertible(4,2);
        convertible.closeRoof();
        System.out.println(convertible.getSeats());
        //System.out.println(convertible.displayNumberOfSeats());
        convertible.displayNumberOfSeats();
    }
}
