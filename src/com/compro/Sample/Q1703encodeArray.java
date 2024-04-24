package compro.Sample;

import java.util.Arrays;

public class Q1703encodeArray {
    public static int[] encodeArray(int n) {
        if (n == 0) {
            return new int[]{1};
        }
        boolean isNegative = n < 0;

        int temp = isNegative ? -n : n;
        int size = isNegative ? 1 : 0;
        while (temp != 0) {
            size += (temp % 10) + 1;
            temp = temp / 10;
        }

        System.out.println("Size: " + size);
        int[] result = new int[size];

        temp = isNegative ? -n : n;
        int index = isNegative ? 1 : 0;
        int i = 0;
        if (n < 0) {
            result[0] = -1;
        }
        while (temp > 0) {
            i = temp % 10;
            while (i > 0) {
                result[index] = 0;
                index++;
                i--;
            }

            result[index] = 1;
            index++;
            temp = temp / 10;
        }
        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(encodeArray(0)));
//        System.out.println(Arrays.toString(encodeArray(1)));
//        System.out.println(Arrays.toString(encodeArray(-1)));
//        System.out.println(Arrays.toString(encodeArray(100001)));
        System.out.println(Arrays.toString(encodeArray(999)));
    }
}
