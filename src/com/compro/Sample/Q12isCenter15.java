package compro.Sample;

public class Q12isCenter15 {
    public static int isCenter15(int[] a) {
        if ( a.length < 3 ) {
            return 0;
        }

        int mid = a.length/2;
        for (int i = 1; i <= (a.length / 2); i++) {
            int sum = 0;
            for (int j = i; j < (a.length - i ) ; j++) {
                sum += a[j];
            }
            if ( sum == 15 ) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 2, 10, 4, 1, 6, 9};
        int[] test2 = new int[]{2, 10, 4, 1, 6, 9};
        int[] test3 = new int[]{3, 2, 10, 4, 1, 6};
        int[] test4 = new int[]{1, 1, 8, 3, 1, 1};
        int[] test5 = new int[]{9, 15, 6};
        int[] test6 = new int[]{1, 1, 2, 2, 1, 1};
        int[] test7 = new int[]{1, 1, 15 -1, -1};
        int[] edge = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};
        System.out.println(isCenter15(test1));
        System.out.println(isCenter15(test2));
        System.out.println(isCenter15(test3));
        System.out.println(isCenter15(test4));
        System.out.println(isCenter15(test5));
        System.out.println(isCenter15(test6));
        System.out.println(isCenter15(test7));
        System.out.println(isCenter15(edge));
    }
}
