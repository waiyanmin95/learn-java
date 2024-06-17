package compro.Sample.Set2;

public class Q1803isTriple {
    public static int isTriple(int[] a) {
        if (a.length % 3 != 0) {
            return 0;
        }
        int i = 1;
        int counter = 0;

        int max = Integer.MIN_VALUE;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }
        }

        while (i <= max) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    counter++;
                }
            }
            i++;
        }
        if (counter == a.length) {
            return 1;
        }
        return 0;
    }

    public static int isTripleNew(int[] a) {
        for (int a1 : a) {
            int count = 0;
            for (int a2 : a) {
                if (a1 == a2) {
                    count++;
                }
            }
            if (count != 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
//        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
//        System.out.println(isTriple(new int[]{3, 1, 1, 1}));

        System.out.println(isTripleNew(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTripleNew(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTripleNew(new int[]{3, 1, 1, 1}));
    }
}
