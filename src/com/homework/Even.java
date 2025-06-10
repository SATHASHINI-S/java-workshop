package com.homework;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
}
