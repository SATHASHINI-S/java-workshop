package com.stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Integer []numbers = {1,2,4,3,6,71,56,32};
        Stream<Integer> numberStream = Arrays.stream(numbers);
//        numberStream.filter(number -> number%2 == 0).forEach(System.out::println);
//        numberStream.map(num -> num*num).filter(numb->numb>10).forEach(System.out::println);
        numberStream.max(Comparator.naturalOrder()).ifPresent(System.out::println);


    }
}
