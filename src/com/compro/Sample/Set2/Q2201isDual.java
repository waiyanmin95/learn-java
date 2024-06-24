package compro.Sample.Set2;

public class Q2201isDual {
    public static int isDual(int[] a) {
        if (a.length % 2 != 0 || a.length < 2) {
            return 0;
        }
        for (int i : a) {
            int count = 0;
            for (int j : a) {
//                System.out.println("I: " + i + " J: " + j);
                if (i == j) {
                    count++;
                }
            }
//            System.out.println("Count: " + count);
            if (count != 2) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(isDual(new int[]{2, 5, 2, 5, 5}));
        System.out.println(isDual(new int[]{3, 1, 1, 2, 2}));
        System.out.println(isDual(new int[]{3, 1, 1}));
    }
}
