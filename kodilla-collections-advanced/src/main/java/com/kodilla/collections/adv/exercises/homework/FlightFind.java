
package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightFind {
    private List<Flight> flights;

    public FlightFind(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight lot : FlightRepository.getFlightsTable()){
            if(lot.getDeparture().equals(departure))
                result.add(lot);
        }
        return result;
    }
    public List<Flight> findFlightsTo(String arrival){
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getArrival().equals(arrival))
                result.add(flight);
        }
        return result;
    }


}
