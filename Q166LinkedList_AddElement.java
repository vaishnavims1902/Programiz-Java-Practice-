
//Add Elements Using add()

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q166LinkedList_AddElement {
    public static void main(String[] args){

    // create a linkedlist
    LinkedList<String> languages = new LinkedList<>();

    // Add elements to LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("LinkedList: " + languages);


    //Add element at the specified position
     languages.add(0, "Swift");
     System.out.println("Updated LinkedList: " + languages);


     //All all elements from other collection to LinkedList

     LinkedList<String> mammals = new LinkedList<>();

    mammals.add("Dog");
    mammals.add("Cat");
    mammals.add("Horse");
    System.out.println("Mammals: " + mammals);

    LinkedList<String> animals = new LinkedList<>();
    animals.add("Crocodile");

    // Add all elements of mammals in animals
    animals.addAll(mammals);
    System.out.println("Animals: " + animals);


    //Using listIterator() method
    ArrayList<String> fruits = new ArrayList<>();

    // Creating an object of ListIterator
    ListIterator<String> listIterate = fruits.listIterator();
    listIterate.add("Apple");
    listIterate.add("Banana");

    System.out.println("LinkedList: " + fruits);
  }
}
