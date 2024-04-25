package compro.Sample;

public class Q1803largestDifferenceOfEvens {
    public static int largestDifferenceOfEvens(int[] a) {
        int evenCount = 0;
        int largeEven = Integer.MIN_VALUE;
        int smallEven = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
                if (largeEven < a[i]) {
                    largeEven = a[i];
                }
                if (smallEven > a[i]) {
                    smallEven = a[i];
                }
            }
        }

        if (evenCount < 2) {
            return -1;
        }

        return largeEven - smallEven;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 3, 5, 9};
        int[] test2 = new int[]{1, 18, 5, 7, 33};
        int[] test3 = new int[]{2, 2, 2, 2};
        int[] test4 = new int[]{1, 2, 1, 2, 1, 4, 1, 6, 4};
        System.out.println(largestDifferenceOfEvens(test1));
        System.out.println(largestDifferenceOfEvens(test2));
        System.out.println(largestDifferenceOfEvens(test3));
        System.out.println(largestDifferenceOfEvens(test4));
    }
}
