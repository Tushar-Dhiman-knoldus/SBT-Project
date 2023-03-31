package com.knoldus.sbtproject;
public class Calculator {

    public int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public Double divide(int firstNumber, int secondNumber){

        double result = 0;
        try {
            result =  firstNumber / secondNumber;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        return result;
    }
}

