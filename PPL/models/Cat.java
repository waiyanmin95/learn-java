package PPL.models;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public void meow() {
        System.out.println("Meow Meow");
    }

}
