package com.kodilla.exception.test;

import java.time.LocalDate;

public class ExceptionHandling {

    public void exceptionHandling() {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(5.0, 2.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Failed! Error: " + e);
        } finally {
            System.out.println("Time of task execution: " + LocalDate.now());
        }
    }
}
