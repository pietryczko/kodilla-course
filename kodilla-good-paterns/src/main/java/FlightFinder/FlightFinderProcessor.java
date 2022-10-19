package FlightFinder;

public class FlightFinderProcessor {
    public static void main(String[] args) {
        FlightsRepo flightsRepo = new FlightsRepo();
        flightsRepo.addFlight("Wroclaw", "Krakow");
        flightsRepo.addFlight("Krakow", "Wroclaw");

        City expectedFlightFrom = new City("Wroclaw");
        City expectedFlightTo = new City("Krakow");

        flightsRepo.getFlights().stream()
                .filter(flight -> flight.getCityFrom().equals(expectedFlightFrom))
                .filter(flight -> flight.getCityTo().equals(expectedFlightTo))
                .forEach(System.out::println);
    }
}
