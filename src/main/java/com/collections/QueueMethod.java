package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        Queue<Integer> addmissionQueue = new LinkedList<>();
        addmissionQueue.add(300);
        addmissionQueue.add(100);
        addmissionQueue.add(500);
        addmissionQueue.add(400);
        System.out.println(addmissionQueue);
        System.out.println(addmissionQueue.remove());
        System.out.println(addmissionQueue);
        Integer rollNumber = addmissionQueue.remove();
        while(rollNumber!=null){
            System.out.println(rollNumber);
            rollNumber=addmissionQueue.remove();
        }



    }
}
