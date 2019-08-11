package main.java.org.patterns.structural.decorator.exemple1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IO {
    public static void main(String[] args) throws FileNotFoundException {
        new BufferedInputStream(
                new FileInputStream(
                        new File("")));


        File file=new File("");
        file.mkdirs();
        FileInputStream fileInputStream=new FileInputStream(file);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);


    }
}
