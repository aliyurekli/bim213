package ceng.eskisehir.edu.tr.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        // Declare an ArrayList to store famous car manufacturers
        ArrayList<String> cars = new ArrayList<>();

        // Add "Honda", "Toyota", "Audi", "BMW", "Renault" to the list
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Renault");

        // Print the total number of elements in the list
        System.out.printf("There are %d elements in the list\n", cars.size());

        // Iterate the list with a for loop and print the elements
        for (int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println("*******************************");

        // Add "Ford" to the head of the list
        cars.add(0, "Ford");

        // Modify the last element of the list as "Hyundai"
        cars.set(cars.size()-1, "Hyundai");

        // Iterate the list with a for-each loop and print the elements
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("*******************************");

        // Search for "BMW" in the list, print the first index of the element if it exists
        if (cars.contains("BMW")) {
            int firstIndex = cars.indexOf("BMW");
            System.out.printf("First index of BMW is %d\n", firstIndex);
        }
        else {
            System.out.println("BMW does not exist in the list");
        }

        // Iterate the list using an iterator and print the elements
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove all elements of the list
        cars.clear();

        // Check if the list is empty now
        boolean empty = cars.isEmpty();
        System.out.printf("The list is empty: %s", String.valueOf(empty));
    }

    public static void main(String[] args) {

        new Thread(new ArrayListDemo()).start();
    }
}
