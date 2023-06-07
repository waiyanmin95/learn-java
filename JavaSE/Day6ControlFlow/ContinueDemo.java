package JavaSE.Day6ControlFlow;

public class ContinueDemo {
    public static void main(String[] args) {
        // Not a good approach
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Skip
                continue;
            }
            System.out.println("I with Continue: " + i);
        }
        System.out.println("------------------");

        // Good approach
        for (int i = 0; i < 10; i++) {
            if (i != 5) {
                System.out.println("I without Continue: " + i);
            }
        }

        System.out.println("------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // Break
                break;
            }
            System.out.println("I with Break: " + i);
        }
    }
}
