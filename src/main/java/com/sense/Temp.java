package com.sense;

import java.util.Scanner;

public class Temp {
    public static void sense(int sensor1,int sensor2){
        System.out.println(sensor1);
        System.out.println(sensor2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sensor1=sc.nextInt();
        int sensor2=sc.nextInt();
        Temp temp=new Temp();
        temp.sense(sensor1,sensor2);

    }
}
