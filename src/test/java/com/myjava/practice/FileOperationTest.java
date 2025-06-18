package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationTest {

    @Test

    public void fileOperationTest() throws IOException {
        FileOperationFiles fileOperationFiles = new FileOperationFiles();
        fileOperationFiles.createFileWithContent("myfile.txt","this is sathashini first file from java program");
        File myfile = new File("myfile.txt");


        Assertions.assertTrue(myfile.exists());
        FileReader myfilereader = new FileReader(myfile);
        char[] content = new char[47];
        myfilereader.read(content);
        myfilereader.close();
        System.out.println(content);
        Assertions.assertEquals("this is sathashini first file from java program",String.valueOf(content));
    }

}
