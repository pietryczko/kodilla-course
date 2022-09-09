package com.kodilla.rps;

public enum MoveType {

    ROCK,
    PAPER,
    SCISSORS;

    public static MoveType from(String play) {
        return switch (play) {
            case "1" -> ROCK;
            case "2" -> PAPER;
            case "3" -> SCISSORS;
            default -> throw new IllegalArgumentException("Not recognized: " + play);
        };
    }
}
