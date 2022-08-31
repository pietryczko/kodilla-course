package com.kodilla.rps;

import static com.kodilla.rps.Communicates.SHOW_OPTIONS_COMMUNICATE;

public class ExitMenu {
    private boolean exit;
    private boolean playAgain;

    void exit(String userPlay, String exitChoice) {

        //Exit
        if (userPlay.equals("x")) {
            if (exitChoice.equals("y")) {
                exit = true;
            } else if (exitChoice.equals("n")) {
                System.out.println(SHOW_OPTIONS_COMMUNICATE);
            }

        } else if (userPlay.equals("n")) {
            if (exitChoice.equals("y")) {
                playAgain = true;
            } else {
                System.out.println(SHOW_OPTIONS_COMMUNICATE);
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
