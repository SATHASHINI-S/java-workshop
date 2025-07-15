package com.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Print {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Welcome");
        System.out.format(" to see the differnce of print & println ");
        System.out.printf("to see the differnce of print & println ");

        PrintStream printStream = new PrintStream("sample.txt");
        printStream.println("Hellofile");

    }
}
