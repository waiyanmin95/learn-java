package compro.Sample;

public class Q1903closestFibonacci {
    public static int closestFibonacci(int n) {
        if (n < 1) {
            return 0;
        }
        int n1 = 1;
        int n2 = 1;
        int f = 0;
        for (int i = 3; i <= n; i++) {
            f = n1 + n2;
            n2 = n1;
            n1 = f;
            if (f > n) {
                return n2;
            }

        }
        return 0;
    }

    public static int closestFibonacciAnother(int n) {
        int fibonacci = 1;
        if (n == 1 || n == 2) {
            fibonacci = 1;
        }
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            if (fibonacci > n) return fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacciAnother(13));
        System.out.println(closestFibonacciAnother(33));
        System.out.println(closestFibonacciAnother(34));

    }
}
