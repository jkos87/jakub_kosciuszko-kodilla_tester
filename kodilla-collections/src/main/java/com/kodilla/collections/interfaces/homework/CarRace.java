package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Opel opel = new Opel(50);
        doRace(opel);

       VW vw = new VW(70);
        doRace(vw);

        BMW bmw = new BMW(100);
        doRace(bmw);

    }

    private static void doRace(Car car){

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }


}

