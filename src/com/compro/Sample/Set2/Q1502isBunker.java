package compro.Sample.Set2;

public class Q1502isBunker {
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

    public static int isBunker(int[] a) {
        boolean containOne = false;
        boolean containePrime = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                containOne = true;
            }
            if (isPrime(a[i])) {
                containePrime = true;
            }
        }
        if (containePrime && containOne) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{3, 7, 1, 8, 1}));
        System.out.println(isBunker(new int[]{4, 8, 10, 12, 14}));
    }
}
