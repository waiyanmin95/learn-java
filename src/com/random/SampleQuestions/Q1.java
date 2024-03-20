package random.SampleQuestions;

public class Q1 {
    public static boolean isPrime(int n) {
        if ( n <= 1 ) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
    public static int primeCount(int start, int end) {
        int count =0 ;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(primeCount(10, 30));
    }
}
