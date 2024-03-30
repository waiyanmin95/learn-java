package compro.Sample;

public class Q203GuthrieSequence {
    public static int isGuthrieSequence(int[] a) {
        if ( a.length < 2 || a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length-1; i++) {
            if ( a[i] % 2 == 0 ) {
                if ( a[i] / 2 != a[i+1] ) {
                    return 0;
                }
            } else {
                if ( (a[i] * 3) + 1 != a[i+1] ) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{8, 4, 2, 1};
        int[] test2 = new int[]{8, 17, 2, 1};
        int[] test3 = new int[]{8, 4, 1};
        int[] test4 = new int[]{8, 4, 2};
        int[] test5 = new int[]{8};
        int[] naked = new int[]{};
        System.out.println(isGuthrieSequence(test1));
        System.out.println(isGuthrieSequence(test2));
        System.out.println(isGuthrieSequence(test3));
        System.out.println(isGuthrieSequence(test4));
        System.out.println(isGuthrieSequence(test5));
        System.out.println(isGuthrieSequence(naked));
    }
}
