package FlightFinder;

import java.util.*;

public class FlightsRepo {
    private final Set<Flight> flights = new HashSet<>();

    public void addFlight(String departure, String arrival) {
        Flight flight = new Flight(new City(departure), new City(arrival));
        flights.add(flight);
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}

