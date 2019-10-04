package ceng.eskisehir.edu.tr;

import ceng.eskisehir.edu.tr.sorting.BubbleSort;
import ceng.eskisehir.edu.tr.sorting.InsertionSort;
import ceng.eskisehir.edu.tr.sorting.SelectionSort;
import ceng.eskisehir.edu.tr.sorting.Sorting;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SortingTest {

    @Test
    public void testBubbleSort() {
        Sorting[] sorters = new Sorting[] {new BubbleSort(), new SelectionSort(), new InsertionSort()};

        for (Sorting s : sorters) {
            for (int i=1; i<=100; i++) {
                int[] arr1 = RandomIntArrayGenerator.randomize();
                int[] arr2 = arr1.clone();

                s.sort(arr1);
                Arrays.sort(arr2);

                assertArrayEquals(arr1, arr2);
            }
        }
    }
}
