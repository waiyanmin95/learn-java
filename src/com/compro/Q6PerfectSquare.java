package compro;

public class Q6PerfectSquare {
    public static int isPerfectSquare(int n) {
        if(n < 0) {
            return 0;
        }

        int current = 1;
        while (current * current <= n ) {
            current++;
        }
//        int current = (int) Math.floor(Math.sqrt(n));
//        current = current + 1;

        return current * current;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(9));
    }
}
