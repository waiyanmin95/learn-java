package compro.Sample;

public class Q502isDivisible {
    public static int isDivisible(int[] a, int divisor) {
        if ( a.length < 1 ) {
            return 1;
        }

        for (int k: a) {
            if ( k % divisor != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{4}, 2));
        System.out.println(isDivisible(new int[]{3, 4, 3, 6 ,36}, 3));
        System.out.println(isDivisible(new int[]{6, 12, 24, 36}, 12));
        System.out.println(isDivisible(new int[]{}, 12));
        System.out.println(isDivisible(new int[]{0, 0, 0, 0}, 12));
    }
}
