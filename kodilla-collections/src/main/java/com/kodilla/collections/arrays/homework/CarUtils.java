package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.VW;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("--------------");
        System.out.println("Car Brand " + getCarBrand(car));
        car.increaseSpeed();
        car.increaseSpeed();
        System.out.println("Car Speed " + car.getSpeed() +"km/h");
    }

    private static String getCarBrand(Car car){
        if (car instanceof BMW)
            return "BMW";
        else if (car instanceof VW)
            return "VW";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car brand";
    }
}
