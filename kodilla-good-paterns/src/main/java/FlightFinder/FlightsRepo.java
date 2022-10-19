package FlightFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightsRepo {
    private Scanner scanner = new Scanner(System.in);
    private List<Flight> flights = new ArrayList<>();

    void addFlight(String flightFrom, String flightTo) {
        Flight flight = new Flight(new City(flightFrom), new City(flightTo));
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }
}

