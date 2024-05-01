package compro.Sample;

public class Q2003isFibonacci {
    public static int isFibonacci(int n) {
        if (n < 0) {
            return 0;
        }

        int fibonnacci = 0;
        if (n == 1 || n == 2) {
            fibonnacci = 1;
        }

        int f1 = 1;
        int f2 = 1;

        while (fibonnacci < n) {
            fibonnacci = f1 + f2;
            f1 = f2;
            f2 = fibonnacci;
        }
        if (fibonnacci == n) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(21));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(100));
        System.out.println(isFibonacci(-100));
    }
}
