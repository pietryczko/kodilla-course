package com.kodilla.testing.weather.mock;                                     // [1]

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherAverageTemperature;
import com.kodilla.testing.weather.stub.WeatherForecast;
import com.kodilla.testing.weather.stub.WeatherMedianTemperature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;
    private Map<String, Double> temperaturesMap = new HashMap<>();
    @BeforeEach
    void setUp() {
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testWeatherAverageTemperature() {
        //Given
        when(temperaturesMock.getValues()).thenReturn(temperaturesMap.values());
        WeatherAverageTemperature weatherAverageTemperature = new WeatherAverageTemperature(temperaturesMock);

        //When
        double averageTemperature = weatherAverageTemperature.calculateAverage();     // [

        //Then
        Assertions.assertEquals(25.56, averageTemperature);
    }

    @Test
    void testWeatherMedianTemperature() {
        //Given
        when(temperaturesMock.getValues()).thenReturn(temperaturesMap.values());
        WeatherMedianTemperature weatherMedianTemperature = new WeatherMedianTemperature(temperaturesMock);

        //When
        double averageTemperature = weatherMedianTemperature.showMedianTemperature();     // [

        //Then
        Assertions.assertEquals(25.5, averageTemperature);
    }
}