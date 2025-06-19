package com.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicCollections {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Raja Sir");
        name.add("Maddu Bro");
        name.add("Soban Bro");
        System.out.println(name);
        name.add(1,"keerthana");
        System.out.println(name);
        name.remove(2);
        System.out.println(name.reversed());
        name.forEach(System.out :: println);
        List<String> names = new ArrayList<>();
        names.add("Sathashini");
        name.addAll(names);

        System.out.println(name.subList(0,2));


    }
}
