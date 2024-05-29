package compro.Sample.Set2;

public class Q1003isComplete {
    public static int isComplete(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean evenFlag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] < min) {
                min = a[i];
                evenFlag = true;
            }
            if (a[i] % 2 == 0 && a[i] > max) {
                max = a[i];
                evenFlag = true;
            }
        }

        if (!evenFlag || min == max) {
            return 0;
        }

        for (int i = min + 1; i < max; i++) {
            boolean isAllNum = false;
            for (int j : a) {
                if (i == j) {
                    isAllNum = true;
                    break;
                }
            }
            if (!isAllNum) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
    }
}
