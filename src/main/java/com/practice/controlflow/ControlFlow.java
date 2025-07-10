package com.practice.controlflow;

public class ControlFlow {
    public void flowcontrol (int number){
        if(number % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        ControlFlow controlFlow = new ControlFlow();
        controlFlow.flowcontrol(6);
    }
}
