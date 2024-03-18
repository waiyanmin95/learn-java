package compro.Q33FindSmallest;

public class FindSmallest {

    public static int smallest(int n) {
        int small = 124;
        if ( n <= 0 ) {
            return small;
        }
        while (true) {
            int count = 1;
            for (int i = 1; i <= n; i++) {
                if ( !containsTwo(small*i)) {
                    break;
                }
                count++;
            }
            if ( count > n ) {
                return small;
            }
            small++;
        }
    }

    private static boolean containsTwo(int num) {
        while (num > 0) {
            if (num % 10 == 2) {
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(smallest(2));
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
        System.out.println(smallest(8));
        System.out.println(smallest(9));
    }
}
