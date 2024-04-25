package compro.Sample;

public class Q1901isHodder {
    public static int twoPower(int pow) {
        int result = 1;
        while (pow != 0) {
            result = 2 * result;
            pow--;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int isHodder(int n) {
        if (!isPrime(n)) {
            return 0;
        }
        int i = 0;
        while (i <= n) {
            if (twoPower(i) - 1 == n) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isHodder(3));
        System.out.println(isHodder(7));
        System.out.println(isHodder(31));
        System.out.println(isHodder(127));
        System.out.println(isHodder(128));
        System.out.println(isHodder(5));
        System.out.println(isHodder(11));
        System.out.println(isHodder(-2));
    }
}
