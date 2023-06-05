package JavaSE.Day5Operators;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mark: ");
        int mark = scanner.nextInt();

        // Expression must be boolean
        if (mark >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("No Pass");
        }
        System.out.println("After first if statement");

        boolean isRaining = false;
        if (isRaining) {
            System.out.println("Take Umbrella");
        } else {
            System.out.println("It's not raining");
        }
    }
}
