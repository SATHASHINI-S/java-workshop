package com.homeworks.time;


import java.time.LocalTime;
import java.util.Scanner;

public class Before {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now().minusMinutes(30);
        System.out.println(time);




    }
}
