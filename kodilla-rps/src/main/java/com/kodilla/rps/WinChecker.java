package com.kodilla.rps;

import static com.kodilla.rps.MoveType.PAPER;
import static com.kodilla.rps.MoveType.ROCK;

public class WinChecker {

    private int comPoints = 0;
    private int userPoints = 0;

    void checkWinner(MoveType userMove, MoveType compMove) {

        if (compMove == ROCK && userMove == PAPER) {
            System.out.println("Computer win!");
            comPoints++;


        } else if (comPlay.equals("rock") && userPlay.equals("2")) {
            System.out.println("User win!");
            userPoints++;
        }

        if (comPlay.equals("paper") && userPlay.equals("1")) {
            System.out.println("Computer win!");
            comPoints++;
        } else if (comPlay.equals("paper") && userPlay.equals("3")) {
            System.out.println("User win!");
            userPoints++;
        }

        if (comPlay.equals("scissors") && userPlay.equals("2")) {
            System.out.println("Computer win!");
            comPoints++;
        } else if (comPlay.equals("scissors") && userPlay.equals("1")) {
            System.out.println("User win!");
            userPoints++;
        }

        if ((comPlay.equals("rock") && userPlay.equals("1")) || (comPlay.equals("paper") && userPlay.equals("2"))
                || (comPlay.equals("scissors") && userPlay.equals("3"))) {
            System.out.println("Draw!");
        }
    }

    int getComPoints() {
        return comPoints;
    }

    int getUserPoints() {
        return userPoints;
    }
}
