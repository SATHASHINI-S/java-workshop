package com.remove;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfBuilding=sc.nextInt();
        String[] arr=new String[numberOfBuilding];
        String[] remove=new String[numberOfBuilding-1];
        for(int i=0;i<numberOfBuilding;i++){
            arr[i]=sc.next();

        }
        for(int i=0,j=0;i< arr.length;i++){
            if(!arr[i].equals("c")){
                remove[j]=arr[i];
                j++;

            }
        }
        System.out.println(Arrays.toString(remove));



    }
}
