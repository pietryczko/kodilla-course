package FlightFinder;

public class City {
    private String city;

    public City(String city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }

    @Override
    public String toString() {
        return this.city;
    }
}
