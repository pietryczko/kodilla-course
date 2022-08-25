
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String[] plays = {r, p, s};

        boolean exit = false;

        String name;
        int winRounds;

        String comPlay;
        String userPlay;
        char userMenu;

        int index;

        while (!exit) {
            System.out.println("Welcome in rock, paper and scissors game! Tell us your name: ");
            name = scanner.next();
            System.out.println("Hi " + name + "! How many winnings you want to play?");
            winRounds = scanner.nextInt();

            for (int i = 0; i < winRounds; i++) {
                System.out.println("Choose you move: \n 1: Rock \n 2: Paper \n 3: Scissors \n Press n to restart the game. \n Press x to exit.");
                userPlay = scanner.next();

                index = random.nextInt(3);
                comPlay = plays[index];

                System.out.println("User play: " + userPlay + "         Computer play: " + comPlay);
            }
        }

    }
}
