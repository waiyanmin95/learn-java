package JavaSE.Day7;

public class Box {
    double width, height, depth;

    // Constructor ( Special Method )
    public Box(double width, double height, double depth) {
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

        double volume = box.volume();
        System.out.println("Volume Before Factor = " + volume);
        // Call Increase
        box.increase(3);

        volume = box.volume();
        System.out.println("Volume After Factor = " + volume);

        double volume2 = box2.volume();
        box2.increase(4);
        System.out.println("Volume 2 After Factor = " + volume2);


    }
}
