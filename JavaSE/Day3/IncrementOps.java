package JavaSE.Day3;

public class IncrementOps {
    public static void main(String[] args) {
        int count = 0;
        count++;
        System.out.println("count = " + count);

        // Suffix/Postfix Increment
        int a = count++;
        System.out.println("count = " + count);
        System.out.println("a = " + a);

        // Prefix Increment
        int b = ++count;
        System.out.println("count = " + count);
        System.out.println("b = " + b);

        // Compound Assignment
        int x = 10;
        int y = 5;

        // Same as y = (y + x) //
        y += x;
        System.out.println("Compound Assignment Y = " + y);

        // y = y + ( y + 2 )
        // y = 15 + ( 15 + 2 )
        // y = 15 + 17
        y += y + 2;
        System.out.println("Compound Assignment Y += " + y);
    }
}
