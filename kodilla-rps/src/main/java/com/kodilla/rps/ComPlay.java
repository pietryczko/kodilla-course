package com.kodilla.rps;

import java.util.Random;

public class ComPlay {

    private int index;
    private Random random = new Random();
    private String comPlay;
    private String r = "rock";
    private String p = "paper";
    private String s = "scissors";

    private String[] plays = {r, p, s};

    String play() {
        index = random.nextInt(3);
        comPlay = plays[index];
        return comPlay;
    }
}
