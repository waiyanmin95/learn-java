package compro.Sample.Set2;

public class Q1902isMeera {
    public static int isMeera(int[] a) {
        boolean containZero = false;
        boolean containPrime = false;
        for (int i : a) {
            if (isPrime(i)) {
                containPrime = true;
            }
            if (i == 0) {
                containZero = true;
            }
        }
        if ((containPrime && containZero) || (!containPrime && !containZero)) {
            return 1;
        }
        return 0;
    }

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

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{7, 6, 0, 10, 1}));
        System.out.println(isMeera(new int[]{6, 10, 1}));
        System.out.println(isMeera(new int[]{7, 6, 10}));
        System.out.println(isMeera(new int[]{6, 10, 0}));
        System.out.println(isMeera(new int[]{3, 7, 0, 8, 0, 5}));
    }
}
