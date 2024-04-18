package compro.Sample;

import java.util.Arrays;

public class Q1002clusterCompression {
    public static int[] clusterCompression(int[] a) {
        if (a.length == 0) {
            return new int[]{};
        }
        int clusterNums = 1;
        int j = 0;
        for (int i = 1; i < a.length; i++, j++) {
            if (a[j] != a[i]) {
                clusterNums++;
            }
        }
        int[] result = new int[clusterNums];
        int index = 0;
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            if (temp == a[i]) {
                result[index] = temp;
            } else {
                index++;
                result[index] = a[i];
                temp = a[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        int[] test3 = new int[]{18};
        int[] test4 = new int[]{};
        int[] test5 = new int[]{-5, -5, -5, -5};
        int[] test6 = new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1};
        int[] test7 = new int[]{8, 8, 6, 6, -2, -2, -2};

        System.out.println(Arrays.toString(clusterCompression(test1)));
        System.out.println(Arrays.toString(clusterCompression(test2)));
        System.out.println(Arrays.toString(clusterCompression(test3)));
        System.out.println(Arrays.toString(clusterCompression(test4)));
        System.out.println(Arrays.toString(clusterCompression(test5)));
        System.out.println(Arrays.toString(clusterCompression(test6)));
        System.out.println(Arrays.toString(clusterCompression(test7)));

    }

}
