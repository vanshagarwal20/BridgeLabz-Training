package scenario_based;

class MathUtils {

//     Factorial
    static long factorial(int n) {
        if (n < 0) return -1;
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

//     Prime Check
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

//     GCD (Euclidean Algorithm)
    static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

//     Fibonacci
    static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

public class MathTest {
    public static void main(String[] args) {
        System.out.println("Factorial(5): " + MathUtils.factorial(5));
        System.out.println("Factorial(-3): " + MathUtils.factorial(-3));

        System.out.println("IsPrime(7): " + MathUtils.isPrime(7));
        System.out.println("IsPrime(1): " + MathUtils.isPrime(1));

        System.out.println("GCD(12, 18): " + MathUtils.gcd(12, 18));
        System.out.println("GCD(0, 5): " + MathUtils.gcd(0, 5));

        System.out.println("Fibonacci(6): " + MathUtils.fibonacci(6));
        System.out.println("Fibonacci(-2): " + MathUtils.fibonacci(-2));
    }
    
}


