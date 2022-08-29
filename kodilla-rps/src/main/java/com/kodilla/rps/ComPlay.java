package com.kodilla.rps;

import java.util.Random;

public class ComPlay {

    private final Random random = new Random();
    private final String r = "rock";
    private final String p = "paper";
    private final String s = "scissors";

    private final String[] plays = {r, p, s};

    String play() {
        int index = random.nextInt(3);
        return plays[index];
    }
}
