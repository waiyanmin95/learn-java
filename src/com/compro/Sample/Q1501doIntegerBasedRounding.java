package compro.Sample;

import java.util.Arrays;

public class Q1501doIntegerBasedRounding { // nearest n
    public static int[] doIntegerBasedRounding(int[] a, int n) {

        int mid = n / 2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                a[i] = ((a[i] + mid) / n) * n;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{98, 77, 82, 43, 51}, 100)));
    }
}