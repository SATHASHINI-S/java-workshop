package com.stream.example;

import java.io.*;

public class Byte {

        public static void main(String[] args) {
            String filePath = "sample.txt";
//            File file = new File("sample.txt");
//
//             Basic InputStream (FileInputStream)
            try (InputStream inputStream = new FileInputStream(filePath)) {
                System.out.println("Reading with InputStream:");
                int data;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                }
                System.out.println("\n--- End of InputStream ---");
            } catch (IOException e) {
                System.out.println("Error using InputStream: " + e.getMessage());
            }

            // BufferedInputStream
            try (BufferedInputStream bufferedStream = new BufferedInputStream(new FileInputStream(filePath))) {

                System.out.println("\nReading with BufferedInputStream:");
                int data;
                while ((data = bufferedStream.read()) != -1) {
                    System.out.print((char) data);

                }
                System.out.println("\n--- End of BufferedInputStream ---");
            } catch (IOException e) {
                System.out.println("Error using BufferedInputStream: " + e.getMessage());
            }

        }


}
