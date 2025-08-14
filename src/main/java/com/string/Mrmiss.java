package com.string;

import java.util.Scanner;

public class Mrmiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] name = new String[count];
        for(int i = 0; i< count;i++){
            name[i]= sc.nextLine();
        }
        for(int i = 0; i < name.length; i++){


            if(i%2 == 0){
                System.out.println("Miss "+name[i]);
            }
            else{
                System.out.println("Mr  "+name[i]);
            }
        }


    }
}
