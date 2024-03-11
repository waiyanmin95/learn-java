package compro.isStacked;

public class StackorNot {
    public static int isStacked(int n) {
        int sum = 0;
        int result = 0;
        for (int i = 0; i <= n/2; i++) {
            sum = i + 1;
            result += sum;
            if ( result == n ) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(10)); // true
        System.out.println(isStacked(100)); // false
    }
}
