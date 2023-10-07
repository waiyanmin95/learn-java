package JavaSE.Day10Inheritance;

class Original {
    void work() {
        System.out.println("Original Work");
    }

    void demo(int i) {
        System.out.println("Original Demo with Integer");
    }
}

class Copy1 extends Original {
    @Override
    void work() {
        System.out.println("Copy1 Work");
    }

    void demo(double i) {
        System.out.println("Copy1 Demo with Double");
    }
}

class Copy2 extends Original {
    @Override
        // Override Annotation
    void work() {
        System.out.println("Copy2 Work");
    }

    void demo(int i) {
        System.out.println("Copy2 Demo with Integer");
    }
}

public class MessUpCase {
    // Sample Code for Method Overloading and Overriding Messing Up
    public static void main(String[] args) {
        Original x = new Original();
        x.work();

        x = new Copy2();
        x.work();
        System.out.println("--------------");

        // x = Copy2
        int i = 10;
        x.demo(i);

        System.out.println("--------------");

        int k = 100;
        x = new Copy1();
        x.demo(k);
    }
}
