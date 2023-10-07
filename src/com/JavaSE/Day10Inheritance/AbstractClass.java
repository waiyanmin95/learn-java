package JavaSE.Day10Inheritance;

// Abstract Class -> Enforce SubClass should contain exact method
// - No Method Body > a.k.a > No Implementation
// - Enforce
abstract class Base {
    abstract void method(); // Should container this method in all SubClass
}

class Derive extends Base {
    @Override
    void method() {
        System.out.println("Derive work");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Base x = new Derive();
        x.method();
    }
}
