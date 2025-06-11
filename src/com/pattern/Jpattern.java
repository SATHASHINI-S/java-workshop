package com.pattern;

import java.util.Scanner;

public class Jpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row= sc.nextInt();
        int col=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==col/2|| i == row-1 && j<col/2 || j==0 && i==row-2){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
