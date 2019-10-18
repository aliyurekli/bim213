package ceng.eskisehir.edu.tr.list;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *  ArrayList Demonstration Scenario
 *
 *  1. Declare an ArrayList to store famous car manufacturers
 *  2. Add "Honda", "Toyota", "Audi", "BMW", "Renault" to the list
 *  3. Print the total number of elements in the list
 *  4. Iterate the list with a for loop and print the elements
 *  5. Add "Ford" to the head of the list
 *  6. Modify the last element of the list as "Hyundai"
 *  7. Iterate the list with a for-each loop and print the elements
 *  8. Search for "BMW" in the list, print the first index of the element if it exists
 *  9. Iterate the list using an iterator and print the elements
 *  10. Remove all the elements of the list
 *  11. Check if the list is empty now
 *
 */

public class ArrayListDemo implements Runnable {

    @Override
    public void run() {
        // Step 1
        ArrayList<String> cars = new ArrayList<>();

        // Step 2
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Renault");

        // Step 3
        System.out.printf("There are %d elements in the list\n", cars.size());

        // Step 4
        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Step 5
        cars.add(0, "Ford");

        // Step 6
        cars.set(cars.size()-1, "Hyundai");

        // Step 7
        for (String car : cars) {
            System.out.println(car);
        }

        // Step 8
        String bmw = "BMW";
        if (cars.contains(bmw)) {
            int firstIndex = cars.indexOf(bmw);
            System.out.printf("First index of BMW is %d\n", firstIndex);
        }
        else {
            System.out.println("BMW does not exist in the list");
        }

        // Step 9
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 10
        cars.clear();

        // Step 11
        boolean empty = cars.isEmpty();
        System.out.printf("The list is empty: %s", String.valueOf(empty));
    }

    public static void main(String[] args) {
        new Thread(new ArrayListDemo()).start();
    }
}
