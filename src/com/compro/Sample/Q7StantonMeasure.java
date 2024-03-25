package compro.Sample;

public class Q7StantonMeasure {
    public static int stantonMeasure(int[] a) {
        if ( a.length == 0 ) {
            return 0;
        }
        int oneCount = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == 1 ) {
                oneCount++;
            }
        }
        int otherCount = 0;
        for (int i : a) {
            if (i == oneCount) {
                otherCount++;
            }
        }
        return otherCount;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1};
        int[] test2 = new int[]{0};
        int[] test3 = new int[]{3, 1, 1, 4};
        int[] test4 = new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        int[] naked = new int[]{};
        int[] test5 = new int[]{1, 2, 3};
        System.out.println(stantonMeasure(test1));
        System.out.println(stantonMeasure(test2));
        System.out.println(stantonMeasure(test3));
        System.out.println(stantonMeasure(test4));
        System.out.println(stantonMeasure(test5));
        System.out.println(stantonMeasure(naked));
    }
}
