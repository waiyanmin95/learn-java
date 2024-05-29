package compro.Sample.Set2;

public class Q1103isCentered {
    public static int isCentered(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }

        int mid = a.length / 2;
        if (a[mid] % 2 == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
//            System.out.println(i + " " + a[i]);
            if (i != mid && a[i] <= a[mid]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
    }
}
