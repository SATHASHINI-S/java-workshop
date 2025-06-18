package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUsingOutput {
    @Test
    public void fileOutput() throws IOException {
        FileOutputFunction fileOutputFunction = new FileOutputFunction();
        String fileName = "sample.txt";
        String content = "This is a Sample file";

        fileOutputFunction.writeToFile(fileName,content);

        String fileContent = new String(Files.readAllBytes(Paths.get("sample.txt")));
        Assertions.assertEquals(fileContent,content);
    }

}
