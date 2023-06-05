package JavaSE.Day5Operators;

public class IterationDemo {
    public static void main(String[] args) {
        // Iteration Statement ( Array and Loop Related )
        // Iteration == Loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " HelloWorld");
        }

        // int[] xi = new int[]{1, 2, 3, 4, 5};
        int[] xi = {1, 2, 3, 4, 5};
        for (int i = 0; i < xi.length; i++) {
            System.out.println("Index: " + i + " Value: " + xi[i]);
        }
    }
}
