package JavaSE.Day9;

public class FinalUsage {

    // Class Level - Cannot extend
    final class FinalClass {

    }

    /*
    class AnotherChild extends FinalClass {

    }
    */

    class Base {
        // Method Level
        final void method() {
            System.out.println("Cannot Override");
        }
    }

    class Child extends Base {

        // Cannot override
        /*
        final void method() {
            System.out.println("Cannot Override");
        }
         */
    }


    public static void main(String[] args) {
        // Variable Level -> Constant
        final double MY = 883.4;
        System.out.println("MY FINAL VALUE " + MY);

        // Cannot Override
        // MY = 1123;
    }
}
