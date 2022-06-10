package com.company.exceptionHandling;

public class InvalidProductExceptionImplementor
{
    void productValidityChecker(int weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("This Product is Invalid!");
        }
    }

    public static void main(String args[])
    {
        InvalidProductExceptionImplementor obj = new InvalidProductExceptionImplementor();
        try
        {
            obj.productValidityChecker(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
// we are using the get message from the super Exception class as we have passed to super int the //constructor
            System.out.println(ex.getMessage());
        }
    }
}

