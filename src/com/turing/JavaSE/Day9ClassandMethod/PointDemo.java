package turing.JavaSE.Day9ClassandMethod;

class Point2D {
    // Case 1: Static variable
    static int i;
    protected int x;
    protected int y;

    static { // Static initialization block
        i = 100;
        System.out.println("2D Static Block " + i);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point2D Constructor");
    }
}

class Point3D extends Point2D {
    protected int z;

    static {
        i = 400;
        System.out.println("3D Static Block " + i);
    }

    void SubClassMethod() {
        System.out.println("Accessing Static Variable from SubClass " + i);
    }

    public Point3D(int x, int y, int z) {
        super(x, y); // Access Super Class
        this.z = z;
        // Invalid, Reason: Call to 'super()' must be first statement in constructor body
        // super();
        System.out.println("Point3D Constructor");
    }
}

public class PointDemo {
    public static void main(String[] args) {
        Point3D threeD = new Point3D(10, 20, 30);
        threeD.SubClassMethod();
    }
    /* Output
    2D Static Block 100
    3D Static Block 400
    Point2D Constructor
    Point3D Constructor
    Accessing Static Variable from SubClass 400
     */
}
