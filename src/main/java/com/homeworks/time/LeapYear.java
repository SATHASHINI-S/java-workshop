package com.homeworks.time;

import java.time.LocalDate;

public class LeapYear {
    public static void main(String[] args) {
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);
    }
}
