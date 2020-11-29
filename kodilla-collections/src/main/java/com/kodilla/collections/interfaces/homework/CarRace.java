package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Opel opel = new Opel(2);
        doRace(opel);
        System.out.println("Opel speed is " + opel.getSpeed());

      /* VW vw = new VW(5);
        doRace(vw);
        System.out.println("Vw speed is " + vw.getSpeed());*/

        BMW bmw = new BMW(5);
        doRace(bmw);
        System.out.println("BMW speed is " + bmw.getSpeed());

    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

    }


}

