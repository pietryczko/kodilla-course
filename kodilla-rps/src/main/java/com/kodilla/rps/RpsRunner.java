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

        String userPlay;
        String comMove;

        String exitChoice;

        System.out.println("Welcome in rock, paper and scissors game! Tell us your name: ");
        name = scanner.next();
        System.out.println("Hi " + name + "!");

        game:
        while (!exit) {
            System.out.println("How many winnings you want to play?");

            winRounds = Integer.parseInt(scanner.next());
            boolean exitGame = false;
            while (!exitGame) {

                System.out.println("""
                        Choose you move:\s
                         1: Rock\s
                         2: Paper\s
                         3: Scissors\s
                         Press n to restart the game.\s
                         Press x to exit.""");

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
                System.out.println();

                if (winChecker.getUserPoints() == winRounds || winChecker.getComPoints() == winRounds) {
                    if (winChecker.getUserPoints() == winRounds) {
                        System.out.println("User win the game!");
                    } else if (winChecker.getComPoints() == winRounds) {
                        System.out.println("Computer win the game!");
                    }
                    System.out.println("Do you want to play again?");
                    userPlay = scanner.next();
                    if (userPlay.equals("y")) {
                        exitGame = true;
                    } else {
                        exit = true;
                    }
                }

            }
        }
    }
}