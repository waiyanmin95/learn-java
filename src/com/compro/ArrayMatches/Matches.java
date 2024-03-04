package compro.ArrayMatches;

public class Matches {
    public  static int matches(int[] a, int[] p) {
        int len = 0;

        for (int i = 0; i < p.length; i++) {
            len += Math.abs(p[i]);
        }

        if ( len != a.length ) {
            return 0;
        }

        int index = 0;
        for (int i = 0; i < p.length; i++) {
            if ( p[i] > 0 ) {
                for (int j = 0; j < p[i]; j++) {
                    if ( a[j+index] < 0 ) {
                        return 0;
                    }
                }
                index += p[i];
            } else {
                for (int k = 0; k < Math.abs(p[i]); k++) {
                    if ( a[k+index] > 0 ) {
                        return 0;
                    }
                }
                index += Math.abs(p[i]);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] P0 = {3, -2, 3};
        int[] P1 = {2, 1, -1, -1, 2, 1};
        int[] P2 = {1, 2, -1, -1, 1, 2};
        int[] P3 =  {2, 1, -2, 3};
        int[] P4 =  {1, 1, 1, -1, -1, 1, 1, 1};

        int[] P5 =  {4, -1, 3};
        int[] P6 =  {2, -3, 3};
        // true cases
        System.out.println(matches(A, P0));
        System.out.println(matches(A, P1));
        System.out.println(matches(A, P2));
        System.out.println(matches(A, P3));
        System.out.println(matches(A, P4));

        // false cases
        System.out.println(matches(A, P5));
        System.out.println(matches(A, P6));
    }
}
