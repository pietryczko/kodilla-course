package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int choice = random.nextInt(3);
        ChoseWinner chooseWinner = new ChoseWinner();
        Scanner input = new Scanner(System.in);
        boolean end = false;
        String userChoice;

        while (!end) {
            System.out.println("Welcome to Rock Paper Scissors game! \n Please tell us your name:");
            String name = input.next();
            System.out.println("Hi " + name + "! How many rounds do you want to play?");
            int rounds = input.nextInt();
            for (int i = 0; i < rounds; i++) {
                System.out.println("Choose your move: \n Press 1 to play: rock \n Press 2 to play: paper \n Press 3 to play: scissors");
                userChoice = input.next();
                System.out.println(choice);
                chooseWinner.chooseWinner(userChoice, String.valueOf(choice));
                System.out.println(chooseWinner.winner);
            }
        }
    }
}
