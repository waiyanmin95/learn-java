package turing.JavaSE.Day11Exceptions;

public class WhyException {
    // Check condition and validate then throw Exception
    static double divide(double a, double b) throws Exception {
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new Exception("One of the operand is NaN");
        }
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        // Execute with the "try" block
        try {
            double result = divide(3, Double.NaN);
            System.out.println("Result = " + result);
        }
        // Catch the Exception with "catch" block
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("End of the line.");
    }
}
