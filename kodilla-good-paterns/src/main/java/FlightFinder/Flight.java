package FlightFinder;

import java.util.Objects;

public class Flight {
    private final City departure;
    private final City arrival;

    public Flight(City cityFrom, City cityTo) {
        this.departure = cityFrom;
        this.arrival = cityTo;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Departure = " + departure +
                ", Arrival = " + arrival +
                '}';
    }
}
