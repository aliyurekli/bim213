package ceng.eskisehir.edu.tr.recursion;

/**
 * Running time = O(2^N)
 */

public class RecursiveFibonacci {

    public static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n-1) + fibonacci(n-2);
    }
}
