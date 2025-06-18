package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class ThreeDiffFile {

    @Test
    public void differentFiles() throws IOException {
        FileType fileType = new FileType();
        fileType.creation();
        Assertions.assertTrue(new File("source").exists());
        Assertions.assertTrue(new File("source/text.txt").exists());
        Assertions.assertTrue(new File("source/input.txt").exists());
        Assertions.assertTrue(new File("source/output.txt").exists());


    }
}
