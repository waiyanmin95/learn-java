package compro.Sample;

public class Q1601isZeroPlentiful {
    public static int isZeroPlentiful(int[] a) {
        if (a.length < 4) {
            return 0;
        }
//        int zeroCount = 0;
//        for (int i : a) {
//            if (i == 0) {
//                zeroCount++;
//            }
//        }
//        if (zeroCount < 1) {
//            return 0;
//        }
//
//        zeroCount = 0;
//        int times = 0;
//        int i = 0;
//        while (i < a.length - 1) {
//            if (a[i] == 0) {
//                zeroCount++;
//                if (zeroCount == 3 && a[i + 1] != 0) {
//                    return 0;
//                }
//                if (zeroCount >= 4) {
//                    zeroCount = 0;
//                    times++;
//                }
//            }
//            i++;
//        }
//        return times;
        int times = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            int zeroCount = 0;
            if (a[i] == 0) {
                j = i;
                while (a[j] == 0 && j < a.length - 1) {
                    zeroCount++;
                    j++;
                }
                i = j;
                if (zeroCount >= 4) {
                    times++;
                } else {
                    return 0;
                }
            }
        }
        return times;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{0, 0, 0, 0, 0};
        int[] test2 = new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12};
        int[] test3 = new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0};
        int[] test4 = new int[]{1, 2, 3, 4, 5};
        int[] test5 = new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0};
        int[] test6 = new int[]{0};
        int[] test7 = new int[]{};
        int[] test8 = new int[]{1, 0, 0, 0, 0, 2, 0, 0, 0};
//        System.out.println(isZeroPlentiful(test1));
//        System.out.println(isZeroPlentiful(test2));
//        System.out.println(isZeroPlentiful(test3));
//        System.out.println(isZeroPlentiful(test4));
//        System.out.println(isZeroPlentiful(test5));
//        System.out.println(isZeroPlentiful(test6));
//        System.out.println(isZeroPlentiful(test7));
        System.out.println(isZeroPlentiful(test8));
    }
}
