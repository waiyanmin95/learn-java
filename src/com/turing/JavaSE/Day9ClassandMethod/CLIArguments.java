package turing.JavaSE.Day9ClassandMethod;

public class CLIArguments {
    public static void main(String[] args) {
        System.out.println("Hello World");
        for (String v : args) {
            System.out.println("Arguments , " + v);
        }
    }
}
