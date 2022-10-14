package com.kodilla.testing.example;

public class CalculatorImpl implements Calculator{

    @Override public double add(double a, double b) {
        return a+b;
    }

    @Override public double subtract(double a, double b) {
        return a-b;
    }
}
