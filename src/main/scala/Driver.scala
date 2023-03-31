package com.knoldus.sbtproject
import scala.collection.JavaConverters._

// Driver Code for CalculatorExpose Scala class.
object Driver extends App{

  private val calculatorExposeObject = new CalculatorExpose
  private val number1 = 30
  private val number2 = 20

  println(calculatorExposeObject.add(number1, number2))
  println(calculatorExposeObject.subtract(number1, number2))
  println(calculatorExposeObject.multiply(number1, number2))
  println(calculatorExposeObject.divide(number1, number2))

  // This will throw the exception which is handled.
  println(calculatorExposeObject.divide(10,0))
}

// Driver code for the Storage Access.scala
object Driver2 extends App{

  private val storageAccessObject = new StorageAccess

  val element1 = 3
  val element2 = 4
  val element3 = 5
  val element4 = 6
  val element5 = 7

  // Adding elements to the ArrayList of Java and storing it in the variable.
  private val javaArrayList = storageAccessObject.addElementInArray(element1, element2, element3, element4, element5)

  // Converting the Arraylist to Scala List.
  private val scalaList = javaArrayList.asScala.toList
  println(scalaList)

  println(storageAccessObject.removeElementFromArray(element2))
  println(storageAccessObject.checkIfElementContainsInArray(element4))
  println(storageAccessObject.removeAllElement())
}
