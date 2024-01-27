package compro.Porcupine;

public class findPorcupine {
    public static boolean isPrimeNumber(int n) {
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

    private static int isPorcupineNumber(int n) {
        int num = n + 1;
        while (true) {
            if (isPrimeNumber(num) && num % 10 == 9) {
                // the current one is Prime and end with nine
                int nextNum = num + 1;
                // find next prime
                while (!isPrimeNumber(nextNum)) {
                    nextNum += 1;
                }
                if (nextNum % 10 == 9) {
                    return num;
                }
            }
            num++;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPorcupineNumber(409));
    }
}
