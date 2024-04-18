package compro.Sample;

public class Q1103OddHeavy {
    public static int oddHeavy(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int oddCount = 0;
        for (int j : a) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount < 1) {
            return 0;
        }
        if (oddCount == a.length) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        if (max % 2 == 0) {
            return 0;
        }

        return 1;
    }

    public static int oddHeavyAnother(int[] a) {
        if (a.length < 1) {
            return 0;
        }
        int minOdd = Integer.MAX_VALUE;
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (maxEven < a[i]) {
                    maxEven = a[i];
                }
            } else {
                if (minOdd > a[i]) {
                    minOdd = a[i];
                }
            }
        }
        if (maxEven > minOdd || minOdd == Integer.MAX_VALUE) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] base = new int[]{11, 4, 9, 2, 8};
        int[] test1 = new int[]{1};
        int[] test2 = new int[]{2};
        int[] test3 = new int[]{1, 1, 1, 1};
        int[] test4 = new int[]{2, 4, 6, 8, 11};
        int[] test5 = new int[]{-2, -4, -6, -8, -11};
        System.out.println(oddHeavy(base));
        System.out.println(oddHeavy(test1));
        System.out.println(oddHeavy(test2));
        System.out.println(oddHeavy(test3));
        System.out.println(oddHeavy(test4));
        System.out.println(oddHeavy(test5));

        System.out.println("++++++++++++");
        System.out.println(oddHeavyAnother(base));
        System.out.println(oddHeavyAnother(test1));
        System.out.println(oddHeavyAnother(test2));
        System.out.println(oddHeavyAnother(test3));
        System.out.println(oddHeavyAnother(test4));
        System.out.println(oddHeavyAnother(test5));
    }
}
