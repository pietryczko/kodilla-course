package com.kodilla.rps;

import java.util.Random;

public enum MoveType {

    ROCK,
    PAPER,
    SCISSORS;

    private final Random random = new Random();

    public static MoveType from(String userPlay) {
        switch (userPlay) {
            case "1":
                return ROCK;
            case "2":
                return PAPER;
            case "3":
                return SCISSORS;
            default:
                throw new IllegalArgumentException("Not recognized: " + userPlay);
        }
    }

    MoveType play() {
        int index = random.nextInt(3);

        return MoveType.values()[index];
    }
}
