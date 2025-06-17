package com.myjava.practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperationFiles {

    public void createFileWithContent(String file, String s) throws IOException {
        FileWriter fileWriter = new FileWriter("myfile.txt");
        fileWriter.write(s);
        fileWriter.close();
    }
}
