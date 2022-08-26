package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WinChecker winChecker = new WinChecker();
        ExitMenu exitMenu = new ExitMenu();
        ComPlay comPlay = new ComPlay();


        boolean exit = false;

        String name;
        int winRounds;

        String userPlay = "";
        String comMove = "";

        String exitChoice = "";

        System.out.println("Welcome in rock, paper and scissors game! Tell us your name: ");
        name = scanner.next();
        System.out.println("Hi " + name + "!");

        game:
        while (!exit) {
            System.out.println("How many winnings you want to play?");

            winRounds = Integer.parseInt(scanner.next());

            play:
            while (!exit) {

                System.out.println("Choose you move: \n 1: Rock \n 2: Paper \n 3: Scissors " +
                        "\n Press n to restart the game. \n Press x to exit.");

                userPlay = scanner.next();

                if (userPlay.equals("x") || userPlay.equals("n")) {
                    System.out.println("Are you sure? Press y to yes, n to no:");
                    exitChoice = scanner.next();
                    exitMenu.exit(userPlay, exitChoice);
                    if (exitMenu.getExit()) {
                        break game;
                    } else if (exitMenu.getPlayAgain()) {
                        break;
                    } else {
                        userPlay = scanner.next();
                    }
                }

                comMove = comPlay.play();

                winChecker.checkWinner(userPlay, comMove);
                System.out.println("");

                if (winChecker.getUserPoints() == winRounds) {
                    System.out.println("User won " + winChecker.getUserPoints() + " - " + winChecker.getComPoints());
                    break play;
                } else if (winChecker.getComPoints() == winRounds) {
                    System.out.println("Computer won " + winChecker.getComPoints() + " - " + winChecker.getUserPoints());
                    break play;
                }
            }
        }
    }
}