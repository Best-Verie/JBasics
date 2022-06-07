package com.company;

public class TheString {
    public TheString() {
    }

    //sting pool and java heap
    //When we use double quotes(String literal) to create the String object ,
    // it first looks for the String with the same value in the String pool .
    // If it is found then it will return the reference of the same object ,
    // else it creates a new String object in the pool and then returns
    // the reference of the newly created object.

    //However, using a new operator, we force String class to create a new String
    // object in heap space. We can use the intern() method to put the object into
    // the pool or refer to other String objects from the string pool having
    // the same value.

    // string is immutable
    //If you create an object of the String class, the string manipulation methods
    // will manipulate the content of the object just after duplicating the object
    // itself in the memory

    //n other words, string is immutable means
    // that we cannot change the object itself,
    // but we can change the reference to the object.

    // string class vs string buffer vs string builder
    //Simply, The String class is an immutable class
    // whereas StringBuffer and StringBuilder classes are mutable.
    //both string and string buffer are thread safe
    //string and string buffer are  ot time efficient
    //string buffer and string builder are memory efficient
}
