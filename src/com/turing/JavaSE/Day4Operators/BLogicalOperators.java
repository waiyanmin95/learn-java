package turing.JavaSE.Day4Operators;

import java.util.Scanner;

public class BLogicalOperators {
    public static void main(String[] args) {
        // Scanner Object create > Get the input from the console > assign the input to a varriable
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Age = " + age);

        //  Result Type == Operand Left Type , Operand Right Type
        boolean validAge = age > 0 && age <= 120;
        System.out.println("Is valid age ?: " + validAge);

        boolean flag = true;
        System.out.println("NOT Flag = " + !flag);
    }
}
