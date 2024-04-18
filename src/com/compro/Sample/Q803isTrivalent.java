package compro.Sample;

import java.util.HashSet;

public class Q803isTrivalent {
    public static int isTrivalent(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        if (set.size() == 3) {
            return 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] edge = new int[]{1, 2};
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{-1, 0, 1, 0, 0, 0};
        int[] test3 = new int[]{};
        int[] test4 = new int[]{2147483647, -1, -1, -2147483648};
        System.out.println(isTrivalent(edge));
        System.out.println(isTrivalent(test1));
        System.out.println(isTrivalent(test2));
        System.out.println(isTrivalent(test3));
        System.out.println(isTrivalent(test4));
    }
}
