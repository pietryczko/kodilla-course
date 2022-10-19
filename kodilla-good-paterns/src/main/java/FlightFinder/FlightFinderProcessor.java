package FlightFinder;

public class FlightFinderProcessor {
    public static void main(String[] args) {
        FlightsRepo flightsRepo = new FlightsRepo();
        flightsRepo.addFlight("Wroclaw", "Krakow");
        flightsRepo.addFlight("Krakow", "Wroclaw");

        String expectedFlightFrom = "Wroclaw";
        String expectedFlightTo = "Wroclaw";

        flightsRepo.getFlights().stream()
                .filter(flight -> flight.getCityTo().equals(expectedFlightFrom))
                .filter(flight -> flight.getCityTo().equals(expectedFlightTo))
                .forEach(System.out::println);
    }
}
