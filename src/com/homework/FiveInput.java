package com.homework;

import java.util.Scanner;

public class FiveInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfSensors =sc.nextInt();
        int numberOfTemperature =sc.nextInt();
        //Each sub array will have sensor id and Number of Temperautre.
        // That's why we are setting the size to Number of Temperature+1
        String [][] temperature_array =new String[noOfSensors][numberOfTemperature+1];
        for(int i = 0; i< temperature_array.length; i++){
            for(int j = 0; j< temperature_array[i].length; j++){
                temperature_array[i][j]= sc.next();
            }

        }
        for(int i = 0; i< temperature_array.length; i++){
            System.out.println();
            for(int j = 0; j< temperature_array[i].length; j++){
                System.out.print(temperature_array[i][j]);
                if(j<temperature_array[i].length-1){
                    System.out.print(",");
                }
            }
        }

    }

}
