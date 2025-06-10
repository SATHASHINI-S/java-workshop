package com.arrayys;

public class MultiArray {
    public static void main(String[] args) {
        String[] [] build={{"A", "B", "C", "D", "E"},{"12", "15", "19", "23", "25"}};
        int x = build[0].length;
        for(int i=0;i<x;i++){
            for(int j=0;j<build.length;j++){
                System.out.println((build[j][i]));
            }
        }
    }
}
