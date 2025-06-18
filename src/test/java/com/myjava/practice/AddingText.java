package com.myjava.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class AddingText {
    @Test
    public void addingText() throws IOException {
        AddingValueText addingValueText = new AddingValueText();
        String filename = "samplee.txt";
        String text = "This is a add Text";
//        new File(filename).createNewFile();
        addingValueText.adding(filename,text);
        String newContent = new String(Files.readAllBytes(new File(filename).toPath()));
        Assertions.assertTrue(newContent.contains("This is a add Text"));
    }
}
