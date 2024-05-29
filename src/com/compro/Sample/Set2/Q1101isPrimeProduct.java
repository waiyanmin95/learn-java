package compro.Sample.Set2;

public class Q1101isPrimeProduct {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int isPrimeProduct(int n) {
        if (n <= 1) {
            return 0;
        }
        int i = 2;
        while (i < n) {
            int j = i;
            while (j < n) {
                if (isPrime(i) && isPrime(j)) {
                    if (i * j == n) {
                        System.out.println("I: " + i + " J: " + j);
                        return 1;
                    }
                }
                j++;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
    }
}
