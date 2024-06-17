package compro.Sample.Set2;

public class Q1602isTwin {
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

    public static int isTwin(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            boolean isTwin = true;
            if (isPrime(a[i]) && ((isPrime(a[i] - 2) || isPrime(a[i] + 2)))) {
                System.out.println(a[i]);
                isTwin = false;
                for (int j : a) {
                    if (isPrime(j) && (j + 2 == a[i])) {
                        isTwin = true;
                        break;
                    }
                    if (isPrime(j) && (j - 2 == a[i])) {
                        isTwin = true;
                        break;
                    }
                }
            }
            if (!isTwin) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
//        System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(isTwin(new int[]{13, 14, 11, 15, 3}));

    }
}
