package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SentenceSpliter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] split = sentence.split("\\.");
        System.out.println(Arrays.toString(split));
    }
}
