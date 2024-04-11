package compro.Sample;

public class Q1003isRailroadTie {
    public static int isRailroadTie(int[] a) {
        if ( a.length == 0 || a[0] == 0 || a[a.length-1] == 0 ) {
            return 0;
        }

        if ( ( a.length - 5 ) % 3 != 0 ) {
            return 0;
        }

        int nonZeroCount = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] != 0 ) {
                nonZeroCount++;
            }
        }
        if ( nonZeroCount < 1 ) {
            return 0;
        }

        // zeroIndex Pattern 2+=3
        // consider i as the zeroIndex
        for (int i = 2; i < a.length ; i+=3) {
            if ( a[i-1] == 0 || a[i-2] == 0 || a[i+1] == 0 || a[i+2] == 0 || a[i] != 0 ) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] naked = new int[]{};
        int[] edge = new int[]{1, 2, 0, 4, 5, 0, 7};
        int[] test1 = new int[]{1, 2, 0, 2, 1};
        int[] test2 = new int[]{1, 2, 0, 1, 2, 0, 1, 2};
        int[] test3 = new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3};
        int[] test4 = new int[]{0, 0, 0, 0};
        int[] test5 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test6 = new int[]{1, 3, 0, 3, 5, 0};
        int[] test7 = new int[]{1, 2, 0, 3, -18, 0, 2, 2};
        System.out.println(isRailroadTie(naked));
        System.out.println(isRailroadTie(edge));
        System.out.println(isRailroadTie(test1));
        System.out.println(isRailroadTie(test2));
        System.out.println(isRailroadTie(test3));
        System.out.println(isRailroadTie(test4));
        System.out.println(isRailroadTie(test5));
        System.out.println(isRailroadTie(test6));
        System.out.println(isRailroadTie(test7));

    }
}
