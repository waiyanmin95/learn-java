package compro.Sample;

public class Q903isMinMaxDisjoint {
    public static int isMinMaxDisjoint(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        int min = a[0];
        int max = a[0];
        int minIndex = 0;
        int maxIndex = 0;
        int minCount = 0;
        int maxCount = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (min == a[i]) {
                minCount++;
            }
            if (max == a[i]) {
                maxCount++;
            }
        }

        if (min == max || minIndex + 1 == maxIndex || minIndex - 1 == maxIndex || maxCount != 1 | minCount != 1) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{5, 4, 1, 3, 2};
        int[] test2 = new int[]{18, -1, 3, 4, 0};
        int[] test3 = new int[]{9, 0, 5, 9};
        int[] test4 = new int[]{0, 5, 18, 0, 9};
        int[] test5 = new int[]{7, 7, 7, 7};
        int[] test6 = new int[]{};
        int[] test7 = new int[]{1, 2};
        int[] minmax = new int[]{1, 1, 0, 1, 1, 6};
        System.out.println(isMinMaxDisjoint(test1));
        System.out.println(isMinMaxDisjoint(test2));
        System.out.println(isMinMaxDisjoint(test3));
        System.out.println(isMinMaxDisjoint(test4));
        System.out.println(isMinMaxDisjoint(test5));
        System.out.println(isMinMaxDisjoint(test6));
        System.out.println(isMinMaxDisjoint(test7));
        System.out.println(isMinMaxDisjoint(minmax));
    }
}
