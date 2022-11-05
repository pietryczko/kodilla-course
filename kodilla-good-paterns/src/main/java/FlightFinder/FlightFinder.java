package FlightFinder;

public class FlightFinder {
    public static void main(String[] args) {

        FlightFinderProcessor processor = new FlightFinderProcessor(new FlightsRepo());

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
}
