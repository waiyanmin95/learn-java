package compro.Sample.Set2;

public class Q7003isZeroLimited {
//    public static int isZeroLimited(int[] a) {
//        if (a.length == 0 || (a.length == 1 && a[0] != 0)) {
//            return 1;
//        }
//
//        int zeroCount = 0;
//        for (int i = 1; i < a.length; i += 3) {
//            if (a[i] != 0) {
//                return 0;
//            } else {
//                zeroCount++;
//            }
//        }
//
//        int nonZeroCount = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != 0) {
//                nonZeroCount++;
//            }
//        }
////        System.out.println(zeroCount + " " + nonZeroCount);
//        return a.length == zeroCount + nonZeroCount ? 1 : 0;
//    }

//    static int isZeroLimited(int[] a) {
//        for (int i = 0, k = 1; i < a.length; i++) {
//            if (i == k) {
//                if (a[i] != 0) return 0;
//                k += 3;
//            } else if (a[i] == 0) return 0;
//        }
//        return 1;
//    }

    public static int isZeroLimited(int[] a) {
        for (int i = 0, j = 1; i < a.length; i++) {
            if (i == j) {
                if (a[j] != 0) {
                    return 0;
                }
                j += 3;
            } else if (a[i] == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
//        System.out.println(isZeroLimited(new int[]{1, 0}));
//        System.out.println(isZeroLimited(new int[]{0, 1}));
//        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
//        System.out.println(isZeroLimited(new int[]{}));
    }
}
