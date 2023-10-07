package JavaSE.Day6ControlFlow;

public class ClassDemo {
    static void work(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        String name1 = "WYM";
        int age1 = 28;

        String name2 = "YUM";
        int age2 = 30;

        work(name1, age1);
        work(name2, age1);
    }
}
