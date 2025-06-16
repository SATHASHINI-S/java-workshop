package com.string;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class AgeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LocalDate today = LocalDate.now();
////        System.out.println(today);
//        LocalDate findAge = LocalDate.of(2002,11,17);
//        System.out.println(LocalDate.now().compareTo(findAge));
//        int data = today.getDayOfMonth();
        String dateOf = sc.next();
        LocalDate operate = LocalDate.parse(dateOf);
        System.out.println(operate);
        System.out.println(operate.format(DateTimeFormatter.ofPattern("dd-LLLL-yyyy")));






    }
}
