package com.company;

import com.company.oopParadigm.GreetingsImpl;
import com.company.oopParadigm.Pig;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
//        UserInputHandling userInputHandling = new UserInputHandling();
//        userInputHandling.handleInput();

        // abstraction
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
        myPig.sleep("pig slipssss");


        //interface implementation
        GreetingsImpl greetings = new GreetingsImpl();
        greetings.sayHello();
    }
}
