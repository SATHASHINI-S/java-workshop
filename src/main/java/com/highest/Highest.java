package com.highest;

import java.util.Scanner;

public class Highest {
    public void highesttemp(double temp) {
        if(temp<18 || temp>28){
            System.out.println(temp+"OUT OF RANGE");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Highest highest=new Highest();
        int sensor1=sc.nextInt();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double f=sc.nextDouble();
        highest.highesttemp(a);
        highest.highesttemp(b);
        highest.highesttemp(c);
        highest.highesttemp(d);
        highest.highesttemp(f);

    }
}
