package com.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class SquareMethod {
    public static void main(String[] args) {
        Integer []numbers = {1,2,4,3,6,71,56,32};
        Stream<Integer> numberStream = Arrays.stream(numbers);
        numberStream.map(n -> n * n).filter(n -> n > 20).forEach(System.out::println);
    }
}
