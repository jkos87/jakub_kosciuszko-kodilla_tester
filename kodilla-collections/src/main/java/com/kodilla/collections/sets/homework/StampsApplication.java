package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Krakow", "11 x 11", true));
        stamps.add(new Stamp("Warsaw", "7 x 7 ", true));
        stamps.add(new Stamp("Paris","4 x 4 ", false));
        stamps.add(new Stamp("Paris","4 x 4 ", false));
        stamps.add(new Stamp("Paris","4 x 4 ", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }
    }
}
