package com.myjava.practice;

public class StringWordCounter {
    public int count(String input){
        String[] words = input.split(" ");
        int counter = 0;
        for(String word:words){
            if(!word.equals("")){
                counter++;
            }
        }
        return counter;
    }
}
