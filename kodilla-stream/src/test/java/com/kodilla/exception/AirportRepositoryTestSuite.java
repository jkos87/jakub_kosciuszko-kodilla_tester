package com.kodilla.exception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Cxa");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test(expected = AirportNotFoundException.class)
    public void testIsAirportInUse_withExepction() throws AirportNotFoundException {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Vienna");
        // then
        assertFalse(isWarsawInUse);
    }
}

