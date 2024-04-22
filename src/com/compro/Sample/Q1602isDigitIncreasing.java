package compro.Sample;

public class Q1602isDigitIncreasing {
    public static int isDigitIncreasing(int n) {
        for (int j = 1; j < 10; j++) {
            int result = 0;
            int temp = 0;
            while (result < n) {
                temp = (temp * 10) + j;
                result += temp;
            }

            if (result == n) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
        System.out.println(isDigitIncreasing(10));
    }

}
