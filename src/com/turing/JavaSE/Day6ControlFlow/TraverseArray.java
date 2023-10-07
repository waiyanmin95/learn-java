package JavaSE.Day6ControlFlow;

public class TraverseArray {
    public static void main(String[] args) {
        int[] xi = {10, 20, 30, 40, 50};

        for (int i = 0; i < xi.length; i++) {
            System.out.println("Index " + i + " Value: " + xi[i]);
            xi[i] *= 2;
        }

        // ReadOnly
        // The value of the variable in the for-each loop is a copy of the values you are iterating on.
        for (final int element : xi) {
            System.out.println("element = " + element);
            // element *= 2; // useless
        }
        System.out.println("xi[0] = " + xi[0]);


        // MultiDimension
        int[][] multi = {{2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}};

        for (int[] i : multi) {
            for (int j : i) {
                System.out.println("j = " + j);
            }
        }
    }
}
