package FlightFinder;

import java.util.Objects;

public class City {
    private final String cityName;

    public City(String value) {
        this.cityName = value;
    }

    @Override
    public int hashCode() {
        return cityName.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(cityName, city1.cityName);
    }

    @Override
    public String toString() {
        return this.cityName;
    }
}
