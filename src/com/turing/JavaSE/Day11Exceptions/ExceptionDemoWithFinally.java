package turing.JavaSE.Day11Exceptions;

public class ExceptionDemoWithFinally {
    // Check condition and validate then throw Exception
    // Rethrow (provide a more meaningful) exception when that's not for you.
    static double div(double a, double b) throws RuntimeException {
        try {
            if (Double.isNaN(a) || Double.isNaN(b)) {
                throw new RuntimeException("One of the operand is NaN");
            }
        } catch (Exception e) {
            // return 200;
            throw new RuntimeException("Rethrow Another Exception");
        }
        // Finally always win.
        finally {
            System.out.println("Finally Executed");
            // return 300;
            throw new RuntimeException("Rethrow at Finally");
        }
    }

    public static void main(String[] args) {
        double result = div(10, Double.NaN);
        System.out.println("Result = " + result);
    }
}
