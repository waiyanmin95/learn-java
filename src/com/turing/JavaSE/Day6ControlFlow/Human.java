package turing.JavaSE.Day6ControlFlow;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        System.out.println("Human Constructor");
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Working");
    }

    public static void main(String[] args) {
        Human object1 = new Human("WYM", 22);
        object1.work();

        Human object2 = new Human("NAN", 29);
        object2.work();
    }
}
