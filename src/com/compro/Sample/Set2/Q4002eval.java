package compro.Sample.Set2;

public class Q4002eval {
    public static double eval(double x, int[] a) {
        if (a.length == 0) {
            return 0.0;
        }

        double result = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            result += a[i] * power(x, i);

        }
        return result;
    }

    public static double power(double base, int pow) {
        double result = 1;
        while (pow != 0) {
            result = result * base;
            pow--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(eval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
        System.out.println(eval(10.0, new int[]{}));
    }
}
