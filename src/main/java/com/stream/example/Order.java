package com.stream.example;

import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        Arrays.stream(new String[]{"Banana", "Apple", "Cherry", "Mango"}).sorted().forEach(System.out::println);
    }
}
