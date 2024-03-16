package compro.Q30FindTrivalent;

import java.util.HashSet;

public class FindTrivalent {
    public static int isTrivalent(int[] a) {
        if ( a.length < 3 ) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        if ( set.size() != 3 ) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] invalid1 = new int[]{1, 2,};
        int[] test1 = new int[]{1, 2, 3, 4, 8, 1};
        int[] test2 = new int[]{1, 2, 3, 2, 2, 1, 3};
        System.out.println(isTrivalent(test1));
        System.out.println(isTrivalent(invalid1));
        System.out.println(isTrivalent(test2));
    }
}
