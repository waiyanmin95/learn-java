package compro.Sample.Set2;

public class Q1901isFibonacci {
    public static int isFibonacci(int n) {
        if (n < 0) {
            return 0;
        }

        int fibonacci = 0;
        int f1 = 1;
        int f2 = 1;

        if (n == 1) {
            fibonacci = 1;
        }
        while (fibonacci < n) {
            System.out.println(f1 + " " + f2);
            fibonacci = f1 + f2;
            f1 = f2;
            f2 = fibonacci;

        }
        System.out.println(fibonacci);
        if (fibonacci == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(1));
//        System.out.println(isFibonacci(2));
//        System.out.println(isFibonacci(3));
//        System.out.println(isFibonacci(5));
//        System.out.println(isFibonacci(0));
    }
}
