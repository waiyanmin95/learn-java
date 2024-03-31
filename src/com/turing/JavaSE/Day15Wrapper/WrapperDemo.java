package turing.JavaSE.Day15Wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 42; // Boxing > Primitive Literal to Reference Type
        int k = i; // Unboxing > Reference Type to Primitive Literal
        System.out.println("Primitive Type K: "+k);
        System.out.println("Reference Type I: "+i);
        System.out.println("I instanceOf Object: "+( i instanceof  Object));

        // String to Wrapper (Integer)
        i = Integer.valueOf("18");
        System.out.println("Reference Type I: "+i);
        System.out.println("I instanceOf Object: "+( i instanceof  Object));
    }
}
