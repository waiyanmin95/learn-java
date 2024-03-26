package turing.JavaSE.Day8ClassandMethod;

public class Factorial {
    static int fact(int num) {
        System.out.println("Factorial " + num);
        if (num == 0) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        int result = fact(5);
        long then = System.currentTimeMillis();
        long diff = then - now;
        System.out.println("Time different = " + diff);
        System.out.println("Factorial Result = " + result);
    }
}
