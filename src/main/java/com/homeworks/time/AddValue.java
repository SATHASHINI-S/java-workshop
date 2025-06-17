package com.homeworks.time;

import java.time.LocalDate;

public class AddValue {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now().plusDays(14);
        System.out.println(today);
    }
}
