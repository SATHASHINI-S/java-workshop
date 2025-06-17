package com.homeworks.time;

import java.time.YearMonth;
import java.util.Scanner;

public class FindTheMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        for(int month = 1;month<=12;month++){
            YearMonth ym = YearMonth.of(year,month);
            int day = ym.lengthOfMonth();
            System.out.println(ym.getMonth()+" "+day);
        }
    }
}
