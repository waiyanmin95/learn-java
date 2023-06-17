package JavaSE.Day8ClassandMethod;

public class OverloadDemo {
    // Method Overriding Resolution
    // Constructors

    public OverloadDemo() {
        System.out.println("No Argument Constructor");
    }

    public OverloadDemo(int num) {
        System.out.println("One Argument Constructor");
    }

    // Methods
    public static void print() {
        System.out.println("Printing with no parameter");
    }

    public static void print(int num) {
        System.out.println("Printing with INT parameter");
    }

    public static void print(boolean flag) {
        System.out.println("Printing with BOOLEAN parameter");
    }

    public static void print(long num) {
        System.out.println("Printing with LONG parameter");
    }

    public static void print(double num) {
        System.out.println("Printing with DOUBLE parameter");
    }

    public static void print(String str) {
        System.out.println("Printing with STRING parameter");
    }

    public static void main(String[] args) {
        print();
        print(10);
        print(11.11);
        print(true);
        print("HELLO");

        long l = 11111;
        print(l);

        // Conversion Nearest Type
        byte b = 123;
        print(b);

        new OverloadDemo();
        new OverloadDemo(10);
    }
}
