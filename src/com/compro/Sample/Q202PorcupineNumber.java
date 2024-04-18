package compro.Sample;

public class Q202PorcupineNumber {
    public static int isPrime(int n) {
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return 0;
        }
        return 1;
    }

    public static int isPorcupine(int n) {
        int num = n + 1; // initiate the num ( that need +1 )
        while (true) {
            if (1 == isPrime(num) && num % 10 == 9) { // check
                int next = num + 1;
                while (1 != isPrime(next)) { // find next value until the next is prime
                    next++;
                }
                System.out.println("Num: " + num + " " + "Next: " + next); // debug
                if (next % 10 == 9) { // check next value is end with 9
                    return num;
                }
            }
            num++; // num incremental
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(39));
        System.out.println(isPorcupine(149));
    }
}
