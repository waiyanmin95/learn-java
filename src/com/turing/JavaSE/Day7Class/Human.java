package turing.JavaSE.Day7Class;

public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        System.out.println("Human Constructor");
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Working");
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Human tom = new Human("MUMMY", 22);
        tom.work();

        Human jerry = new Human("NAN", 29);
        jerry.work();

        int JerryAge = jerry.getAge();
        System.out.println("Object 2 Age = " + JerryAge);
    }
}
