package com.kodilla.testing.example;

public interface Calculator {

    double add(double a, double b);

    default double subtract(double a, double b){
        return a+b;
    }

}
