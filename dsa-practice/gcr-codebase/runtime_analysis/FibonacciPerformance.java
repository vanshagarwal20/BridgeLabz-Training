package runtime_analysis;

public class FibonacciPerformance {

//     Recursive Fibonacci - O(2^N)
    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

//     Iterative Fibonacci - O(N)
    static int fibonacciIterative(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int n = 30;
        long start, time;

//         Recursive approach
        start = System.nanoTime();
        fibonacciRecursive(n);
        time = System.nanoTime() - start;
        System.out.println("Recursive Time : " + time + " ns");

//         Iterative approach
        start = System.nanoTime();
        fibonacciIterative(n);
        time = System.nanoTime() - start;
        System.out.println("Iterative Time : " + time + " ns");
    }
}

