package compro.Sample;

import java.util.ArrayList;

public class Q103isInertial {
    public static int isInertial(int[] a) {
        if ( a.length == 0 ) {
            return 0;
        }

        int maxValue = 0;
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int k : a) {
            if (k % 2 == 0) {
                evenList.add(k);
                if (maxValue < k) {
                    maxValue = k;
                }
            } else {
                oddList.add(k);
            }
        }
        if (oddList.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < oddList.size(); i++) {
            for (int j = 0; j < evenList.size(); j++) {
                if ((oddList.get(i) < evenList.get(j) && evenList.get(j) != maxValue) || (oddList.get(i) > maxValue )) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1};
        int[] test2 = new int[]{2};
        int[] test3 = new int[]{1, 2, 3, 4};
        int[] test4 = new int[]{1, 1, 1, 1, 1, 1, 2};
        int[] test5 = new int[]{2, 12, 4, 6, 8, 11};
        int[] test6 = new int[]{2, 12, 12, 4, 6, 8, 11};
        int[] test7 = new int[]{-2, -4, -6, -8, -11};
        int[] test8 = new int[]{2, 3, 5, 7};
        int[] test9 = new int[]{2, 4, 6, 8, 10};
        System.out.println(isInertial(test1));
        System.out.println(isInertial(test2));
        System.out.println(isInertial(test3));
        System.out.println(isInertial(test4));
        System.out.println(isInertial(test5));
        System.out.println(isInertial(test6));
        System.out.println(isInertial(test7));
        System.out.println(isInertial(test8));
        System.out.println(isInertial(test9));
    }
}
