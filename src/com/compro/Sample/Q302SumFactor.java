package compro.Sample;

public class Q302SumFactor {
    public static int sumFactor(int[] a) {
        if ( a.length == 0 ) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if ( sum == a[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 3, 4};
        int[] test2 = new int[]{3, 0, 2, -5, 0};
        int[] test3 = new int[]{9, -3, -3, -1, -1};
        int[] test4 = new int[]{1};
        int[] test5 = new int[]{0, 0, 0};
        int[] naked = new int[]{};
        System.out.println(sumFactor(test1));
        System.out.println(sumFactor(test2));
        System.out.println(sumFactor(test3));
        System.out.println(sumFactor(test4));
        System.out.println(sumFactor(test5));
        System.out.println(sumFactor(naked));
    }
}
