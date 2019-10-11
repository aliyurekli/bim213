package ceng.eskisehir.edu.tr;

import ceng.eskisehir.edu.tr.recursion.RecursiveFibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private final int[] zeroToNine = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

    @Test
    public void testRecursiveFibonacci() {
        for (int i = 0; i< zeroToNine.length; i++) {
            assertEquals(RecursiveFibonacci.fibonacci(i), zeroToNine[i]);
        }
    }}
