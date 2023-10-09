package turing.JavaSE.Day5Operators;

import java.util.Scanner;

public class ElseIfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = scanner.nextInt();

        // Full Scenario // Linear Flow
        if (mark > 100) {
            System.out.println("Mark should be 0-100");
        } else if (mark <= 100 && mark >= 80) {
            System.out.println("Passed with Distinction");
        } else {
            if (mark < 80 && mark >= 40) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }
    }
}
