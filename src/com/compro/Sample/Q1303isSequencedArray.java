package compro.Sample;

public class Q1303isSequencedArray {
    public static int isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || m > n || a[0] != m || a[a.length - 1] != n) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
//            System.out.println(a[i] + " " + a[i + 1]);
            if (a[i] > a[i + 1]) {
                return 0;
            }
            if (a[i] != a[i + 1]) {
                if (a[i] + 1 != a[i + 1]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] base = new int[]{2, 2, 3, 4, 4, 4, 5};
        int[] test1 = new int[]{1, 2, 3, 4, 5};
        int[] test2 = new int[]{1, 3, 4, 2, 5};
        int[] test3 = new int[]{-5, -5, -5, -4, -4, -3, -3, -2, -2};
        int[] test4 = new int[]{0, 1, 2, 3, 4, 5};
        int[] test5 = new int[]{1, 2, 3, 4};
        int[] test6 = new int[]{1, 2, 5};
        int[] test7 = new int[]{5, 4, 3, 2, 1};
        System.out.println(isSequencedArray(base, 2, 5));
        System.out.println(isSequencedArray(test1, 1, 5));
        System.out.println(isSequencedArray(test2, 1, 5));
        System.out.println(isSequencedArray(test3, -5, -2));
        System.out.println(isSequencedArray(test4, 1, 5));
        System.out.println(isSequencedArray(test5, 1, 5));
        System.out.println(isSequencedArray(test6, 1, 5));
        System.out.println(isSequencedArray(test7, 5, 1));
    }
}
