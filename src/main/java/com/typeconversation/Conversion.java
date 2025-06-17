package com.typeconversation;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0; i < n; i++)
        {
            arr[i]=sc.next();

        }
        System.out.println("The Temperatures are");
        for(int i=0;i < n; i++){
            System.out.println(Float.parseFloat(arr[i]));
        }

    }
}

