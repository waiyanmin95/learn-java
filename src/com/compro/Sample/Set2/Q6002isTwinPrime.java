package compro.Sample.Set2;

public class Q6002isTwinPrime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int isTwinPrime(int n) {
        if (isPrime(n) && (isPrime(n - 2) || isPrime(n + 2))) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
        System.out.println(isTwinPrime(11));
    }
}
