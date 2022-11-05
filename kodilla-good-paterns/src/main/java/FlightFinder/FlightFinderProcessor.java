package FlightFinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightFinderProcessor {
    public FlightsRepo flightsRepo;

    public FlightFinderProcessor(FlightsRepo flightsRepo) {
        this.flightsRepo = flightsRepo;
    }

    public List<Flight> findFlightsFrom(City city) {
        return flightsRepo.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .toList();
    }

    public List<Flight> findFlightsTo(City city) {
        return flightsRepo.getFlights().stream()
                .filter(flight -> flight.getArrival().equals(city))
                .toList();
    }

    public Set<List<Flight>> findConnectingFlights(City departures, City arrivals) {
        Set<List<Flight>> connectionFlights = new HashSet<>();
        List<Flight> connectionFlight = new ArrayList<>();
        Flight expectedFlight;

        List<City> connection = findFlightsFrom(departures).stream()
                .map(Flight::getArrival)
                .toList();

        for (City city : connection) {
            expectedFlight = new Flight(city, arrivals);
            if (flightsRepo.getFlights().contains(expectedFlight)) {
                connectionFlight.add(expectedFlight);
                connectionFlight.add(new Flight(departures, city));
                connectionFlights.add(connectionFlight);
            }
        }
        return connectionFlights;
    }
}
