package compro.Sample;

public class Q1702isPrimeHappy {
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

    public static int isPrimeHappy(int n) {
        int temp = 2;
        int result = 0;
        while (temp < n) {
            if (isPrime(temp)) {
                result += temp;
//                System.out.println("temp: " + temp + " result: " + result);
            }
            temp++;
        }

        return result % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));

    }
}
