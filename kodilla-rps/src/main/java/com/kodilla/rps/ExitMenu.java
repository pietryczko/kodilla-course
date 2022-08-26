package com.kodilla.rps;

import java.util.Scanner;

public class ExitMenu {
    private Scanner scanner = new Scanner(System.in);
    private boolean exit;
    private boolean playAgain;

    void exit(String userPlay, String exitChoice) {

        //Exit
        if (userPlay.equals("x")) {
            if (exitChoice.equals("y")) {
                exit = true;
            } else if (exitChoice.equals("n")) {
                System.out.println("Choose you move: \n 1: Rock \n 2: Paper \n 3: Scissors " + "\n Press n to restart the game. \n Press x to exit.");
            }

        } else if (userPlay.equals("n")) {
            if (exitChoice.equals("y")) {
                playAgain = true;
            } else {
                System.out.println("Choose you move: \n 1: Rock \n 2: Paper \n 3: Scissors " + "\n Press n to restart the game. \n Press x to exit.");
            }
        }

    }

    boolean getExit() {
        return exit;
    }

    boolean getPlayAgain() {
        return playAgain;
    }
}
