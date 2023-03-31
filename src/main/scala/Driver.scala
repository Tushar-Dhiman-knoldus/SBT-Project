package com.knoldus.sbtproject
import scala.collection.JavaConverters._


object Driver extends App{

  private val calculatorExposeObject = new CalculatorExpose
  private val number1 = 20
  private val number2 = 30

  println(calculatorExposeObject.add(number1, number2))
  println(calculatorExposeObject.subtract(number1, number2))
  println(calculatorExposeObject.multiply(number1, number2))
  println(calculatorExposeObject.divide(10,0))
}

object Driver2 extends App{

  private val storageAccessObject = new StorageAccess

  val element1 = 3
  val element2 = 4
  val element3 = 5
  val element4 = 6
  val element5 = 7

 private val javaArrayList = storageAccessObject.addElementInArray(element1, element2, element3, element4, element5)

 private val scalaList = javaArrayList.asScala.toList
  println(scalaList)

  println(storageAccessObject.removeElementFromArray(element2))

  println(storageAccessObject.checkIfElementContainsInArray(element4))

  println(storageAccessObject.removeAllElement())
}
