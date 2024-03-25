package compro.Sample;

public class Q1PrimeCount {
//    public static boolean isPrime(int n) {
//        int count = 0;
//        for (int i = 1; i <= n ; i++) {
//            if ( n % i == 0) {
//                count++;
//            }
//        }
//        return count == 2;
//    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2 ; i++) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static int primeCount(int start, int end) {
        if ( start > end ) {
            return 0;
        }
        int count = 0;
        for (int i = start; i <= end ; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(primeCount(10 , 30));
        System.out.println(primeCount(11 , 29));
        System.out.println(primeCount(20 , 22));
        System.out.println(primeCount(1 , 1));
        System.out.println(primeCount(5 , 5));
        System.out.println(primeCount(6 , 2));
        System.out.println(primeCount(-10 , 6));
    }
}
