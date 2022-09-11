package com.kodilla.testing.weather.stub;

import java.util.Collection;
import java.util.Map;

public interface Temperatures {
    Map<String, Double> getTemperatures();
    Collection<Double> getValues();
}
