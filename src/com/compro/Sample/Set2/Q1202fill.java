package compro.Sample.Set2;

import java.util.Arrays;

public class Q1202fill {
    public static int[] fill(int[] a, int k, int n) {
        if (k == 0) {
            return null;
        }

        int[] result = new int[n];

        int i = 0;
        for (int j = 0; j < result.length; j++, i++) {
            if (i < a.length) {
                result[j] = a[i];
            }
            if (i == k - 1) {
                i = 0;
                i--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fill(new int[]{1, 2, 3, 5, 9, 12, 2, 1}, 3, 10)));
    }
}
