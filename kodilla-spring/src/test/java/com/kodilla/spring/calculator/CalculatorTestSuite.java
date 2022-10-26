package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //When
        double addResult = calculator.add(2, 3);
        //Then
        assertEquals(5, addResult);
    }

    @Test
    void testSub() {
        double subResult = calculator.sub(7.5, 2.5);

        assertEquals(5, subResult);
    }

    @Test
    void testDiv() {
        double divResult = calculator.div(10, 2);

        assertEquals(5, divResult);
    }

    @Test
    void testmul() {
        double mulResult = calculator.mul(2.5, 2);

        assertEquals(5, mulResult);
    }
}
