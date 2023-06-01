package JavaSE.Day3TypeArrays;

import java.util.Arrays;

public class TraverseArray {

    public static void main(String[] args) {

        var arr = new int[]{
                1,
                2,
                3
        };
        System.out.println("arr = " + Arrays.toString(arr));

        // MultiDimensional Array or Array of Array
        // Same as "var xi = new int[][]"
        int[][] xi = new int[][]{
                {1, 2, 3, 4, 5, 100, 11},
                {10, 11, 12, 23, 33}
        };

        for (int i = 0; i < xi.length; i++) {
            System.out.println("Outer [" + i + "]: " + i);
            for (int j = 0; j < xi[i].length; j++)
                System.out.println("Inner: [" + i + "] [" + j + "] " + xi[i][j]);

        }

        var xxi = new int[5];
        for (int index : xxi) {
            System.out.println("index = " + index);
        }
    }

}
