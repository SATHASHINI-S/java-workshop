package com.practice.files;


import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        File myfile = new File("sample");


        System.out.println(myfile.isFile());
        System.out.println(myfile.getAbsoluteFile());
        System.out.println(myfile.getCanonicalFile());
        System.out.println(myfile.canRead());
        System.out.println(myfile.canWrite());





    }
}
