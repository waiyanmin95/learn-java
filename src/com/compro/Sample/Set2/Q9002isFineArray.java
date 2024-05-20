package compro.Sample.Set2;

public class Q9002isFineArray {
    public static int isFineArray(int[] a) {
        int prePrime = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) && prePrime == 0) {
                prePrime = a[i];
            }
            if (isPrime(a[i]) && (a[i] + 2 == prePrime || a[i] - 2 == prePrime)) {
                return 1;
            }
            if (isPrime(a[i]) && prePrime != a[i]) {
                prePrime = a[i];
            }
        }
        return prePrime == 0 ? 1 : 0;
    }

    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5}));
        System.out.println(isFineArray(new int[]{4, 9, 6, 33}));
        System.out.println(isFineArray(new int[]{3, 8, 15}));
        System.out.println(isFineArray(new int[]{4, 3, 6, 11, 13}));
    }
}
