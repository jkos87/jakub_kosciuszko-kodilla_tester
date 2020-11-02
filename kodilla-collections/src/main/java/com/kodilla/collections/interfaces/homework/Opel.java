package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
