 package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.VW;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i< cars.length; i++)
            cars[i] = drawnCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawnCar(){
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int v = random.nextInt(50);
        if (drawnCarBrand == 0)
            return new BMW(v);
        else if (drawnCarBrand == 1)
            return new VW(v);
        else
            return new Opel(v);
    }
}
