package turing.JavaSE.Day3TypeArrays;

public class DifferentZero {
    public static void main(String[] args) {
        // Integer Zero
        int integerZero = 0;
        int negZero = -integerZero;
        System.out.println("integerZero = " + integerZero);
        System.out.println("negZero = " + negZero);

        // Double Zero
        double dZero = 0;
        double dNegZeroLiteral = -0;
        double dNegZero = -dZero;
        System.out.println("dZero = " + dZero);
        System.out.println("dNegZeroLiteral = " + dNegZeroLiteral);
        System.out.println("dNegZero = " + dNegZero);

        // Check Double Negative Zero == Integer Zero
        System.out.println("dZero==integerZero = " + (dZero == integerZero));
        System.out.println("negZero==integerZero = " + (negZero == integerZero));
        System.out.println("dNegZero==dZero = " + (dNegZero == dZero));
        System.out.println("dNegZero==integerZero = " + (dNegZero == integerZero));

        // Negative Operations

        System.out.println("1/dNegZero = " + (1 / dNegZero));
        System.out.println("1/dZero = " + (1 / dZero));
    }
}
