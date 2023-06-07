package JavaSE.Day6ControlFlow;

public class PrintStar {
    public static void main(String[] args) {
        // * * * * *       j = 5   i = 0   formula 5 - i
        // * * * *         j = 4   i = 1
        // * * *           j = 3   i = 2
        // * *             j = 2   i = 3
        // *               j = 1   i = 4
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *               j = 1   i = 0   formula i + 1
        // * *             j = 2   i = 1
        // * * *           j = 3   i = 2
        // * * * *         j = 4   i = 3
        // * * * * *       j = 5   i = 4
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // * * * * *       z = 5   i = 5  j = 0  formula [ space: i = j ] [ star:
        //   * * * *       z = 4   i = 4  j = 1
        //     * * *       z = 3   i = 3  j = 2
        //       * *       z = 2   i = 2  j = 3
        //         *       z = 1   i = 1  j = 4
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
