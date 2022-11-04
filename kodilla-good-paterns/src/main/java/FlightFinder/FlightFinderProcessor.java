package FlightFinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightFinderProcessor {
    FlightsRepo flightsRepo = new FlightsRepo();

    public static void main(String[] args) {

        FlightFinderProcessor processor = new FlightFinderProcessor();

        processor.flightsRepo.addFlight("Wroclaw", "Krakow");
        processor.flightsRepo.addFlight("Krakow", "Wroclaw");
        processor.flightsRepo.addFlight("Krakow", "Poznan");

        City expectedDeparture = new City("Wroclaw");
        City expectedArrival = new City("Krakow");
        City expectedArrival2 = new City("Poznan");

        System.out.println(processor.findFlightsFrom(expectedDeparture));
        System.out.println(processor.findFlightsTo(expectedArrival));
        System.out.println(processor.findConnectingFlights(expectedDeparture, expectedArrival2));

    }

    private List<Flight> findFlightsFrom(City city) {
        return flightsRepo.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .toList();
    }

    private List<Flight> findFlightsTo(City city) {
        return flightsRepo.getFlights().stream()
                .filter(flight -> flight.getArrival().equals(city))
                .toList();
    }

    private Set<List<Flight>> findConnectingFlights(City departures, City arrivals) {
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
