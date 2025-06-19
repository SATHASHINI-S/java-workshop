package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> cseStudentClassA = new TreeMap<>();
        cseStudentClassA.put(1001,"Keerthana");
        cseStudentClassA.put(1002,"Raja Sir");
        cseStudentClassA.put(1003,"Sobhan");
        cseStudentClassA.put(1004,"Maddubro");

        Map<Integer,String> cseStudentClassB = new TreeMap<>();
        cseStudentClassB.put(1005,"Prathiba");
        cseStudentClassB.put(1006,"Abiksha");
        cseStudentClassB.put(1007,"Sathish sir");
        cseStudentClassB.put(1008,"Kishore");

        Map<Integer,String> cseStudentClass = new TreeMap<>();

        cseStudentClass.putAll(cseStudentClassA);
        cseStudentClass.putAll(cseStudentClassB);
//        System.out.println(cseStudentClass);
//        System.out.println(cseStudentClass.keySet());

        Map<Integer,String> cseStudentPaid = new TreeMap<>();
        cseStudentPaid.put(1005,"Prathiba");
        cseStudentPaid.put(1006,"Abiksha");
        cseStudentPaid.put(1002,"Raja Sir");
        System.out.println(cseStudentPaid);

        Map<Integer,String> cseStudent = new TreeMap<>(Comparator.reverseOrder());
        cseStudent.putAll(cseStudentClassA);
        cseStudent.putAll(cseStudentClassB);
        cseStudent.entrySet().removeAll(cseStudentPaid.entrySet());
        System.out.println(cseStudent);



    }
}
