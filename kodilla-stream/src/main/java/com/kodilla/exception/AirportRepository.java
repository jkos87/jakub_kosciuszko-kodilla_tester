package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListsofAirports(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("Las Palmas", false);
        airports.put("Warsaw", true);
        return airports;
    }
    public boolean isAirportInUse (String airport) throws AirportNotFoundException {
        if (getListsofAirports().containsKey(airport))
            return (getListsofAirports().get(airport));
        throw new AirportNotFoundException();
    }
}
