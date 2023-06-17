package JavaSE.Day9;

class Outer {
    int outerX = 100;

    private static int staticData = 10;
    private int instanceData = 20;

    void OuterMethod() {
        Inner inner = new Inner();
        inner.InnerMethod();
        inner.PrintX();
    }

    class Inner {
        void InnerMethod() {
            System.out.println("Accessing Outer Data from InnerMethod: " + outerX);
            System.out.println("Accessing instanceData from InnerClass: " + instanceData);
        }

        void PrintX() {
            System.out.println("Inner Print X");
        }
    }

    // Static Class
    public class InnerClass {
        public void innerMethod() {
            System.out.println("Accessing staticData from InnerClass: " + staticData);
            System.out.println("Accessing instanceData from InnerClass: " + instanceData);
        }
    }

    // NonStatic Class
    public static class StaticNestedClass {
        public void staticMethod() {
            System.out.println("Accessing staticData from StaticNestedClass: " + staticData);
            // Cannot access instanceData here, as it is an instance member
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterMethod();

        Outer.StaticNestedClass staticNested = new Outer.StaticNestedClass();
        staticNested.staticMethod();

        Outer.InnerClass inner = o.new InnerClass();
        inner.innerMethod();
    }
}
