package turing.JavaSE.Day11Exceptions;

public class FinallyDemo {
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
        // Can't have multiple finally
        // It Always wins.
        finally {
            System.out.println("Finally >>> Clean up some resources");
        }
        System.out.println("End of the line.");
    }
}
