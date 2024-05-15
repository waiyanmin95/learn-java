package compro.Sample.Set2;

public class Q7001isZeroBalanced {
    public static int isZeroBalanced(int[] a) {
        if (a.length < 2) {
            return 0;
        }

        int count = 0;
        int zeroCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if ((a[i] != 0 || a[j] != 0) && a[i] + a[j] == 0) {
                    count++;
                }
            }
            if (a[i] == 0) {
                zeroCount++;
            }
        }
//        System.out.println(zeroCount);
        if ((count == a.length / 2) || zeroCount == a.length) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, 3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -3, -4, 0, 2, -2}));
    }
}
