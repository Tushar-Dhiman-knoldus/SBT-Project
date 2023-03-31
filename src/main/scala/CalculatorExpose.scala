package com.knoldus.sbtproject

class CalculatorExpose {

  private val calculatorObject = new Calculator

  // This Scala function is used to call the Java add() Function of Calculator.
  def add(number1: Int, number2: Int): Int = calculatorObject.add(number1, number2)

  // This Scala function is used to call the Java subtract() Function of Calculator.
  def subtract(number1: Int, number2: Int): Int = calculatorObject.subtract(number1, number2)

  // This Scala function is used to call the Java multiply() Function of Calculator.
  def multiply(number1: Int, number2: Int): Int = calculatorObject.multiply(number1, number2)

  // This Scala function is used to call the Java divide() Function of Calculator.
  def divide(number1: Int, number2: Int): Double = calculatorObject.divide(number1, number2)
}
