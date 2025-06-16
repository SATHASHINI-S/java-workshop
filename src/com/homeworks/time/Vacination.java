package com.homeworks.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Vacination {
    public static void main(String[] args) {
        String date = "2024-04-03";
        LocalDate plusfive = LocalDate.parse(date).plusDays(30);

        LocalDate plusf = LocalDate.parse(date).plusDays(50);

        LocalDate plusfi = LocalDate.parse(date).plusDays(90);
        System.out.println(plusfive);
        System.out.println(plusf);
        System.out.println(plusfi);


    }
}
