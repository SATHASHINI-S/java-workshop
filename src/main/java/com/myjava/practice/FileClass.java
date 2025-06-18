package com.myjava.practice;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public void readonly() throws IOException {
        File file = new File("sample.txt");
        file.createNewFile();
        file.setReadOnly();
    }
}
