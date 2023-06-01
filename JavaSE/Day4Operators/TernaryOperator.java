package JavaSE.Day4Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        // Three Operator == Ternary Operation
        int num = 1111;
        // result = ( Operation == true )? true : false
        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("evenOrOdd = " + evenOrOdd);

        // Same as this one
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int mark = 99;
        // Complex Sample
        String result = mark >= 40 ?
                (mark >= 80) ? "Distinction" : "Pass"
                : "Fail";
        System.out.println("Result = " + result);
    }
}
