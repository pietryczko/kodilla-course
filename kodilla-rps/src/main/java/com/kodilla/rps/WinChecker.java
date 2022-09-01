package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.MoveType.*;

public class WinChecker {
    private final Scanner scanner = new Scanner(System.in);
    private boolean playAgain = false;
    private int comPoints = 0;
    private int userPoints = 0;

    void checkWinner(MoveType userMove, MoveType compMove, int winRounds) {

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

        if (userPoints == winRounds || comPoints == winRounds) {
            if (userPoints == winRounds) {
                System.out.println("User win the game!");
            } else {
                System.out.println("Computer win the game!");
            }

            System.out.println("Do you want to play again?");
            String userPlay = scanner.next();
            if (userPlay.equals("y")) {
                playAgain = true;
            } else {
                System.exit(0);
            }
        }
        if (playAgain) {
            userPoints = 0;
            comPoints = 0;
        }
    }

    void setPlayAgainFalse() {
        playAgain = false;
    }

    void setPlayAgainTrue() {
        playAgain = true;
    }

    boolean playAgain() {
        return playAgain;
    }
}
