package turing.JavaSE.Day6ControlFlow;

import java.util.Scanner;

public class FindElementMD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] xi = {{2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}};

        System.out.print("Enter element to find: ");
        int element = scanner.nextInt();

        boolean found = false;
        int index = 0;

        // Label Loop
        outer:
        for (int i = 0; i < xi.length; i++) {
            for (int j = 0; j < xi[i].length; j++) {
                if (element == xi[i][j]) {
                    found = true;
                    index = i;
                    break outer;
                }
                System.out.println("Inner = " + j);
            }
            System.out.println("Outer = " + i);
        }
        if (found) {
            System.out.println("Found at index " + index);
        }
    }
}
