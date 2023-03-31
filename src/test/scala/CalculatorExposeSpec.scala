package com.knoldus.sbtproject

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorExposeSpec extends AnyFlatSpec {

  "CalculatorExpose" should "correctly add two numbers" in {
    val calculatorExposeObject = new CalculatorExpose
    assert(calculatorExposeObject.add(3, 5) == 8)
  }

  it should "correctly subtract two numbers" in {
    val calculatorExposeObject = new CalculatorExpose
    assert(calculatorExposeObject.subtract(5, 3) == 2)
  }

  it should "correctly multiply two numbers" in {
    val calculatorExposeObject = new CalculatorExpose
    assert(calculatorExposeObject.multiply(3, 5) == 15)
  }

  it should "correctly divide two numbers" in {
    val calculatorExposeObject = new CalculatorExpose
    assert(calculatorExposeObject.divide(10, 2) == 5)
  }

}
