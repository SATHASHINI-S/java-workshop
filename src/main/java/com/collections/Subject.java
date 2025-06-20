package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subject {
    public static void main(String[] args) {
        Set<String> subject = new HashSet<>();
        subject.add("Machine Learning Techniques");
        subject.add("Advanced Machine Learning");
        subject.add("Reinforcement Learning");
        subject.add("Cloud Computing");
        System.out.println(subject);

        List<String> subjectList = new ArrayList<>(subject);
        subjectList.add(0, "Natural Language Processing");

        System.out.println(subjectList.remove(subjectList.size()-1));
        System.out.println(subjectList);
    }
}
