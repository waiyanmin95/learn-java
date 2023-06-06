package JavaSE.Day6ControlFlow;

import java.util.Scanner;

public class WhileConditionControl {
    public static void main(String[] args) {
        int[] xi = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements to find: ");
        int element = scanner.nextInt();

        boolean found = false;
        int index = 0;

        // Condition Control
        // true && index less than array length
        while (!found && index < xi.length) {
            if (xi[index] == element) {
                found = true;
                System.out.println("Element found at index: " + index);
            }
            index++;
        }
        if (found == !true) {
            System.out.println("Element not found.");
        }
    }
}
