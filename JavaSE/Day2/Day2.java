package JavaSE.Day2;

import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) {
        int[] xi = new int[7];

        // Printout with Strings
        System.out.println("XI = " + Arrays.toString(xi));
        System.out.println("XI = " + Arrays.toString(xi).length());

        int[][] mxi = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println("MXI 0:2 = " + mxi[0][2]);
        System.out.println("MXI 1:1 = " + mxi[1][1]);


        String[][] sxi = new String[][]{
                {"a", "b", "c"},
                {"d", "e", "f"}
        };

        System.out.println("SXI 0:1 = " + sxi[0][1]);
    }

}
