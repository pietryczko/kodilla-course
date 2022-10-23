package FlightFinder;

import java.util.List;

public class FlightFinderProcessor {
    public static void main(String[] args) {
        FlightsRepo flightsRepo = new FlightsRepo();
        flightsRepo.addFlight("Wroclaw", "Krakow");
        flightsRepo.addFlight("Krakow", "Wroclaw");

        City expectedFlightFrom = new City("Wroclaw");
        City expectedFlightTo = new City("Krakow");

        List flightsFrom = flightsRepo.getFlights().stream()
                .filter(flight -> flight.getCityFrom().equals(expectedFlightFrom)).toList();

        List flightsTo = flightsRepo.getFlights().stream()
                .filter(flight -> flight.getCityTo().equals(expectedFlightTo)).toList();

    }
}
