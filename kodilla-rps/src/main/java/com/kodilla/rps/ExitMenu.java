package com.kodilla.rps;


public class ExitMenu {
    private boolean exit;
    private boolean playAgain;

    void exit(String userPlay, String exitChoice) {

        //Exit
        if (userPlay.equals("x")) {
            if (exitChoice.equals("y")) {
                exit = true;
            } else if (exitChoice.equals("n")) {
                System.out.println("""
                        Choose you move:\s
                         1: Rock\s
                         2: Paper\s
                         3: Scissors\s
                         Press n to restart the game.\s
                         Press x to exit.""");
            }

        } else if (userPlay.equals("n")) {
            if (exitChoice.equals("y")) {
                playAgain = true;
            } else {
                System.out.println("""
                        Choose you move:\s
                         1: Rock\s
                         2: Paper\s
                         3: Scissors\s
                         Press n to restart the game.\s
                         Press x to exit.""");
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
