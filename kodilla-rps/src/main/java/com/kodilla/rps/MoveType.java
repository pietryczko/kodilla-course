package com.kodilla.rps;

import java.util.Random;

public enum MoveType {

    ROCK,
    PAPER,
    SCISSORS;

    ExitMenu exitMenu = new ExitMenu();
    public static MoveType from(String play) {
        switch (play) {
            case "1":
                return ROCK;
            case "2":
                return PAPER;
            case "3":
                return SCISSORS;
            default:
                throw new IllegalArgumentException("Not recognized: " + play);
        }
    }
}
