package com.kodilla.collections.interfaces.homework;

public class VW implements Car {

        int speed;
    private static final int increaseValue = 40;
    private static final int decreaseValue = 15;

        public VW (int speed){
            this.speed = speed;
        }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseValue;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decreaseValue;
        System.out.println(speed);
    }


}
