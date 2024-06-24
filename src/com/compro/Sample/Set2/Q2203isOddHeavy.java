package compro.Sample.Set2;

public class Q2203isOddHeavy {
    public static int isOddHeavy(int[] a) {
        int oddMin = Integer.MAX_VALUE;
        int evenMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] < oddMin) {
                oddMin = a[i];
            }
            if (a[i] % 2 == 0 && a[i] > evenMax) {
                evenMax = a[i];
            }
        }
//        System.out.println(oddMin + " " + evenMax);
        if (oddMin < evenMax || oddMin == Integer.MAX_VALUE) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }
}
