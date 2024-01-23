package compro;

import java.util.ArrayList;
import java.util.List;

public class Q5isConsectiveFactored {
    public static int isConsectiveFactored(int n) {
        if ( n <= 1 ) {
            return 0;
        }

        List<Integer> factor = new ArrayList<>();

        for ( int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                factor.add(i);
            }
        }

        for ( int i = 0; i < factor.size() -1; i++) {
            int a = factor.get(i);
            int b = factor.get(i+1);
            if ( a > 1 && a + 1 == b ) {
                System.out.println(factor);
                return 1;
            }
        }
        System.out.println(factor);
        return 0;
    }

    public static void main(String[] args) {
        for ( int i = 2; i <= 20; i++) {
            System.out.println("I is " + i + " and result: " + isConsectiveFactored(i));
        }
    }
}
