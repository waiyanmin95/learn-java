package compro.Sample.Set2;

public class Q1102isBalanced {
    public static int isBalanced(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0 && a[i] % 2 == 0) {
                return 0;
            }
            if (i % 2 == 0 && a[i] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{0, 1, 2, 3, 4, 5, 6, 7}));
        System.out.println(isBalanced(new int[]{0, 0, 0, 0}));
        System.out.println(isBalanced(new int[]{2, 3, 6, 7}));
        System.out.println(isBalanced(new int[]{6, 7, 2, 3, 12}));
        System.out.println(isBalanced(new int[]{7, 15, 2, 3}));
        System.out.println(isBalanced(new int[]{16, 6, 2, 3}));
    }
}
