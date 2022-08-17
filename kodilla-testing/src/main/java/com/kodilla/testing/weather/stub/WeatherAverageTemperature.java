package com.kodilla.testing.weather.stub;

import java.util.Map;

public class WeatherAverageTemperature {
    private Temperatures temperatures;

    public WeatherAverageTemperature(Temperatures temperatures)
    {
        this.temperatures = temperatures;
    }

    public double calculateAverage() {
        double temperaturesSum = 0.0;
        double counter = 0.0;
        for (double temperature : temperatures.getValues()) {
            temperaturesSum += temperature;
            counter++;
        }
        return temperaturesSum/counter;
    }
}