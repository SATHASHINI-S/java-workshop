package com.stream.example;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Arrays.stream(new String[]{"Java", "Python", "Java", "C++", "Python"}).distinct().forEach(System.out::println);
    }
}
