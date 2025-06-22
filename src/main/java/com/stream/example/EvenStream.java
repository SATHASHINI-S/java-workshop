package com.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class EvenStream {
    public static void main(String[] args) {
        Integer []number = {2,5,8,15,17,18};
        Stream <Integer> numberEven = Arrays.stream( number);
        numberEven.filter(i -> i % 2 == 0).forEach(System.out::println);

    }
}
