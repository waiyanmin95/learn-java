package compro.Sample;

public class Q2002isOneBalanced {
    public static int isOneBalanced(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        int count = 0;

        boolean onestart = false;
        boolean oneend = false;


        for (int j = 0; j < a.length; j++) {
            if (a[j] == 1) {
                if (oneend) {
                    onestart = true;
                }
                count++;
            } else {
                if (onestart) {
                    return 0;
                }
                oneend = true;
                count--;
            }
        }

        if (count == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] test1 = new int[]{1, 1, 1, 2, 3, -18, 45, 1};
        int[] test2 = new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0};
        int[] test3 = new int[]{1, 1, 2, 3, 1, -18, 45, 1};
        int[] test4 = new int[]{};
        int[] test5 = new int[]{3, 4, 1, 1};
        int[] test6 = new int[]{1, 1, 3, 4};
        int[] test7 = new int[]{3, 3, 3, 3, 3, 3};
        int[] test8 = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(isOneBalanced(test1));
        System.out.println(isOneBalanced(test2));
        System.out.println(isOneBalanced(test3));
        System.out.println(isOneBalanced(test4));
        System.out.println(isOneBalanced(test5));
        System.out.println(isOneBalanced(test6));
        System.out.println(isOneBalanced(test7));
        System.out.println(isOneBalanced(test8));
    }
}
