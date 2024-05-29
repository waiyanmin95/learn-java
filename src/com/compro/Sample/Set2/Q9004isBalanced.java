package compro.Sample.Set2;

import java.util.Arrays;
import java.util.HashSet;

public class Q9004isBalanced {
    public static int isBalanced(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int sum = 0;
        for (Integer i : set) {
            sum += i;
        }
        System.out.println(Arrays.toString(set.toArray()));
        if (sum == 0) {
            return 1;
        }
        return 0;
    }

    public static int isBalancedNew(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                sum += a[i];
            }
        }
        if (sum == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2, -3, 3, 4, -4, 5, -5, 5}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));
        System.out.println("================");
        System.out.println(isBalancedNew(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalancedNew(new int[]{-2, 2, 2, 2, -3, 3, 4, -4, 5, -5, 5}));
        System.out.println(isBalancedNew(new int[]{-5, 2, -2}));


    }
}
