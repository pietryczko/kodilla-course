package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {
    public List<Integer> exterminate(List<Integer> number) {
        List<Integer> numList = new ArrayList<>();
        for (int num : number) {
            if (num % 2 == 0) {
                numList.add(num);
            }
        }
        return numList;
    }
}
