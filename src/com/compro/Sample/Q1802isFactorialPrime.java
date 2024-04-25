package compro.Sample;

public class Q1802isFactorialPrime {
    public static int isFactorialPrime(int n) {
        if (isPrime(n)) {
            for (int i = 1; i < n; i++) {
                if (factorial(i) + 1 == n) {
                    return 1;
                }
                if (factorial(i) + 1 > n) {
                    break;
                }
            }
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(isFactorialPrime(2));
        System.out.println(isFactorialPrime(3));
        System.out.println(isFactorialPrime(7));
        System.out.println(isFactorialPrime(8));
        System.out.println(isFactorialPrime(11));
        System.out.println(isFactorialPrime(721));
    }
}
