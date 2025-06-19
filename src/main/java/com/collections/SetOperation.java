package com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(40);
        set1.add(70);
        set1.add(90);
        set1.add(20);
        Set<Integer> set2 = Set.of(30,40,50,20,80);
        Set<Integer>setAdd= new HashSet<>();
        setAdd.addAll(set1);
        setAdd.addAll(set2);
        set1.retainAll(set2);
        setAdd.removeAll(set1);
        System.out.println(setAdd);

    }
}
