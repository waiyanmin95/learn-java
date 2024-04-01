package compro.Sample;

public class Q702isStacked {
    public static int isStacked(int n) {
        if ( n < 0 ) {
            return 0;
        }
        int sum = 0;
        int i = 1;
        while ( i <= n ) {
            sum += i;
//            System.out.println("I: "+i);
            if ( sum > n ) {
                break;
            }
            if ( sum == n ) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isStacked(0));
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
    }
}
