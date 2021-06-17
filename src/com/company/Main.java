package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void findFirst(int from, int to) {
        List<Integer> nums = IntStream.rangeClosed(from, to).boxed().collect(Collectors.toList());
        int y = 3;
        nums.stream().filter(x -> x % y == 0).findFirst().ifPresent(System.out::println);
    }

    public static void mapTry() {
        Stream.of(1, 2, 3).map(x -> x * x).forEach(System.out::println);
    }

    public static void main(String[] args) {

        findFirst(1, 1000);
        mapTry();

    }
}
