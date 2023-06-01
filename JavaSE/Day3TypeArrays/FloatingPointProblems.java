package JavaSE.Day3TypeArrays;

public class FloatingPointProblems {
    public static void main(String[] args) {
        // Floating point should NOT check with the equal ( == )
        double d = 0.3 - 0.2;
        System.out.println("D = " + d);

        System.out.println("Division PI = " + (Math.PI / 1.1));

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        // Expected 0.3
        System.out.println("Operation = " + c);
    }
}
