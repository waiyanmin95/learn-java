package compro.Sample.Set2;

public class Q2302isCentered {
    public static int isCentered(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }
        int mid = a[a.length / 2];
        for (int i = 0; i < a.length; i++) {
            if (i != a.length / 2 && a[i] <= mid) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
    }

}
