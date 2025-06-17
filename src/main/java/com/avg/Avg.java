package com.avg;

import java.util.Scanner;

public class Avg {
    public static void average(int sensor,int a,int b,int c,int d,int e){
        double m=a+b+c+d+e;
        System.out.println(m/5);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sensor=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        Avg eve=new Avg();
        eve.average(sensor,a,b,c,d,e);
    }
}
