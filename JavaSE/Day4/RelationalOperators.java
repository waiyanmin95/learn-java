package JavaSE.Day4;

public class RelationalOperators {
    public static void main(String[] args) {
        // Return true or false after Operation
        char c = 'A';
        int a = 4, b = 3;
        var result = a > b;
        System.out.println("Result = " + result);

        System.out.println("C Integer = " + (int) c);
        // 65 != ( a + b ) => return false
        result = c < (a + b);
        System.out.println("Result with Char = " + result);

    }
}
