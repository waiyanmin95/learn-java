package compro.Sample;

public class Q1102isPacked {
    public static int isPacked(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i = j) {
            int count = 0;

            if (a[i] <= 0) {
                return 0;
            }

            for (j = i; j < i + a[i]; j++) {
                if (a[i] != a[j]) {
                    return 0;
                }
            }

            for (int index : a) {
                if (index == a[i])
                    count++;
            }
            if (count > a[i])
                return 0;
        }
        return 1;
    }


    public static void main(String[] args) {
        int[] test1 = new int[]{2, 2, 1};
        int[] test2 = new int[]{2, 2, 1, 2, 2};
        int[] test3 = new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3};
        int[] test4 = new int[]{7, 7, 7, 7, 7, 7, 7, 1};
        int[] test5 = new int[]{7, 7, 7, 7, 1, 7, 7, 1};
        int[] test6 = new int[]{7, 7, 7, 7, 7, 7, 7, 7};
        int[] test7 = new int[]{};
        int[] test8 = new int[]{1, 2, 1};
        int[] test9 = new int[]{2, 1, 1};
        int[] test10 = new int[]{-3, -3, -3};
        System.out.println("=====TRUE=======");
        System.out.println(isPacked(test1));
//        System.out.println(isPacked(test3));
//        System.out.println(isPacked(test4));
//        System.out.println(isPacked(test7));

        System.out.println("=====FALSE=======");
//        System.out.println(isPacked(test2));
//        System.out.println(isPacked(test5));
//        System.out.println(isPacked(test8));
//        System.out.println(isPacked(test9));
//        System.out.println(isPacked(test10));
//        System.out.println(isPacked(test6));
    }
}