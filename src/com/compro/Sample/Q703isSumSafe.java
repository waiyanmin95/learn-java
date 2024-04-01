package compro.Sample;

public class Q703isSumSafe {
    public static int isSumSafe(int[] a) {
        if ( a.length < 2 ) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            if ( sum == a[i] ) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{ 5, -5, 0 };
        int[] test2 = new int[]{ 5, -2, 1 };
        int[] one = new int[]{ 5 };
        int[] allzero = { 0, 0, 0 };
        int[] naked = { };
        System.out.println(isSumSafe(test1));
        System.out.println(isSumSafe(test2));
        System.out.println(isSumSafe(one));
        System.out.println(isSumSafe(allzero));
        System.out.println(isSumSafe(naked));
    }
}
