package com.string;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class Matchess {
    public static void main(String[] args) {
        Pattern namePattern = Pattern.compile("[^aeiou]+$");
        Matcher matcher=namePattern.matcher("axcv");

        System.out.println(matcher.find());

//        String value = "String is immutable object ,which stored value as byte array";
//        String[] sentence = value.split("^a-e-i-o-u");
//        for(String word:sentence){
//            System.out.println(word);
//        }

    }
}
