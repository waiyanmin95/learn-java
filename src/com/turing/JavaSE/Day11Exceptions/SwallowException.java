package turing.JavaSE.Day11Exceptions;

public class SwallowException {
    static double divide(double a, double b) {
        try {
            StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
            for (StackTraceElement tre : stackTraces) {

                System.out.println("FileName " + tre.getFileName() + " " + tre.getMethodName() + " line no. = " + tre.getLineNumber());
            }
        } catch (Exception e) {
        }
        try {
            if (Double.isNaN(a) || Double.isNaN(b)) {
                throw new RuntimeException("One of the operand is NaN");
            }
            return a / b;
        } catch (Exception e) {
            return 200;
            //throw new RuntimeException("Another exception");
        } finally {
            System.out.println("Finally executed");
            //return 300;
            throw new RuntimeException("Rethrow at finally");
        }
        //return a/b;
    }

    public static void main(String[] args) throws Exception {
        // Execute with the "try" block
        try {
            double result = divide(3, Double.NaN);
            System.out.println("Result = " + result);
        }
        // Catch the Exception with "catch" block
        catch (Exception e) {
            // No Exception Handled
        }
        System.out.println("End of the line.");
    }
}
