package PPL;

import PPL.models.Cat;
import PPL.models.Dog;
import PPL.models.Person;

import java.time.LocalDate;

public class People {
    public static void main(String[] args) {
        System.out.println("Hello World, Nice to meet you!");
        System.out.println("-----------");


        Person john = new Person("John", "Cena", LocalDate.of(1995, 10, 10));
        Person snow = new Person("Snow", "white", LocalDate.of(1992, 12, 31));

        john.setSpouse(snow);

        Dog milo = new Dog("Milo", "Gold");
        Cat silo = new Cat("Silo", "White");
        john.setPet(milo);
        john.setSpouse(snow);

        milo.bark();
        silo.meow();
        silo.getName();
        silo.getColor();

        System.out.println(john);
        System.out.printf("Pet Name: %s\n", john.getPet().getName());
        System.out.printf("Pet Color: %s\n", john.getPet().getColor());
    }

}
