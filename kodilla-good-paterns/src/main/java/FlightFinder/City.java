package FlightFinder;

import java.util.Objects;

public class City {
    private String value;

    public City(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(value, city1.value);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
