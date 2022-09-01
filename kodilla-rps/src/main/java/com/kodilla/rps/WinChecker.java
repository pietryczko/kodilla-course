package com.kodilla.rps;

import static com.kodilla.rps.MoveType.*;

public class WinChecker {

    private int comPoints = 0;
    private int userPoints = 0;

    void checkWinner(MoveType userMove, MoveType compMove) {

        System.out.println("User move: " + userMove + "              Computer Move: " + compMove);

        if (compMove == ROCK && userMove == SCISSORS) {
            System.out.println("Computer win!");
            comPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        } else if (compMove == ROCK && userMove == PAPER) {
            System.out.println("User win!");
            userPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        }

        if (compMove == PAPER && userMove == ROCK) {
            System.out.println("Computer win!");
            comPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        } else if (compMove == PAPER && userMove == SCISSORS) {
            System.out.println("User win!");
            userPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        }

        if (compMove == SCISSORS && userMove == PAPER) {
            System.out.println("Computer win!");
            comPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        } else if (compMove == SCISSORS && userMove == ROCK) {
            System.out.println("User win!");
            userPoints++;
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        }

        if (compMove == userMove) {
            System.out.println("Draw!");
            System.out.println("Current score: " + userPoints + "-" + comPoints);
        }
    }
    int getComPoints() {
        return comPoints;
    }

    int getUserPoints() {
        return userPoints;
    }
}
