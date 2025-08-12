package com.stream.example;

import java.util.Arrays;
import java.util.Comparator;

public class FindMax {
    public static void main(String[] args) {
        Integer []numbers = {1,22,14,3,60,71,56,32};
        Integer numberStream = Arrays.stream(numbers).sorted(Comparator.reverseOrder()).findFirst().get();
        Integer numberMin = Arrays.stream(numbers).sorted().findFirst().get();
        System.out.println(numberMin);
        System.out.println(numberStream);

    //    Stream<Integer> numberStream = Arrays.stream(numbers);
    //    List<Integer> sorted = numberStream.sorted().collect(Collectors.toList());
    //    System.out.println(sorted.get(0));
    //    System.out.println(sorted.getLast());
    //    System.out.println(sorted);
    //    System.out.println("abc");


    }
}
