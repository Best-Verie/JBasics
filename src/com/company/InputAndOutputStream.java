package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutputStream {
    public InputAndOutputStream() {
    }

    //Following is an example which makes use of these two classes to copy an input file into an output file


    void handleInputAndOutputStream(){
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("input.txt");
            out= new FileOutputStream("output.txt");
            int c = 0;
//            while((c==in.read() != -1)){
//
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
