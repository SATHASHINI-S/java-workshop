package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFile {
    @Test
    public void readonly() throws IOException {
        FileClass fileClass = new FileClass();
        fileClass.readonly();
        File filevalue = new File("sample.txt");
        Assertions.assertTrue(filevalue.exists());

    }
}
