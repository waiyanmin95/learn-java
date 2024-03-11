package compro.SumSafe;

public class ArraySumSafe {
    public static int isSumSafe(int[] a) {
        if ( a.length == 0 ) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        
        for (int i = 0; i < a.length ; i++) {
            if ( sum == a[i]) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = { 5, -5, 0 };
        int[] test2 = { 5, -2, 1 };
        int[] allzero = { 0, 0, 0 };
        int[] naked = { };
        System.out.println(isSumSafe(test1));
        System.out.println(isSumSafe(test2));
        System.out.println(isSumSafe(allzero));
        System.out.println(isSumSafe(naked));
    }
}
