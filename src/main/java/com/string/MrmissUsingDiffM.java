package com.string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MrmissUsingDiffM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();
        String[] name = new String[count];
        for(int i = 0; i< count;i++){
            name[i]= sc.nextLine();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < name.length; i++){
            if(i%2 == 0){
                System.out.println(stringBuffer.insert(0,"Mr.").append((name[i])));


            }
            else{
                System.out.println(stringBuffer.insert(0,"Miss.").append((name[i])));
            }
            stringBuffer.delete(0,stringBuffer.length());
        }




    }
}
