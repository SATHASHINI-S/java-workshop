package com.stream.example;

public class StaticMethod {
    static int counter = 10;
    void example(){
        counter++;

    }

    public static void main(String[] args) {
//        StaticMethod staticMethod = new StaticMethod();
//        staticMethod.example();
        System.out.println(counter);

    }
}
