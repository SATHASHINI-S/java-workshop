package com.string;

import java.util.Scanner;

public class NameandDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String[] name = new String[count];
        String[] degree = new String[count];

        for(int i = 0; i < name.length; i++){
            name[i]=sc.nextLine();
        }
        for(int i = 0; i < degree.length;i++){
            degree[i] = sc.nextLine();
        }

        for(int i = 0; i < count; i++){
            System.out.println(name[i]+""+degree[i]);
        }


    }
}
