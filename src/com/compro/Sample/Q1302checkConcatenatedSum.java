package compro.Sample;

public class Q1302checkConcatenatedSum {
    public static int checkConcatenatedSum(int n, int catlen) {
        if (n < 0 || catlen < 0) {
            return 0;
        }

        int concat = 0;
        for (int i = 0; i < catlen; i++) {
            concat = concat * 10;
            concat = concat + 1;
        }

        System.out.println("concat: " + concat);
        int temp = 0;
        int num = n;
        while (num > 0) {
            System.out.println(num);
            temp += (num % 10) * concat;
            num = num / 10;
        }

        System.out.println("======");
        return temp == n ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }
}
