package com.string;

import java.util.Scanner;

public class BuildingWithS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] enter = new String[count];
        for(int i = 0;i < count; i++){
            enter[i]= sc.nextLine();
        }
        for(String value:enter){
            if (value.toLowerCase().startsWith("s")) {
                System.out.println(value);
            }
        }


    }

}
