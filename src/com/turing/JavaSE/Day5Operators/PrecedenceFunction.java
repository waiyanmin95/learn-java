package turing.JavaSE.Day5Operators;

public class PrecedenceFunction {
    static int getTen() {
        System.out.println("Get Ten");
        return 10;
    }

    static int getFive() {
        System.out.println("Get Five");
        return 5;
    }

    public static void main(String[] args) {
        double result = 10 + 20 / (2 * 4);
        System.out.println("Result = " + result);
        System.out.println("---------------------------------------------------");

        // Function order high ( Left to Right )
        // 10 + 5 * 4
        result = getTen() + getFive() * 5;
        System.out.println("Result with functions = " + result);
        System.out.println("---------------------------------------------------");

        // Since getTen() and getFive() types are int, operation need to be type cast
        // Not showing correct answer
        // Assignment Included
        result = getTen() + getFive() * 5 / getTen();
        System.out.println("Result with functions raw = " + result);
        System.out.println("---------------------------------------------------");

        // TypeCasted
        // Assignment Included
        result = getTen() + (double) (getFive() * 5) / getTen();
        System.out.println("Result with functions TypeCasted = " + result);
        System.out.println("---------------------------------------------------");

        // Assignment ( Right to Left )
        double k = result = 30;
        System.out.println("Result before assign to K = " + result);
        System.out.println("---------------------------------------------------");
        System.out.println("Assignment = " + k);
    }
}
