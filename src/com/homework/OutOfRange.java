package com.homework;

import java.util.Scanner;

public class OutOfRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i < n; i++){
            if(arr[i]<18 || arr[i]>28){
                System.out.println(arr[i]+ " OUT OF RANGE");
            }
        }

    }
}
