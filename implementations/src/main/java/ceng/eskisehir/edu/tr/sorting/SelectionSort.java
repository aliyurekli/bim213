package ceng.eskisehir.edu.tr.sorting;

/**
 * Stable = NO
 * In place = YES
 * Running time = O(N2)
 */

public class SelectionSort implements Sorting {

    public void sort(int[] numbers) {
        int n = numbers.length;

        for (int i=0; i<n-1; i++) {
            int minIndex = i;

            for (int j=i+1; j<n; j++) {
                if(numbers[j] < numbers[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                int temp = numbers[minIndex];
                numbers[minIndex] = numbers[i];
                numbers[i] = temp;
            }
        }
    }
}
