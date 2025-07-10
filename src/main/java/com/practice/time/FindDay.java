package com.practice.time;

import java.time.LocalDate;
import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        LocalDate findDay = LocalDate.parse(date);
        int getDay = findDay.getDayOfYear();
        System.out.println(getDay);
    }
}
