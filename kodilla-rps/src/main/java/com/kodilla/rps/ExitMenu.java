package com.kodilla.rps;

import java.util.Scanner;

public class ExitMenu {
    private final Scanner scanner = new Scanner(System.in);
    private boolean restart = false;

    void exit(String userPlay) throws IllegalArgumentException {
        System.out.println("Are you sure? Press y to yes / Press n to no:");
        String confirmation = scanner.next();

        if (userPlay.equals("x")) {
            if (confirmation.equals("y")) {
                System.out.println("Quiting the game");
                System.exit(0);
            } else if (!confirmation.equals("n")) {
                throw new IllegalArgumentException("Not recognized: " + userPlay);
            }
        } else if (userPlay.equals("r")) {
            if (confirmation.equals("y")) {
                System.out.println("Restarting the game");
                restart = true;
            } else if (!confirmation.equals("n")) {
                throw new IllegalArgumentException("Not recognized: " + userPlay);
            }
        } else throw new IllegalArgumentException("Not recognized: " + userPlay);
    }
    boolean getRestart() {
        return restart;
    }

    void setRestartFalse() {
        restart = false;
    }
}
