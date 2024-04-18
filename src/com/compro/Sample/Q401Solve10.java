package compro.Sample;

import java.util.Arrays;

public class Q401Solve10 {

    public static int[] solve10() {
        int[] result = new int[2];
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (factorial(i) + factorial(j) == factorial(10)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

//    private static int factorial(int n) {
//        int result = 1; // initial
//        for (int i = 2; i <= n; i++) { // calculate the factorial by increasing and multiply
//            result *= i;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(Arrays.toString(solve10()));
    }
}
