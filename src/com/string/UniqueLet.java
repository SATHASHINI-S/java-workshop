package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueLet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        int lengthOfLetter = letter.length();
        char[] convert = letter.toCharArray();
        Map<Character, Integer> letterCount = new HashMap<>();
        for (int i = 0; i < lengthOfLetter; i++){

            char word = convert[i];

            letterCount.put(word,letterCount.getOrDefault(word ,0)+1);


        }
        System.out.println(letterCount);

        for(int i = 0; i < lengthOfLetter; i++ ){
            char word = convert[i];
            if(letterCount.get(word)== 1){
                System.out.println(word);

            }
        }

    }
}
