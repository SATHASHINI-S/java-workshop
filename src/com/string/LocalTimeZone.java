package com.string;

import java.time.LocalTime;
import java.util.Scanner;

public class LocalTimeZone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime timeNow = LocalTime.of(4,46);
        int minutes = LocalTime.now().getMinute();
        int hours = LocalTime.now().getHour();
        System.out.println((minutes- timeNow.getMinute())+" minutes "+(hours - timeNow.getHour()
        ));

    }
}
