package com.company.exceptionHandling;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception using super
        super(s);
    }
}
