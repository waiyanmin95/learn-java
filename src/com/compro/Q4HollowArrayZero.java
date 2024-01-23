package compro;

public class Q4HollowArrayZero {
    public static int isHollow(int[] x) {
        if (x.length < 3 || x[0] == 0 || x[x.length-1] == 0) {
            return 0; // it's not hollow
        }

        int start = 0;
        int end = 0;

        int zeroCount = 0;
        int nonzeroCount = 0;


        for (int j : x) {
            if (j != 0) {
                start++;
            } else break;
        }

        for ( int i = x.length-1; i >= 0; i--) {
            if ( x[i] != 0 ) {
                end++;
            } else {
                break;
            }
        }

        for (int j : x) {
            if (j == 0) {
                zeroCount++;
            } else {
                nonzeroCount++;
            }
        }

        if ( start == end && zeroCount >= 3 && nonzeroCount == (start + end) ) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] test1 = {1,2,3,0,0,0,3,2,1};
        int[] test2 = {1,2,3,0,0,3,2,1};
        int[] test3 = {1,2,3,0,0,0,0,3,2,1};
        int[] test4 = {1,0,3,0,0,0,3,2,1};
        int[] test5 = {1,3,0,0,0,3,2,1};
        int[] test6 = {1,2,3,0,0,0,3,2};
        int[] allzero = {0,0,0,0,0,0,0,0}; // edge case

        System.out.println(isHollow(test1)); // true 1
        System.out.println(isHollow(test2)); // false 0
        System.out.println(isHollow(test3)); // true 1
        System.out.println(isHollow(test4)); // false 0
        System.out.println(isHollow(test5)); // false 0
        System.out.println(isHollow(test6)); // false 0
        System.out.println(isHollow(allzero)); // false 0
    }
}
