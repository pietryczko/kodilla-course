package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    private Map<String, Boolean> flights = new HashMap<>();

    void findFlight(Flight flight) throws RoteNotFoundException {
        flights.put("Berlin", false);
        flights.put("New York", false);
        flights.put("London", true);
        flights.put("Warsaw", true);
        flights.put("Moscow", true);

        if (flights.containsKey(flight.getArrivalAirport()) && flights.containsValue(true)) {
            System.out.println("Airport and connection is available!");
        } else if (flights.containsKey(flight.getArrivalAirport()) && flights.containsValue(false)){
            System.out.println("Airport is available but no connection to it.");
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




    }
}
