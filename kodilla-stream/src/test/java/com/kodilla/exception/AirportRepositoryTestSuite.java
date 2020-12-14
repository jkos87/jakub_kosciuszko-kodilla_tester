package com.kodilla.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withExepction() {
        AirportRepository airportRepository = new AirportRepository();
    Assertions.assertThrows(AirportNotFoundException.class,
                () -> airportRepository.isAirportInUse("Bankok"));
    }


}

