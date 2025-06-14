package com.string;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String camCase = sc.nextLine();
        String[] swith = camCase.split(" ");
        StringBuilder camelCase = new StringBuilder();
        for(int i = 0; i < swith.length; i++){
            String low = swith[i].toLowerCase();
            if(i == 0){
                camelCase.append(low.toLowerCase());
            }
            else{
                camelCase.append(Character.toUpperCase(low.charAt(0)));
                camelCase.append(low.substring(1).toLowerCase());


            }
        }
        System.out.println(camelCase);

    }
}
