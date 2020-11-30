package com.kodilla.collections.adv.exercises.homework;



import java.util.ArrayList;
import java.util.List;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flightsList = new ArrayList<>();
        flightsList.add(new Flight("Warsaw", "Cracow"));
        flightsList.add(new Flight("Warsaw", "Bonn"));
        flightsList.add(new Flight("Bonn", "Oslo"));
        flightsList.add(new Flight("Dusseldorf", "Berlin"));
        return flightsList;
    }


}
