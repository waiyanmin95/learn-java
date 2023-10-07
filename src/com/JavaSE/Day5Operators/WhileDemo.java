package JavaSE.Day5Operators;

public class WhileDemo {
    public static void main(String[] args) {
        // In the Scope
        int i = 0;
        // Usage: Condition Control
        while (i < 10) {
            System.out.println("I = " + i);
            i++;
        }
        System.out.println("Last I = " + i);
    }
}
