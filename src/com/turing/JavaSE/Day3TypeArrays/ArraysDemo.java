package turing.JavaSE.Day3TypeArrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // Array Lower Bound = 0 , Upper Bound = (length - 1)
        int[] xi = {1, 2, 3};
        System.out.println(xi[1]);
        System.out.println(xi[xi.length - 1]);
        System.out.println(xi.length);

        // Array Allocation 10 elements // Store sequence in memory
        int[] xxi = new int[10];
        System.out.println("xxi.length = " + xxi.length);
        System.out.println("Arrays = " + java.util.Arrays.toString(xxi));

        xi[0] = 22;
        xi[1] = 24;
        for (int i : xi) {
            System.out.printf("Index values: %s\n", i);
        }
    }
}
