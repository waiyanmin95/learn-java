package compro.Sample.Set2;

public class Q2101isFancy {
    public static int isFancy(int n) {
        if (n < 1) {
            return 0;
        }

        int n1 = 1;
        int n2 = n1;

        int sum = 1;
        while (sum <= n) {
            if (sum == n) {
                return 1;
            }
//            System.out.println(sum);
            sum = (n1 * 3) + (n2 * 2);
            n2 = n1;
            n1 = sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isFancy(1));
        System.out.println(isFancy(5));
        System.out.println(isFancy(17));
        System.out.println(isFancy(61));
    }
}
