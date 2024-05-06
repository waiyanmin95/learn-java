package compro.Sample.Set2;

public class Q2003loopSum {
    public static int loopSum(int[] a, int n) {
        if (a.length < 1 || n <= 0) {
            return 0;
        }
        int sum = 0;
        int index = 0;
        while (index <= n) {
            for (int i = 0; i < a.length; i++) {
                if (index < n) {
                    sum += a[i];
                }
                index++;
            }
        }

        return sum;
    }

    public static int loopSumAlter(int[] a, int n) {
        if (a.length < 1 || n <= 0) {
            return 0;
        }

        int sum = 0;

        while (n > 0) {
            for (int i = 0; i < a.length && n > 0; i++, n--) {
                sum += a[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(loopSum(new int[]{1, 2, 3}, 2));
//        System.out.println(loopSum(new int[]{-1, 2, -1}, 7));
//        System.out.println(loopSum(new int[]{1, 4, 5, 6}, 4));
//        System.out.println(loopSum(new int[]{3}, 10));
        System.out.println(loopSumAlter(new int[]{3}, 10));
    }
}
