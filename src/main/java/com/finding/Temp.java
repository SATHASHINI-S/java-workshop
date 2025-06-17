package com.finding;

import java.util.Scanner;

public class Temp {
    public void temp(float a){
        if(a>=18 && a<=20){
            System.out.println("COOLEST");
        }
        if(a>20 && a<=24){
            System.out.println("COOLER");
        }
        if(a>24 && a<=28){
            System.out.println("COOL");
        }
        if(a<18 || a>28){
            System.out.println("OUT OF RANGE");

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        Temp tempe=new Temp();
        tempe.temp(a);
    }
}
