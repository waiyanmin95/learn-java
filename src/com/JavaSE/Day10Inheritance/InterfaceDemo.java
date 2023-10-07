package JavaSE.Day10Inheritance;

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

// Interface extends Interfaces
interface DuckLikeBehaviour extends Flyable, Walkable {
    void swim();
}

class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane Fly");
    }
}

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird Fly");
    }
}

class Duck implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Duck Fly");
    }

    @Override
    public void walk() {
        System.out.println("Duck Walk");
    }
}

class Goose implements DuckLikeBehaviour {
    @Override
    public void fly() {
        System.out.println("Goose Fly");
    }

    @Override
    public void walk() {
        System.out.println("Goose Walk");
    }

    @Override
    public void swim() {
        System.out.println("Goose Swim");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // SubTyping Enable
        Flyable f = new Aeroplane();
        f.fly();
        System.out.println(f.getClass());

        f = new Bird();
        f.fly();
        System.out.println(f.getClass());

        Walkable w = new Duck();
        w.walk();
        System.out.println(w.getClass());

        DuckLikeBehaviour d = new Goose();
        d.swim();
        d.fly();
        d.walk();
        System.out.println(d.getClass());
    }
}
