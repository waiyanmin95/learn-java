package JavaSE.Day5Operators;

public class ForLoopDemo {
    public static void main(String[] args) {
        // Usage: Counter Control
        // Initialization > Condition > Increment/Decrement
        // Init [ Optional ] ; Condition ; Step [ Optional ]
        // Forgetting step can lead to infinity loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Java Loop Index: " + i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("GG = " + i);
        }
    }
}
