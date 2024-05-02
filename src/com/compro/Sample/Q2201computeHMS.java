package compro.Sample;

import java.util.Arrays;

public class Q2201computeHMS {
    public static int[] computeHMS(int n) {
        if (n < 0) {
            return null;
        }
        if (n == 0) {
            return new int[3];
        }

        int[] result = new int[3];
        int temp = 0;
        temp = n / 3600;
        result[0] = temp;
//        System.out.println(temp);
        temp = n % 3600 / 60;
        result[1] = temp;
//        System.out.println(temp);
        temp = n % 3600 % 60;
        result[2] = temp;
//        System.out.println(temp);


        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
        System.out.println(Arrays.toString(computeHMS(4999271)));
    }
}
