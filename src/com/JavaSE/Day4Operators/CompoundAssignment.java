package JavaSE.Day4Operators;

public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        b += a + 2;
        System.out.println("B = " + b);

        // Compound Assignment Error
        // Force assign the bigger type to smaller type
        byte c = 126;
        c += b;
        System.out.println("C = " + c);
    }
}
