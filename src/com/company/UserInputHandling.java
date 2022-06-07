package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserInputHandling {


    public UserInputHandling() throws IOException {
    }

    void handleInput() throws IOException {
        //buffered reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println ("Enter your name: ");
        String input = bufferedReader.readLine();
        System.out.println("your name is: " + input);


        //string tokenizer

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader1.readLine();

        StringTokenizer tokenizer = new StringTokenizer(name, ",");
        String inputName =  tokenizer.nextToken();
        String age= tokenizer.nextToken();

        System.out.println("the name is, " + inputName + "and the age is: " + age);

        // scanner
        //accepts multiple inputs from file or keyboard and divide then into tokens

        System.out.println("Enter the name and tha age");
        Scanner scanner = new Scanner(System.in);
        int myAge = scanner.nextInt();
        String myName = scanner.next();


        System.out.println("the name is, " + myName + "and the age is: " + myAge);

    }
}
