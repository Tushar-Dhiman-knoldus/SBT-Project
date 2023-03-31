package com.knoldus.sbtproject;
import java.util.ArrayList;

public class Storage {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> addElement(int element1, int element2, int element3, int element4, int element5) {
        arrayList.add(element1);
        arrayList.add(element2);
        arrayList.add(element3);
        arrayList.add(element4);
        arrayList.add(element5);
        return arrayList;
    }
    public String removeElement(int element) {
        String removedElement = "";
        if(arrayList.contains(element)){
            removedElement = "Element removed";
            arrayList.remove(element);
        }else {
            removedElement = "Element is not present";
        }
        return removedElement;
    }

    public String removeAllElements() {
        String listEmpty = "";
        System.out.println(arrayList.size());
        if(arrayList.size() != 0){
            listEmpty = "All elements are removed";
        }else {
            listEmpty = "List is already empty";
        }
        return listEmpty;
    }

    public Boolean checkElement(int element){
        return arrayList.contains(element);
    }

}
