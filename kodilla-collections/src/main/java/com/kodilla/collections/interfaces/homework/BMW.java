package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarUtils;

public class BMW implements Car {

    int speed;
    private static final int increaseValue = 50;
    private static final int decreaseValue = 20;

    public BMW (int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + increaseValue;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - decreaseValue;

    }

}
