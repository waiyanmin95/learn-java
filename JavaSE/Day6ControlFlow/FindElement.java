package JavaSE.Day6ControlFlow;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xi = {10, 20, 30, 40, 50};

        System.out.println("Enter element to find: ");
        int element = scanner.nextInt();

        boolean found = false;
        int index = 0;

        for (int i = 0; i < xi.length; i++) {
            if (element == xi[i]) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Element found at index: " + index);
        }
    }
}
