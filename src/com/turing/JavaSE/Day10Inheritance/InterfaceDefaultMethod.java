package turing.JavaSE.Day10Inheritance;

interface Animal {
    void eat();

    // Default Interface Method
    default String getString() {
        return "Hello Animals";
    }

    // Static Method
    static double getMin(int a, int b) {

        return Math.min(a, b);
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Animal A = new Cat();
        A.eat();
        System.out.println(A.getString());
        // Accessing Static Method from Interface
        System.out.println(Animal.getMin(5, 8));
    }
}
