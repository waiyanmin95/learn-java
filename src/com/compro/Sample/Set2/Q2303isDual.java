package compro.Sample.Set2;

public class Q2303isDual {
    public static int isDual(int[] a) {
        if (a.length % 2 != 0) {
            return 0;
        }
        int preSum = 0;
        for (int i = 0; i < a.length; i += 2) {
//            System.out.println(i + " " + (i + 1) + " " + preSum);
            if (i != 0 && preSum != a[i] + a[i + 1]) {
                return 0;
            }
            preSum = a[i] + a[i + 1];
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 3, 0}));
        System.out.println(isDual(new int[]{1, 2, 2, 1, 3, 0}));
        System.out.println(isDual(new int[]{1, 1, 2, 2}));
        System.out.println(isDual(new int[]{1, 2, 1}));
        System.out.println(isDual(new int[]{}));
    }
}
