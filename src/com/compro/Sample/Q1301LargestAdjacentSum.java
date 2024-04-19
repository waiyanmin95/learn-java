package compro.Sample;

public class Q1301LargestAdjacentSum {
    public static int largetAdjacentSum(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int preSum = 0;
        int sum = 0;
        int j = 0;
        for (int i = 1; i < a.length; i++, j++) {
            preSum = a[j] + a[i];
            if (preSum > sum) {
                sum = preSum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{18, -12, 9, -10};
        int[] test3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] test4 = new int[]{1, 1, 1, 1, 1, 2, 1, 1, 1};
        System.out.println(largetAdjacentSum(test1));
        System.out.println(largetAdjacentSum(test2));
        System.out.println(largetAdjacentSum(test3));
        System.out.println(largetAdjacentSum(test4));
    }
}
