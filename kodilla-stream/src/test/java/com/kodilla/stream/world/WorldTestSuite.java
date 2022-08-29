package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("38000000"));
        Country germany = new Country(new BigDecimal("50000000"));
        Country france = new Country(new BigDecimal("60000000"));
        Country japan = new Country(new BigDecimal("500000000"));
        Country china = new Country(new BigDecimal("1500000000"));
        Country indie = new Country(new BigDecimal("1500000000"));
        Country egypt = new Country(new BigDecimal("10000000"));
        Country algeria = new Country(new BigDecimal("90000000"));
        Country libya = new Country(new BigDecimal("80000000"));

        Continent asia = new Continent();
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(indie);

        Continent europe = new Continent();
        asia.addCountry(poland);
        asia.addCountry(germany);
        asia.addCountry(france);

        Continent africa = new Continent();
        asia.addCountry(egypt);
        asia.addCountry(algeria);
        asia.addCountry(libya);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then

        BigDecimal expectedPeople = new BigDecimal("3828000000");
        assertEquals(expectedPeople, totalPeople);


    }
}
