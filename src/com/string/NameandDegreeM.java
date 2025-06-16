package com.string;

import java.util.Scanner;

public class NameandDegreeM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String degree = sc.nextLine();
        String stream = sc.nextLine();
        String college = sc.nextLine();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append(name).append(" Completed ");
//        stringBuilder.append(degree).append(" in the stream of ");
//        stringBuilder.append(stream).append(" from ");
//        stringBuilder.append(college);
        String s = "%s completed %s in the stream of %s from %s";
        System.out.println(String.format(s,name,degree,stream,college));
//        System.out.println(stringBuilder);
    }
}
