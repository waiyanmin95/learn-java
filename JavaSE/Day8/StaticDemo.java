package JavaSE.Day8;

public class StaticDemo {
    int count;
    static int shared;

    StaticDemo() {
        count++;
        shared++;
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();

        System.out.println("obj1 = " + obj1.count);
        System.out.println("obj2 = " + obj2.count);
        System.out.println("obj3 = " + obj3.count);

        System.out.println("SHARED " + shared);
        System.out.println("obj1 = " + StaticDemo.shared);
        System.out.println("obj1 = " + StaticDemo.shared);
        System.out.println("obj1 = " + StaticDemo.shared);
    }
}
