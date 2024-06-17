package compro.Sample.Set2;

public class Q1702isNiceArray {
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

    public static int isNice(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                sum += a[i];
            }
        }
        if (a[0] == sum) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isNice(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isNice(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isNice(new int[]{10, 5, 5}));
        System.out.println(isNice(new int[]{0, 6, 8, 20}));
        System.out.println(isNice(new int[]{3}));
        System.out.println(isNice(new int[]{8, 5, 5, 5, 3}));
    }
}


