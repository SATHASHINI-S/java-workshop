package com.myjava.practice;

import java.io.FileWriter;
import java.io.IOException;

public class AddingValueText {

    public void adding(String filename,String text) throws IOException {
        FileWriter writer = new FileWriter("samplee.txt",true);
        writer.write(text);
        writer.close();

    }
}
