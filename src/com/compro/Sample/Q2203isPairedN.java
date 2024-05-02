package compro.Sample;

public class Q2203isPairedN {
    public static int isPairedN(int[] a, int n) {
        if (a.length < 2 || n < 0) {
            return 0;
        }

        int valueSum = 0;
        int indexSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] + a[j] == n && i + j == n) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 5));
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));
        System.out.println(isPairedN(new int[]{3}, 3));
        System.out.println(isPairedN(new int[]{0}, 0));
    }
}
