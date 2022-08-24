package com.kodilla.rps;

public class ChoseWinner {
    String winner = "No winner";

    public String chooseWinner(String userChoice, String computerChoice) {
        //Computer chose rock
        if (computerChoice.equals("0") && userChoice.equals("3")) {
            winner = "Computer win!";
        } else if (computerChoice.equals("0") && userChoice.equals("2")) {
            winner = "User win!";
        }

        //Computer chose paper
        if (computerChoice.equals("1") && userChoice.equals("1")) {
            winner = "Computer win!";
        } else if (computerChoice.equals("1") && userChoice.equals("3")) {
            winner = "User win!";
        }

        //Computer chose scissors
        if (computerChoice.equals("2") && userChoice.equals("2")) {
            winner = "Computer win!";
        } else if (computerChoice.equals("2") && userChoice.equals("1")) {
            winner = "User win!";
        } else {
            winner = "Draw!";
        }
            return winner;
    }
}
