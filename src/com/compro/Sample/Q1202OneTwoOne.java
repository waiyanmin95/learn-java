package compro.Sample;

public class Q1202OneTwoOne {
    public static int OneTwoOne(int[] a) {
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                oneCount++;
            }
            if (a[i] == 2) {
                twoCount++;
            }
        }
        if (oneCount < 1 || twoCount < 1) {
            return 0;
        }

        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2) {
                    return 0;
                }
            }
            if (a[a.length / 2] != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 1};
        int[] test2 = {1, 2, 2, 2, 1};
        int[] test3 = {1, 1, 2, 2, 2, 1, 1};
        int[] test4 = {1, 1, 2, 2, 2, 1, 1, 1};
        int[] test5 = {1, 1, 2, 1, 2, 1, 1};
        int[] test6 = {1, 1, 1, 2, 2, 2, 1, 1, 1, 3};
        int[] test7 = {1, 1, 1, 1, 1, 1, 1};
        int[] test8 = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
        int[] test9 = {1, 1, 1, 2, 2, 2, 1, 1, 2, 2};
        int[] test10 = {2, 2, 2};
        int[] test11 = {1, 3, 3, 1};
        System.out.println(OneTwoOne(test1));
        System.out.println(OneTwoOne(test2));
        System.out.println(OneTwoOne(test3));
        System.out.println(OneTwoOne(test4));
        System.out.println(OneTwoOne(test5));
        System.out.println(OneTwoOne(test6));
        System.out.println(OneTwoOne(test7));
        System.out.println(OneTwoOne(test8));
        System.out.println(OneTwoOne(test9));
        System.out.println(OneTwoOne(test10));
        System.out.println(OneTwoOne(test11));
    }
}
