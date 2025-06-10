package com.highest;

import java.util.Scanner;

public class Highest {
    public void highesttemp(int sensor1,double a,double b,double c,double d,double f) {

        if(a > 28 || a<18){
            System.out.println("TEMP1 OUT OF RANGE");
        }
        if (b>28 || b < 18 ) {
            System.out.println("TEMP2 OUT OF RANGE");

        }
        if (c>28 || c<18) {
            System.out.println("TEMP3 OUT OF RANGE");

        }
        if (d>28 || d<18) {
            System.out.println("TEMP4 OUT OF RANGE");

        }
        if (f>28 || f<18) {
            System.out.println("TEMP5 OUT OF RANGE");

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
        highest.highesttemp(sensor1,a,b,c,d,f);

    }
}
