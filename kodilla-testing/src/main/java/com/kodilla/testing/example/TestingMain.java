package com.kodilla.testing.example;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        if (Calculator.add(1, 5) == 6 && Calculator.subtract(10,5) == 5) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Error!");
        }
    }
}