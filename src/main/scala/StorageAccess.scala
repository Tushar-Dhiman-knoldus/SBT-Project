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

  def addElementInArray(element1: Int, element2: Int, element3: Int, element4: Int, element5: Int): util.ArrayList[Integer] = {
    storageObject.addElement(element1, element2, element3, element4, element5)
  }

  def removeElementFromArray(elementToBeDeleted: Int): String = {
    storageObject.removeElement(elementToBeDeleted)
  }

  def removeAllElement(): String = {
    storageObject.removeAllElements()
  }

  def checkIfElementContainsInArray(elementToBeChecked: Int): Boolean = {
    storageObject.checkElement(elementToBeChecked)
  }
}
