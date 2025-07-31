package com.collections;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.ArrayList;
import java.util.List;


public class AddingItem {
    public static void main(String[] args) {
        List<Integer> listArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listArray.add(i);
        }
        System.out.println(listArray);

     }

    @Benchmark
    public List<Integer> benchmarkAddItems() {
        List<Integer> listArray = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listArray.add(i);
        }
        return listArray;
    }
}
