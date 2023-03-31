package com.knoldus.sbtproject;
public class Calculator {

    // This function is used to add 2 numbers.
    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    // This function is used to subtract 2 numbers.
    public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    // This function is used to subtract 2 numbers.
    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    // This function is used to divide 2 numbers.
    public Double divide(int firstNumber, int secondNumber){
        double result = 0;
        try {
            result =  (double) firstNumber / secondNumber;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        return result;
    }
}

