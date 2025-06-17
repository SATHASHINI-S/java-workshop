package com.string;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel = sc.nextLine().trim();
        int count = 0;
        for(int i = 0; i<vowel.length();i++){
            char input=vowel.charAt(i);
            if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U'){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
        System.out.println(vowel);

    }
}
