package com.cal;

import java.util.Scanner;

public class Calcu {
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }
    public static void div(int a,int b){
        System.out.println(a/b);
    }
    public static void mod(int a,int b){
        System.out.println(a/b);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        mod(a,b);

    }
}
