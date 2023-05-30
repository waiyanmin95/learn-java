package JavaSE.Day3;

public class DefaultValuesDemo {
    boolean t;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;

    String ss;

    void Display() {
        System.out.println("boolean (Initial Value) = " + t);
        System.out.println("byte (Initial Value) = " + b);
        System.out.println("short (Initial Value) = " + s);
        System.out.println("int (Initial Value) = " + i);
        System.out.println("long (Initial Value) = " + l);
        System.out.println("float (Initial Value) = " + f);
        System.out.println("double (Initial Value) = " + d);
        System.out.println("String (Initial Value) = " + ss);
    }

    public static void main(String[] args) {
        DefaultValuesDemo d = new DefaultValuesDemo();
        System.out.println("Displaying initial values...");
        d.Display();
    }
}
