package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();

        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Status " + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry this airport is not served by Kodilla");
        }
        System.out.println("Thank you for using us");
    }
}
