package com.myjava.practice;

/**
 * This class remove space and provide the word count of the string
 */
public class StringWordCounter {
    private final String SPACE = " ";

    /**
     *
     * @param input String which needs to be splited into words.
     * @return count
     */
    public int count(String input){

        int counter = 0;
        if(input!=null){
            String[] words = input.split(SPACE);

            for(String word:words){
                if(!word.equals("")){
                    counter++;
                }
            }
        }
        return counter;
    }
}
