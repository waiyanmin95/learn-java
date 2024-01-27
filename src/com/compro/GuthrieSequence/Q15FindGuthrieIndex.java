package compro.GuthrieSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15FindGuthrieIndex {
    public static int findGuthrineSequence(int n) {
        if ( n < 0 ) {
            return 0;
        }
        List<Integer> check = new ArrayList<>();
        int temp = n;
        while (temp != 1) {
            if ( temp % 2 == 0) {
                temp = temp / 2;
                check.add(temp);
            } else {
                temp = ( temp * 3) + 1;
                check.add(temp);
            }
        }
        System.out.println(Arrays.toString(check.toArray()));
        System.out.println("N Value: "+n);
        return check.size();
    }

    public static void main(String[] args) {
        System.out.println("Result: "+findGuthrineSequence(7));
        System.out.println("Result: "+findGuthrineSequence(5));
    }
}
