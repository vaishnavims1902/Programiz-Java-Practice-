import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q165LinkedListRemoveElement {
    public static void main(String[] args) {

//Remove element using remove()
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    languages.add("Kotlin");
    System.out.println("LinkedList: " + languages);

    // remove elements from index 3
    String str = languages.remove(3);
    System.out.println("Removed Element: " + str);

    System.out.println("Updated LinkedList: " + languages);


//Using listIterator() Method


ArrayList<String> animals= new ArrayList<>();

        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("LinkedList: " + animals);

        // creating an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        listIterate.next();

        // remove element returned by next()
        listIterate.remove();
        System.out.println("New LinkedList: " + animals);


// Remove all elements using clear()


        // remove all the elements
        languages.clear();
        System.out.println("LinkedList after clear(): " + languages);


//Using the removeIf() Method

LinkedList<Integer> numbers = new LinkedList<>();

    // add elements in LinkedList
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    System.out.println("LinkedList: " + numbers);

    // remove all elements less than 4
    numbers.removeIf((Integer i) -> i < 4);
    System.out.println("Updated LinkedList: " + numbers);

  }
}
