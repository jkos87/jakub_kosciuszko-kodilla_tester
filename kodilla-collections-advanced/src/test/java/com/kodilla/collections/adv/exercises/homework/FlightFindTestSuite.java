package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFindTestSuite {
    @Test
    public void findeFlightsFromTest() {
        FlightFind flightFind = new FlightFind(FlightRepository.getFlightsTable());

        List<Flight> testFrom = flightFind.findFlightsFrom("Warsaw");

        List<Flight> expectedFrom = new ArrayList<>();
        expectedFrom.add(new Flight("Warsaw", "Cracow"));
        expectedFrom.add(new Flight("Warsaw", "Bonn"));

        assertEquals(expectedFrom, testFrom);

    }

    @Test
            public void findeFlightsTo(){
    FlightFind flightFind = new FlightFind(FlightRepository.getFlightsTable());

        List<Flight> testTo = flightFind.findFlightsTo("Cracow");

        List<Flight> expectedTo = new ArrayList<>();
        expectedTo.add(new Flight("Warsaw","Cracow"));

        assertEquals(expectedTo, testTo);
    }

}