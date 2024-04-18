package compro.Q32MinMaxDisjoint;

public class MinMaxDisjoint {
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
        for (int i = 0; i < a.length; i++) {
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

//        System.out.println("min index: "+minIndex);
//        System.out.println("min value: "+min);
//
//        System.out.println("max index: "+maxIndex);
//        System.out.println("max value: "+max);
//        System.out.println(minCount);
//        System.out.println(maxCount);
        if (minCount == 1 && maxCount == 1 && ((minIndex + 1) != maxIndex) && (minIndex - 1) != maxIndex) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{6, 5, 4, 1, 3, 2};
        int[] test2 = new int[]{6, 5, 4, 1, 3, 2, 6, 4, 1};
        int[] one = new int[]{6};
        int[] naked = new int[]{};
        int[] allone = new int[]{1, 1, 1, 1, 1, 1};
        int[] minmax = new int[]{1, 1, 0, 1, 1, 6};
        System.out.println(isMinMaxDisjoint(test1));
        System.out.println(isMinMaxDisjoint(one));
        System.out.println(isMinMaxDisjoint(test2));
        System.out.println(isMinMaxDisjoint(naked));
        System.out.println(isMinMaxDisjoint(allone));
        System.out.println(isMinMaxDisjoint(minmax));
    }
}
