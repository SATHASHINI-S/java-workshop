package com.remove;

import java.util.Scanner;

public class RemoveUsing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numberOfBuilding=sc.nextInt();
        String[] arr=new String[numberOfBuilding];
        String[] remove=new String[numberOfBuilding-1];
        int count=0;
        for(int i=0;i<numberOfBuilding;i++){
            arr[i]=sc.next();

        }
        for(int i=0,j=0; i < arr.length; i++){
            if(!arr[i].equals("c")){
                arr[j]=arr[i];
                j++;
            }
            if(arr[i].equals("c")){

                count++;
            }
        }
        for(int x=arr.length-count; x<arr.length; x++)
            arr[x]=null;
        for(int i=0; i < arr.length; i++){

            System.out.println(arr[i]);

        }
    }
}
