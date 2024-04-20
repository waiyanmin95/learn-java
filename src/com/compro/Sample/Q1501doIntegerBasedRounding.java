package compro.Sample;

import java.util.Arrays;

public class Q1501doIntegerBasedRounding {
    public static int[] doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            return a;
        }

        int mid = n / 2;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
//                System.out.println("TEMP: " + (a[i] + n / 2) / n * n);
                result[i] = ((a[i] + mid) / n) * n;
            } else {
                result[i] = a[i];
            }
        }
//        System.out.println("+=+=+=+=+=");
//        System.out.println("A is: " + Arrays.toString(a));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, -3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5}, 3)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5}, 4)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 5)));
        System.out.println(Arrays.toString(doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5}, 100)));
    }
}