package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarksValidation {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(58);
        marks.add(45);
        marks.add(96);
        marks.add(85);
        marks.add(35);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Comparator.reverseOrder());
        System.out.println(marks);
        System.out.println(Collections.max(marks));
    }
}
