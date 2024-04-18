package compro.Q31SequentiallyBounded;

public class SequentiallyBounded {
    public static int isSequentiallyBounded(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                return 0;
            }
            min = a[i];
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count >= a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        int[] test1 = new int[]{2, 3, 3, 99, 99, 99, 99, 99};
//        int[] test2 = new int[]{2, 3, 3, 3, 99, 99, 99, 99, 99};

        int[] test1 = new int[]{0, 1};
        int[] test2 = new int[]{-1, 2};
        int[] test3 = new int[]{};
        int[] test4 = new int[]{5, 5, 5, 5};
        int[] test5 = new int[]{5, 5, 5, 5, 2};
        int[] base = new int[]{2, 3, 3, 99, 99, 99, 99, 99};

        System.out.println(isSequentiallyBounded(test1));
        System.out.println(isSequentiallyBounded(test2));
        System.out.println(isSequentiallyBounded(test3));
        System.out.println(isSequentiallyBounded(test4));
        System.out.println(isSequentiallyBounded(test5));
        System.out.println(isSequentiallyBounded(base));
    }
}
