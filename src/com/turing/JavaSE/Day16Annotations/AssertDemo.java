package turing.JavaSE.Day16Annotations;

public class AssertDemo {
    public static void main(String[] args) {
        int k = 10;
        assert k % 2 == 0; // true
        System.out.println("Value of K ( EVEN ): "+k);

        // throw "Exception in thread "main" java.lang.AssertionError"
        k = 111;
        assert k % 2 == 0; // false
        // run with # java -ea AssertDemo
        System.out.println("Value of K ( ODD ): "+k);
    }
}
