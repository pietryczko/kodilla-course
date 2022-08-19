package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherMedianTemperature {
    private Temperatures temperatures;

    public WeatherMedianTemperature(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public double showMedianTemperature() {
        List<Double> temperatureList = new ArrayList<>();
        for (double temperature : temperatures.getValues()) {
            temperatureList.add(temperature);
        }
        Collections.sort(temperatureList);
        double middle = temperatureList.size() / 2;
        if (middle % 2 == 0) {
            double median1 = temperatureList.size() / 2;
            double median2 = temperatureList.size() / 2 + 1;
            return temperatureList.get((int) ((median1 + median2) / 2));
        } else {
            return temperatureList.get(temperatureList.size() / 2);
        }
    }
}
