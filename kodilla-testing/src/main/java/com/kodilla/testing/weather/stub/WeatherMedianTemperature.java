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
        double median1;
        double median2 = 0;
        for (double temperature : temperatures.getValues()) {
            temperatureList.add(temperature);
        }
        Collections.sort(temperatureList);
            double middle = temperatureList.size()/2;
            if (middle % 2 == 0) {
                median1 = temperatureList.size()/2;
                median2 = temperatureList.size()/2 + 1;
                return temperatureList.get((int) ((median1 + median2)/2));

            } else {
                median1 = temperatureList.size()/2 + 0.5;
                return temperatureList.get((int) median1);
            }
    }
}
