package turing.JavaSE.Day7Class;

public class RefDemo {
    public static void main(String[] args) {
        // Reference Model ( Reference Types )
        // Copy the reference ( memory address )
        // Object Construct
        Human human = new Human("GGGGG", 22);
        Human boy = human;

        human.name = "Change";

        System.out.println("Human Name= " + human.name);
        System.out.println("Boy Name= " + boy.name);

        boy = new Human("KKKKK", 10);
        boy.age = 30;

        System.out.println("Human Age = " + human.age);
        System.out.println("Boy Age = " + boy.age);

        // Value Model ( Primitive Type )
        // Copy the value
        int a = 10;
        int b = a;

        a = 55;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
