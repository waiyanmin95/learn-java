package turing.JavaSE.Day5Operators;

public class PrecedenceAssociativity {
    public static void main(String[] args) {
        // Reference: https://www.javatpoint.com/java-operator-precedence
        // Precedence == Priority in importance, order, or rank.
        // Raw Expression
        // Sort by Precedence
        // / *
        // +
        double result = 10 + 20 / 2 * 4;
        System.out.println("( result = 10 + 20 / 2 * 4; )");
        System.out.println("Result Left to Right = " + result);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        // Associativity
        // Operation => Left to Right
        // Assignment => Right to Left
        result = 10 + 20 * 2 / 4;
        System.out.println("( result = 10 + 20 * 2 / 4; )");
        System.out.println("Result Left to Right = " + result);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        // Using Parentheses
        System.out.println("---------------USING Parentheses ()----------------");
        result = (10 + 20) * 2 / 4;
        System.out.println("result = (10 + 20) * 2 / 4;");
        System.out.println("Result Left to Right = " + result);
    }
}
