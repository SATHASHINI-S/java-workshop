package com.myjava.practice;

import java.io.File;
import java.io.IOException;

public class FileType {
    public void creation() throws IOException {
        File folder = new File("source");
        folder.mkdirs();

        new File("source/text.txt").createNewFile();
        new File("source/input.txt").createNewFile();
        new File("source/output.txt").createNewFile();

    }
}
