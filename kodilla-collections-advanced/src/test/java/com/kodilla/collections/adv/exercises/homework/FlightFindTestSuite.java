package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFindTestSuite {
    @Test
    public void findeFlightsFromTest(){

        FlightFind flightFindFrom = new FlightFind();
        List<Flight> result = flightFindFrom.findFlightsFrom("Warsaw");
        assertEquals(1,result);



    }

}