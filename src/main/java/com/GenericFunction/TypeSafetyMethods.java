package com.GenericFunction;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyMethods {
    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("Sathashini");
        myList.add('A');
        myList.add(123);
        myList.add(21.14789);
        System.out.println(myList);

        String name = (String) myList.get(0);
        Character character = (Character) myList.get(1);
        Integer integer = (Integer) myList.get(2);
        Double dou = (Double) myList.get(3);
        System.out.println(name);



    }
}
