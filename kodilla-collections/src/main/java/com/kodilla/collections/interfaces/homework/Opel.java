package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private int speed;
    private static final int increaseValue = 30;
    private static final int decreaseValue = 15;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = (speed + increaseValue);
    }

    @Override
    public void decreaseSpeed() {
        speed = (speed - decreaseValue);
    }


}
