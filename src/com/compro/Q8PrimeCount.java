package compro;

public class Q8PrimeCount {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeCount(int start, int end) {
        int pcount = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                pcount++;
            }
        }
        return pcount;
    }

    public static void main(String[] args) {
//        System.out.println(primeCount(19, 23));
        System.out.println(isPrime(19));
//        System.out.println(primeCount(10 , 30));
//        System.out.println(primeCount(11 , 29));
//        System.out.println(primeCount(20 , 22));
//        System.out.println(primeCount(1 , 1));
//        System.out.println(primeCount(5 , 5));
//        System.out.println(primeCount(6 , 2));
//        System.out.println(primeCount(-10 , 6));
    }
}