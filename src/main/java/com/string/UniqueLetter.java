package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> wordCount = new HashMap<>();
        String paragraph = sc.nextLine();

        String[] splitTheParagraph = paragraph.split(" ");
        int findLength = splitTheParagraph.length;
        for(int i = 0 ; i < findLength; i++ ){

            String word = splitTheParagraph[i];
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);

        }

        for(int i = 0 ; i < findLength; i++ ){
            String word = splitTheParagraph[i];

            if(wordCount.get(word)==1){
                System.out.print(" "+word);

            }
        }


    }
}
