package com.homeworks.time;

import java.time.LocalDate;
import java.util.Scanner;

public class Fivedays {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate fivebefore = today.minusDays(5);
        System.out.println(today);
        System.out.println(fivebefore);
    }
}
