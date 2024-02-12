package turing.JavaSE.Day18StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

enum GENDER {
    MALE,
    FEMALE
}
class Human {
    String name;
    int age;
    GENDER gender;

    public Human(String name, int age, GENDER gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
public class FPDemo {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();

        list.add(new Human("Aung", 27, GENDER.MALE));
        list.add(new Human("Su", 170, GENDER.FEMALE));
        list.add(new Human("Hla", 30, GENDER.MALE));
        list.add(new Human("Dway", 11, GENDER.MALE));
        list.add(new Human("Mya", 78, GENDER.FEMALE));
        list.add(new Human("Kyaw", 55, GENDER.MALE));
        list.add(new Human("Thida", 100, GENDER.FEMALE));

        // Get the name of men over age 25
        Stream<String> sname = list.stream().filter(obj -> obj.age > 25 && obj.gender == GENDER.MALE).map(obj -> obj.name);
        sname.forEach(x -> System.out.println("Results "+x));

        // Get the oldest women
        Optional<Human> oldesfemale = list.stream().filter(obj -> obj.gender == GENDER.FEMALE).max((a, b) -> a.age-b.age);
        oldesfemale.ifPresent(human -> System.out.println("Oldest Female Name is " + human.name + ", age "+human.age));
    }
}
