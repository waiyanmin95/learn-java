package compro.Sample;

import java.util.Arrays;

public class Q1203FilterArray {
    public static int[] filterArray(int[] a, int n) {
        if (n <= 0) {
            return new int[]{};
        }
        int size = getReturnArraySize(n);
        int[] result = new int[size];
        int index = 0;
        int j = 0;
        int temp = n;
        while (temp > 0) {
            if (temp % 2 == 1) {
                if (index >= a.length) {
                    return null;
                }
                result[j] = a[index];
                j++;
            }
            temp = temp / 2;
            index++;
        }

//        for (int i = n; i > 0; i /= 2) {
//            if (i % 2 == 1) {
//                if (index >= a.length) {
//                    return null;
//                }
//                result[j] = a[index];
//                j++;
//            }
//            index++;
//        }
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int getReturnArraySize(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{8, 4, 9, 0, 3, 1, 2};
        int[] all = new int[]{9, -9};
        int[] test2 = new int[]{9, -9, 5};
        int[] test3 = new int[]{0, 9, 12, 18, -6};
        System.out.println(Arrays.toString(filterArray(test1, 88)));
        System.out.println(Arrays.toString(filterArray(all, 0)));
        System.out.println(Arrays.toString(filterArray(all, 1)));
        System.out.println(Arrays.toString(filterArray(all, 2)));
        System.out.println(Arrays.toString(filterArray(all, 4)));
        System.out.println(Arrays.toString(filterArray(test2, 3)));
        System.out.println(Arrays.toString(filterArray(test3, 11)));
    }
}
