package JavaSE.Day3;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        // Operators ( +,-,*,/,% )
        // Operands ( numbers )
        // Operation with one Operand = Unary Operator
        int a = 1;
        a++;
        System.out.println("Unary = " + a);
        // Operation with two Operand = Binary Operator
        int b = a + 2;
        System.out.println("Binary = " + b);
        // Operation with three Operand = Ternary Operator
        int c = a + (b * b);
        System.out.println("Ternary = " + c);


        // Operations
        int x = 5;
        int y = 2;

        System.out.println("x + y = " + (x + y)); // Addition
        System.out.println("x - y = " + (x - y)); // Subtraction
        System.out.println("x * y = " + (x * y)); // Multiplication
        System.out.println("x / y = " + (x / y)); // Division
        System.out.println("x % y = " + (x % y)); // Modulus

        // Semantic
        // Floating Point Operations
        System.out.println("Integer Division / = " + (5 / 2));
        System.out.println("Decimal Division / = " + (5 / 2.0));

        // Zero 0 Division // Exception / by zero
//        System.out.println("Integer Zero Division = " + (5 / 0));

        // Zero point 0 Division // Infinity
        System.out.println("Floating Zero Division = " + (5 / 0.0));

        // Zero division Zero // NaN ( Invalid Number/Not a Number)
        // NaN only exist in float and double
        double invalid = (0 / 0.0);
        System.out.println("Zero Division = " + invalid);

        // Check Invalid == Invalid // false
        System.out.println("Compare Invalid = " + (invalid == invalid));

        // Operation with NaN // NaN ( Invalid Number/Not a Number)
        System.out.println("Invalid Operation with others = " + (invalid + 10));

        // Check a Number is NaN
        System.out.println("Check NaN = " + Double.isNaN(invalid));
    }
}
