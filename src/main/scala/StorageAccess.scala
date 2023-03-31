package com.knoldus.sbtproject

import java.util

trait StorageTrait{
  def addElementInArray(): Unit
  def removeElementFromArray(): Unit
  def removeAllElement(): Unit
  def checkIfElementContainsInArray(): Unit
}

class StorageAccess {

  private val storageObject = new Storage

  // Function to call addElements of Java and add the elements in Java ArrayList.
  def addElementInArray(element1: Int, element2: Int, element3: Int, element4: Int, element5: Int): util.ArrayList[Integer] = {
    storageObject.addElement(element1, element2, element3, element4, element5)
  }

  // Function to call removeElements of Java and remove the element from Java ArrayList.
  def removeElementFromArray(elementToBeDeleted: Int): String = {
    storageObject.removeElement(elementToBeDeleted)
  }

  // Function to call removeAllElements of Java and remove all the elements from Java ArrayList.
  def removeAllElement(): String = {
    storageObject.removeAllElements()
  }

  // Function to call checkElement of Java and check whether the element is present in Java ArrayList.
  def checkIfElementContainsInArray(elementToBeChecked: Int): Boolean = {
    storageObject.checkElement(elementToBeChecked)
  }
}
