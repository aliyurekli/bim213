package ceng.eskisehir.edu.tr.sorting;

/**
 * Stable = YES
 * In place = YES
 * Running time = O(N^2)
 */

public class BubbleSort implements Sorting {

    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
