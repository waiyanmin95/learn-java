package compro.Sample;

public class Q1401largestPrimeFactor {
    public static int largestPrimeFactor(int n) {

        int largest = 0;
        int temp = 0;
        while (temp < n) {
            if (isPrime(temp) && n % temp == 0) {
                largest = temp;
            }
            temp++;
        }
        System.out.println("Largest: " + largest);
        return largest;
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

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }
}
