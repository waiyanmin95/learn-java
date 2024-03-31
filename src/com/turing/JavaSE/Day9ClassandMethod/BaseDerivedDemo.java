package turing.JavaSE.Day9ClassandMethod;

class Parent {
    int a; // Default => Package Access
    private int p; // Private > which is private to Parent, can't access from SubClass members
    protected int k; // Protected > Allow access from SubClass members

    void method1() {
        System.out.println("Method 1");
    }

    void common() {
        System.out.println("Parent Method");
    }
}

class Derived extends Parent {
    int b;

    void method2() {
        System.out.println("Method 2 + " + super.k);
    }

    void common() {
        System.out.println("Derived Method");
    }
}

class Third extends Derived {
    int c;

    void method3() {
        System.out.println("Method 3");
    }

    void common() {
        super.common();
        System.out.println("Third Method");
    }
}

public class BaseDerivedDemo {
    public static void main(String[] args) {
        Third tt = new Third();
        tt.a = 100;
        tt.b = 200;
        tt.c = 300;

        tt.method1();
        tt.method2();
        tt.method3();

        // Method Override
        tt.common();
    }
}
