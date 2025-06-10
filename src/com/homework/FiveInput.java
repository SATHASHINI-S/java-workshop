package com.homework;

import java.util.Scanner;

public class FiveInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String [][] temp=new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j< m;j++){
                temp[i][j]= sc.next();
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j< n;j++){
                System.out.println(temp[j][i]);
            }
        }

    }

}
