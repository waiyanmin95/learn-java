package JavaSE.Day7Class;

public class Box {
    double width, height, depth;

    // Constructor ( Special Method )
    public Box(double width, double height, double depth) {
        System.out.println("Box Constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    void increase(int factor) {
        System.out.println("Factor " + factor);
        this.width *= factor;
        this.height *= factor;
        this.depth *= factor;
    }

    public static void main(String[] args) {
        Box box = new Box(2, 4, 5);
        Box box2 = box;

        double vol = box.volume();
        System.out.println("Volume Before Factor = " + vol);
        // Call Increase
        box.increase(3);

        vol = box.volume();
        System.out.println("Volume After Factor = " + vol);

        double vol2 = box2.volume();
        box2.increase(4);
        System.out.println("Volume 2 After Factor = " + vol2);
    }
}
