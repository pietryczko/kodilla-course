package FlightFinder;

public class Flight {
    private City cityFrom;
    private City cityTo;

    public Flight(City cityFrom, City cityTo) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public City getCityFrom() {
        return cityFrom;
    }

    public City getCityTo() {
        return cityTo;
    }
}
