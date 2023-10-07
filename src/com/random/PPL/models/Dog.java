package random.PPL.models;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public void bark() {
        System.out.println("Woof Woof");
    }

}
