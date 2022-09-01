package com.kodilla.rps;

import java.util.Scanner;

public class ExitMenu {
    private final WinChecker winChecker = new WinChecker();
    private final Scanner scanner = new Scanner(System.in);


    void exit(String userPlay) throws IllegalArgumentException {
        System.out.println("Are you sure? Press y to yes / Press n to no:");
        String confirmation = scanner.next();

        if (userPlay.equals("x")) {
            if (confirmation.equals("y")) {
                System.out.println("exiting game");
                System.exit(0);
            } else if (!confirmation.equals("n")) {
                throw new IllegalArgumentException("Not recognized: " + userPlay);
            }
        } else if (userPlay.equals("r")) {
            if (confirmation.equals("y")) {
                winChecker.setPlayAgainTrue();
            } else if (!confirmation.equals("n")) {
                throw new IllegalArgumentException("Not recognized: " + userPlay);
            }
        } else throw new IllegalArgumentException("Not recognized: " + userPlay);
    }
}
