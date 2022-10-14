package com.kodilla.testing.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = Stream.of(1,5,10)
                .map(new MyFunction())
                .skip(1)
                .map(i -> i*2)
                .filter(i -> i > 10)
                .limit(2)
                .collect(Collectors.toList());

    }

}

class MyFunction implements Function<Integer, Integer>{
    @Override public Integer apply(Integer integer) {
        return integer+2;
    }
}