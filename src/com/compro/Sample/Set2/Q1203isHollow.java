package compro.Sample.Set2;

public class Q1203isHollow {
//    public static int isHollow(int[] a) {
//        if (a.length < 5) {
//            return 0;
//        }
//        int start = 0;
//        int end = 0;
//        int zeroCount = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                start = i;
//                int j = i;
//                while (a[j] == 0) {
//                    zeroCount++;
//                    j++;
//                    if (j == a.length) {
//                        break;
//                    }
//                }
//                i = j;
//                end = j;
//            }
//        }
//
//        if (a.length - end == start && zeroCount >= 3) {
//            return 1;
//        }
//        return 0;
//    }

    public static int isHollow(int[] a) {
        if (a.length < 5 || a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }
        int mid = a.length / 2;
        if (a[mid] != 0 || a[mid - 1] != 0 || a[mid + 1] != 0) {
            return 0;
        }
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == 0 && a[i + 1] != 0) {
                return 0;
            }
            if (a[i] == 0 && a[a.length - 1 - i] != a[i] || a[a.length - 1 - i] != a[i] && a[a.length - 1 - i] == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 6, 0, 0, 0, 8, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0, 0, 0}));
    }
}
