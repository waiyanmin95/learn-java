package compro.PerfectNumber;

import java.util.ArrayList;
import java.util.List;

public class Q19PerfectNumber {
    public static boolean isPerfectNumber(int n) {
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static int henry(int i, int j) {
        int number = 0;
        List<Integer> xi = new ArrayList<>();
        for (int k = 0; k < Integer.MAX_VALUE; k++) {
            if ( isPerfectNumber(k) ) {
                number = k;
                xi.add(number);
            }
        }

        i = xi.get(i-1);
        j = xi.get(j-1);

        return i + j;
    }

    public static void main(String[] args) {
        System.out.println(henry(1, 3));
    }
}
