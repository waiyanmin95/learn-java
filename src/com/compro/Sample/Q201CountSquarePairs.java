package compro.Sample;

public class Q201CountSquarePairs {
    public static int isPerfectSquare(int n) {
        if (n <= 0) {
            return 0;
        }
        int current = 1;
        while (current * current < n) {
            current++;
        }
        if (current * current != n) {
            return 0;
        }
        return 1;
    }

    public static int countSquarePairs(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    if (a[i] > 0 && a[j] > 0) {
                        System.out.println("AI: " + a[i] + " " + "AJ: " + a[j]);
                        if (1 == isPerfectSquare(a[i] + a[j])) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{9, 0, 2, -5, 7};
        int[] test2 = new int[]{9};
        int[] allzero = {0, 0, 0, 0};
        int[] twoelement = {4, 5};
        System.out.println(countSquarePairs(test1));
        System.out.println(countSquarePairs(test2));
        System.out.println(countSquarePairs(allzero));
        System.out.println(countSquarePairs(twoelement));
    }
}
