package compro.GuthrieSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12Guthrie {
    public static int isGuthrieSequence(int[] n) {
        List<Integer> check = new ArrayList<>();
        check.add(n[0]);
        for (int i = 0; i < n.length-1; i++) {
            if ( n[i] % 2 == 0 ) {
                check.add(n[i] / 2);
            } else {
                check.add((n[i] * 3) + 1);
            }
        }
        System.out.println(Arrays.toString(check.toArray())); // debug
        // check the elements of two arrays
        for (int i = 0; i < check.size(); i++) {
            if ( n[i] != check.get(i)) {
                return 0;
            }
        }
        return 1;
    }

    // God Code
    public static int isGuthrieSequenceGod(int[] a) {
        for (int i=0 ; i < a.length - 1; i++) {
            int current = a[i];
            int next = a[i+1];
            if(current % 2 == 0) {
                // even
                if(next != current/2) {
                    return 0;
                }
            }
            else {
                // odd
                if(next != (current*3) + 1) {
                    return 0;
                }
            }
        }

        // last number must 1
        if(a[a.length -1] != 1) {
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] test1 = {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
        System.out.println("Self: "+isGuthrieSequence(test1));
        System.out.println("God Code: "+isGuthrieSequenceGod(test1));
    }
}
