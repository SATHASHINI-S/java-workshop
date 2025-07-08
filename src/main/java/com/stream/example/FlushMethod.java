package com.stream.example;

import java.io.*;

public class FlushMethod {

    public static void main(String[] args) {
        String inputFile = "sample.txt";     // make sure this file exists
        String outputFile = "samplee.txt";

        try (
                BufferedInputStream input = new BufferedInputStream(new FileInputStream(inputFile));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(outputFile))
        ) {
            int data;
            while ((data = input.read()) != -1) {
                output.write(data); // write each byte
            }

            output.flush(); // flush remaining data from buffer to file
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
