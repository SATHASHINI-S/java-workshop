package com.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer modify = new StringTokenizer(sentence," ",true);
        System.out.println(modify.countTokens());
        while(modify.hasMoreTokens()){
            System.out.println(modify.nextToken());
        }
    }
}
