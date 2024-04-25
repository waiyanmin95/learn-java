package compro.Sample;

public class Q1801isSystematicallyIncreasing {
//    public static int isSystematicallyIncreasing(int[] a) {
//        if (a.length == 0) {
//            return 0;
//        }
//        int newSize = 0;
//        for (int i = 1; i <= a[a.length - 1]; i++) {
//            newSize += i;
//        }
//        System.out.println(newSize);
//        int[] aCopy = new int[newSize];
//
//        int count = 0;
//        int index = 0;
//        for (int i = 1; i <= a[a.length - 1]; i++) {
//            count += i;
//            int k = 1;
//            for (int j = index; j < count; j++) {
//                aCopy[j] = k;
//                k++;
//                index = count;
//            }
//        }
//
//        System.out.println(Arrays.toString(aCopy));
//        if (Arrays.equals(a, aCopy)) {
//            return 1;
//        }
//        return 0;
//    }

    public static int isSystematicallyIncreasing(int[] a) {
        int index = 0;
        int i = 0;
        do {
            for (int j = 1; j < i + 1; j++) {
                if (a[index] != j) {
                    return 0;
                }
                index++;
            }
            i++;
        } while (index < a.length);
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1};
        int[] test2 = new int[]{1, 2, 1, 2, 3};
        int[] test3 = new int[]{1, 1, 3};
        int[] test4 = new int[]{1, 2, 1, 2, 1, 2};
        int[] test5 = new int[]{1, 2, 3, 1, 2, 1};
        int[] test6 = new int[]{1, 1, 2, 3};
        int[] test7 = new int[]{1, 1, 2, 1, 2, 3};
//        System.out.println(isSystematicallyIncreasing(test1));
//        System.out.println(isSystematicallyIncreasing(test2));
//        System.out.println(isSystematicallyIncreasing(test3));
//        System.out.println(isSystematicallyIncreasing(test4));
//        System.out.println(isSystematicallyIncreasing(test5));
//        System.out.println(isSystematicallyIncreasing(test6));
        System.out.println(isSystematicallyIncreasing(test7));
    }
}
