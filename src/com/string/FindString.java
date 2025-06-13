package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word);
        String[] spaceRemove = word.split(" ");
        System.out.println(Arrays.toString(spaceRemove));

    }

}
