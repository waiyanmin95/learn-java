package JavaSE.Day10Inheritance;

class Human {
    void work() {
        System.out.println("Human Work");
    }
}

class Teacher extends Human {
    void work() {
        System.out.println("Teacher Teach Students");
    }
}

class Doctor extends Human {
    void work() {
        System.out.println("Doctor Care Patients");
    }
}

public class SubTypeDemo {

    public static void main(String[] args) {
        // Reusable, Already Tested by community, Already Improved, More Functional
        // Polymorphism Requirements
        // 1. Inheritance
        // 2. Variation
        // 3. Declare Super Reference with Sub Object
        Human h = new Teacher();
        // Depends on 'h' Object, change behaviour
        h.work();

        h = new Doctor();
        // Depends on 'h' Object, change behaviour
        h.work();
    }
}
