package compro.Sample.Set2;

import java.util.Arrays;

public class Q1003pairwiseSum {
    public static int[] pairwiseSum(int[] a) {
        if (a.length % 2 != 0 || a.length == 0) {
            return null;
        }

        int[] result = new int[a.length / 2];

        int index = 0;
        for (int i = 0; i < a.length; i += 2) {
            result[index] = a[i] + a[i + 1];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{})));
    }
}
