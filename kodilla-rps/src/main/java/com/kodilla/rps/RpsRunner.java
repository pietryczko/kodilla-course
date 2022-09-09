package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Communicates.SHOW_OPTIONS_COMMUNICATE;

public class RpsRunner {

    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final WinChecker winChecker = new WinChecker();
    private final ExitMenu exitMenu = new ExitMenu();
    private boolean exitGame = false;
    private boolean exitRound = false;

    private int winRounds;

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

    private void playGame() {
        System.out.println("How many wins do you want to play for?");
        winRounds = scanner.nextInt();
        exitRound = false;

        while (!exitRound) {
            playRound();
            if (winChecker.playAgain() || exitMenu.getRestart()) {
                winChecker.setPlayAgainFalse();
                exitMenu.setRestartFalse();
                break;
            }
        }
    }

    private void playRound() {

        System.out.println(SHOW_OPTIONS_COMMUNICATE);
        String userPlay = scanner.next();

        if (userPlay.equals("x") || userPlay.equals("r")) {
            exitMenu.exit(userPlay);
        } else {
            MoveType userMove = MoveType.from(userPlay);
            MoveType comMove = MoveType.from(String.valueOf(random.nextInt(3) + 1));
            winChecker.checkWinner(userMove, comMove, winRounds);
        }
    }

    private void invitePlayer() {
        System.out.println("Welcome in rock, paper and scissors game! Tell us your name: ");
        System.out.println("Hi " + scanner.next() + "!");
    }
}