package com.myjava.practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputFunction {
    public void writeToFile(String filename, String content) throws IOException {
        FileWriter fileWriter = new FileWriter("sample.txt");
        fileWriter.write(content);
        fileWriter.close();
    }
}
