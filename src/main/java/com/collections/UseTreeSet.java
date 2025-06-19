package com.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    public static void main(String[] args) {
        Set<String> nameStudent = new TreeSet<>(Comparator.reverseOrder());
        nameStudent.add("Keerthana");
        nameStudent.add("Sobhan");
        nameStudent.add("MaadduBro");
        nameStudent.add(null);
        nameStudent.add("Raja Sir");
        System.out.println(nameStudent);
    }
}
