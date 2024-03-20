package compro.Q22isSquare;

public class SquareSimple {
    public static boolean isSquare(int n) {
        if ( n <= 2 ) {
            return false;
        }
        for (int i = 1; i <= n/2; i++) {
            System.out.println(i);
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(81)); // true
        System.out.println(isSquare(100)); // true
        System.out.println(isSquare(77)); // false
    }
}
