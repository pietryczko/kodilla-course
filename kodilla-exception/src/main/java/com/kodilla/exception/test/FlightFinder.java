package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private final Map<String, Boolean> flights;

    public FlightFinder() {
        flights = new HashMap<>();
        flights.put("Berlin", false);
        flights.put("New York", false);
        flights.put("London", true);
        flights.put("Warsaw", true);
        flights.put("Moscow", true);
    }

    void findFlight(Flight flight) throws RoteNotFoundException {
        if (!flights.containsKey(flight.getArrivalAirport())) {
            throw new RoteNotFoundException("Not find airport");
        }
        boolean flightIsAvailable = flights.get(flight.getArrivalAirport());

        if (flightIsAvailable) {
            System.out.println("Flight is available");
        } else {
            throw new RoteNotFoundException("No connection");
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Berlin", "Moscow");
        try {
            flightFinder.findFlight(flight1);
        } catch (RoteNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}