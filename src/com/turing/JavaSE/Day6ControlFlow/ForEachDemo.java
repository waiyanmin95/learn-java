package turing.JavaSE.Day6ControlFlow;

public class ForEachDemo {

    public static void main(String[] args) {
        int[] xi = {11, 22, 33, 44, 55, 66, 77, 88, 99, 101};

        for (int v : xi) {
            System.out.println("Index: " + v + " Value: " + xi[0]);
        }
    }
}
