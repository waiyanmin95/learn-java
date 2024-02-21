package compro.Recurrsion;

import java.util.Arrays;

public class Q16ImpossibleSolution {
    public static int fact(int n)
    {
        if (n <= 1) // base case
            return 1;
        else
            return n * fact(n - 1 );
    }

    public static int[] solve10() {
        int[] result = new int[2];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if ( fact(i) + fact(j) == fact(10)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve10()));
    }
}
