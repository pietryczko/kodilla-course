package com.kodilla.rps;

import static com.kodilla.rps.Communicates.SHOW_OPTIONS_COMMUNICATE;

import java.util.Scanner;

public class RpsRunner {

    private Scanner scanner = new Scanner(System.in);
    private WinChecker winChecker = new WinChecker();
    private ExitMenu exitMenu = new ExitMenu();
    private MoveType moveType = new MoveType();

    private boolean exitGame = false;
    private boolean exitRound = false;

    private int winRounds;
    private String exitChoice;

    public static void main(String[] args) {
        RpsRunner rpsRunner = new RpsRunner();
        rpsRunner.play();
    }

    private void play() {
        invitePlayer();

        while (!exitGame) {
            playGame();
        }
    }

    private void playGame(){
        System.out.println("How many winnings you want to play?");

        winRounds = scanner.nextInt();
        boolean exitGame = false;

        while (!exitGame) {
            playRound();
        }
    }

    private void playRound(){
        System.out.println(SHOW_OPTIONS_COMMUNICATE);

        String userPlay = scanner.next();

        if (userPlay.equals("x") || userPlay.equals("n")) {
            System.out.println("Are you sure? Press y to yes, n to no:");
            exitChoice = scanner.next();
            exitMenu.exit(userPlay, exitChoice);
            if (exitMenu.getExit()) {
                return;
            } else if (exitMenu.getPlayAgain()) {
                return;
            } else {
                userPlay = scanner.next();
            }
        }

        MoveType userMove = MoveType.from(userPlay);
        MoveType comMove = moveType.play();

        winChecker.checkWinner(userMove, comMove);
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
                exitRound = true;
            } else {
                exitGame = true;
            }
        }
    }

    private void invitePlayer() {
        System.out.println("Welcome in rock, paper and scissors game! Tell us your name: ");
        System.out.println("Hi " + scanner.next() + "!");
    }
}