package com.stream.example;

import java.util.Arrays;
import java.util.Comparator;

public class NameLength {
    public static void main(String[] args) {
        String[] nameList = {"maddubro", "keerthanasri", "sathashini", "Shobanbro", "Kishore","Guruprasath"};
//        Arrays.stream(nameList).map(String::length).sorted().findFirst().get();
//        System.out.println(Arrays.stream(nameList).map(String::length).sorted(Comparator.reverseOrder()).findFirst().get());
        int maxLength = Arrays.stream(nameList).map(String::length).sorted(Comparator.reverseOrder()).findFirst().get();

        Arrays.stream(nameList).filter(name -> name.length() == maxLength).forEach(System.out::println);


    }
}
