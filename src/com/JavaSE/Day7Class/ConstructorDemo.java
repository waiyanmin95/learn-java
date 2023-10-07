package JavaSE.Day7Class;

public class ConstructorDemo {
    double h, w, d;

    public void volume(double h, double w, double d) {
        System.out.println("Volume is = " + (h * w * d));
    }

    public static void main(String[] args) {
        // Default Constructor
        ConstructorDemo box = new ConstructorDemo();
        box.volume(2, 2, 3);
    }
}
