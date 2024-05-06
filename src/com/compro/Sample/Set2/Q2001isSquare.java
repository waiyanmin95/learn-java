package compro.Sample.Set2;

public class Q2001isSquare {
    public static int isSquare(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int num = 2;
        while (num * num <= n) {
            if (num * num == n) {
                return 1;
            }
            num++;
        }
//        System.out.println("Num: " + num);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(82));
        System.out.println(isSquare(0));
        System.out.println(isSquare(100000));
    }
}
