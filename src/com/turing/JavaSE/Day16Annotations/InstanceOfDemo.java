package turing.JavaSE.Day16Annotations;

class A {

}
class B extends A {

}
class C extends B {

}
class Shape {

}
class Circle extends Shape {

}
class Rectangle extends Shape {

}
public class InstanceOfDemo {
    public static void main(String[] args) {
        String str = null;
        System.out.println("str instanceof String: "+ (str instanceof String));
        System.out.println("str instanceof Object: "+ (str instanceof Object));

        C c = new C();
        System.out.println("c instanceof Object: "+ (c instanceof Object));
        System.out.println("c instanceof A: "+ (c instanceof A));
        System.out.println("c instanceof B: "+ (c instanceof B));
        System.out.println("c instanceof C: "+ (c instanceof C));

        //System.out.println("c instanceof A "+ (c instanceof Date));

        Shape s = new Circle();
        System.out.println("s instanceof Shape: "+ (s instanceof Shape));
        System.out.println("s instanceof Circle: "+ (s instanceof Circle));
        System.out.println("s instanceof Rectangle: "+ (s instanceof Rectangle));
    }
}
