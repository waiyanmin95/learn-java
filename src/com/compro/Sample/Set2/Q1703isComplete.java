package compro.Sample.Set2;

public class Q1703isComplete {
    public static int isComplete(int[] a) {
        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
        }
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0 && a[i] < maxEven) {
//                set.add(a[i]);
//            }
//        }
//        System.out.println(set);
//        if ((maxEven / 2) - 1 == set.size()) {
//            return 1;
//        }
//        return 0;
        for (int i = 2; i < maxEven; i += 2) {
            boolean containAllEven = false;
            for (int j : a) {
                if (j == i) {
                    containAllEven = true;
                    break;
                }
            }
            if (!containAllEven) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
    }
}
