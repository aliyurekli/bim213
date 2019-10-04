package ceng.eskisehir.edu.tr.sorting;

/**
 * Stable = YES
 * In place = YES
 * Running time = O(N2)
 */

public class InsertionSort implements Sorting {

    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i=1; i<n; i++) {
            int value = numbers[i], pos;

            for (pos=i; pos>0 && numbers[pos-1] > value; pos--) {
                numbers[pos] = numbers[pos-1];
            }

            numbers[pos] = value;
        }
    }
}
