package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightFinder {
    void findFlight (Flight flight) throws RoteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();

        flights.put("Berlin", true);
        flights.put("New York", true);
        flights.put("London", true);
        flights.put("Warsaw", true);
        flights.put("Moscow", true);

            if (flights.containsKey(flight.getArrivalAirport())) {
                System.out.println("Flight found!");
            } else {
                throw new RoteNotFoundException("Flight not found");
            }
        }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        Flight flight1 = new Flight("Berlin", "New York");

        try {
            flightFinder.findFlight(flight1);
        } catch (RoteNotFoundException e) {
            throw new RuntimeException(e);
        }

        Flight flight2 = new Flight("Poznan", "Cracow");

        try {
            flightFinder.findFlight(flight2);
        } catch (RoteNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
