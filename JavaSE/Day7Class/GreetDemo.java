package JavaSE.Day7Class;

public class GreetDemo {
    String greet(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        // Default Constructor
        GreetDemo waiter = new GreetDemo();
        System.out.println(waiter.greet("Tom"));
        System.out.println(waiter.greet("Jerry"));
    }
}
