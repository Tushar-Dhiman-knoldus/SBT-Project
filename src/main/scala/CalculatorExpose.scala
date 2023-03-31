package com.knoldus.sbtproject

class CalculatorExpose {

  private val calculatorObject = new Calculator

  def add(number1: Int, number2: Int): Int = calculatorObject.add(number1, number2)
  def subtract(number1: Int, number2: Int): Int = calculatorObject.subtract(number1, number2)
  def multiply(number1: Int, number2: Int): Int = calculatorObject.multiply(number1, number2)
  def divide(number1: Int, number2: Int): Double = calculatorObject.divide(number1, number2)

}
