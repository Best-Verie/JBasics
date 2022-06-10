package com.company.exceptionHandling;

import java.io.File;
import java.io.IOException;

public class tryCatchSample {
    public static void main(String[] args){
        String parentDirectory = null;
        File file = new File(parentDirectory, "text.txt");
        try {
            file.createNewFile();
            System.out.println("created file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
