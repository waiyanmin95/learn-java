package compro.Sample;

public class Q901isSequentiallyBounded {
    public static int isSequentiallyBounded(int[] a) {
        if ( a.length == 1 && a[0] <= 1 ) {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            int first = a[i-1];
            int next = a[i];
            if ( first < 2 || next < 2 ) {
                return 0;
            }
            if ( first > next ) {
//                System.out.println("SO BIG");
//                System.out.println("FIRST: "+first+ " NEXT: "+next);
                return 0;
            }
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if ( a[j] == next  ) {
                    count++;
//                    System.out.println("====");
//                    System.out.println("AJ: "+a[j]+ " COUNT: "+count);
                } else {
                    count = 0;
                }
                if ( count >= a[j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{0, 1};
        int[] test2 = new int[]{-1, 2};
        int[] test3 = new int[]{};
        int[] test4 = new int[]{5, 5, 5, 5};
        int[] test5 = new int[]{5, 5, 5, 5, 2};

        int[] base = new int[]{2, 3, 3, 99, 99, 99, 99, 99};
//        System.out.println(isSequentiallyBounded(base));
//        System.out.println(isSequentiallyBounded(test1));
//        System.out.println(isSequentiallyBounded(test2));
//        System.out.println(isSequentiallyBounded(test3));
//        System.out.println(isSequentiallyBounded(test4));
//        System.out.println(isSequentiallyBounded(test5));

        System.out.println(isSequentiallyBounded(new int[]{0, 1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{-1, 2})); // 0
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5})); // 0
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5, 5})); // 0
        System.out.println(isSequentiallyBounded(new int[]{1, 2, 3})); // 0
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3})); // 0
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3, 1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{1})); // 0
        System.out.println(isSequentiallyBounded(new int[]{})); // 1
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5})); // 1
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99})); // 1
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3})); // 1
    }
}
