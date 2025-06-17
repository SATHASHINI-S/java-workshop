package com.string;

public class StringCount {
    public static void main(String[] args) {
        String sentence = "String is immutable object which stores value as byte array.";
        String len [] = sentence.split(" ");
        int count=0;
        System.out.println(len.length);
        String sent=sentence.replace(" ","");
        System.out.println(sent.length());
        for(int i = 0;i < sentence.length();i++) {
            if(sentence.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);

        String newone = String.join("",len);
        System.out.println(newone.length());
        String anotherone=String.join(newone);





    }
}
