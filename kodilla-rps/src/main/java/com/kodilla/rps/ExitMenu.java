package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Communicates.SHOW_OPTIONS_COMMUNICATE;

public class ExitMenu {
    Scanner scanner = new Scanner(System.in);
    String confirmation = scanner.next();

    void exit(String userPlay) {

        //Exit
        if (confirmation.equals("y")) {
            exit = true;
        } else if (confirmation.equals("n")) {
            System.out.println(SHOW_OPTIONS_COMMUNICATE);
        }
    }

    void playAgain(String userPlay) {
        if (confirmation.equals("y")) {
            exit = true;
        } else if (confirmation.equals("n")) {
            System.out.println(SHOW_OPTIONS_COMMUNICATE);
        }
    }
}
