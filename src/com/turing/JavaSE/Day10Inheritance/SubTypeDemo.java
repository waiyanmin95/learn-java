package turing.JavaSE.Day10Inheritance;

class Human {
    void work() {
        System.out.println("Human Work");
    }
}

class Teacher extends Human {
    @Override
    void work() {
        System.out.println("Teacher Teach Students");
    }

    void tuition() {
        System.out.println("Teacher Teach Tuition");
    }
}

class Doctor extends Human {
    @Override
        // Override Annotation
    void work() {
        System.out.println("Doctor Care Patients");
    }
}

class Specialist extends Doctor {
    @Override
    void work() {
        System.out.println("Specialist Treat Patients");
    }
}

public class SubTypeDemo {

    public static void main(String[] args) {
        // Method Override ?
        // Same Signature ( Parameter[name,type], Method )
        Human h = new Teacher();
        // Depends on 'h' Object, change behaviour
        h.work();
        System.out.println(h.getClass());
        ((Teacher) h).tuition();

        h = new Doctor();
        // Depends on 'h' Object, change behaviour
        h.work();
        System.out.println(h.getClass());

        h = new Specialist();
        // Depends on 'h' Object, change behaviour
        h.work();
        System.out.println(h.getClass());
    }
}
