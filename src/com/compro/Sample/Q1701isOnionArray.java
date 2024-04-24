package compro.Sample;

public class Q1701isOnionArray {
    public static int isOnionArray(int[] a) {
        int k = a.length - 1;
        for (int j = 0; j < k; j++, k--) {
            if (a[j] + a[k] > 10) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 19, 4, 5};
        int[] test2 = new int[]{1, 2, 3, 4, 15};
        int[] test3 = new int[]{1, 3, 9, 8};
        int[] test4 = new int[]{2};
        int[] test5 = new int[]{};
        int[] test6 = new int[]{-2, 5, 0, 5, 12};
        System.out.println(isOnionArray(test1));
        System.out.println(isOnionArray(test2));
        System.out.println(isOnionArray(test3));
        System.out.println(isOnionArray(test4));
        System.out.println(isOnionArray(test5));
        System.out.println(isOnionArray(test6));
    }
}
