package compro.stantonMeasure;

// Examples
// The Stanton measure of [1, 4, 3, 2, 1, 2, 3, 2] is 3,
// because 1 occurs 2 times in the array and 2 occurs 3 times.
//
// The Stanton measure of [1, 4, 1, 2, 11, 2, 3, 1] is 1,
// because 1 occurs 3 times in the array and 3 occurs 1 time.

public class Q13stantonMeasure {
    public static int stantonMeasure(int[ ] n) {
        int count = 0;
        int check = 0;
        for (int i = 0; i < n.length; i++) {
            if ( 1 == n[i] ) {
                count++;
            }
        }

        for (int i = 0; i < n.length; i++) {
            if ( count < 1 ) {
                return 0;
            }
            if ( count == n[i] )
                check++;
        }

        return check;
    }

    public static void main(String[] args) {
        int[] test1 = {4, 1, 3, 2, 1, 2, 3, 2, 1, 1};
        int[] allzero = {0, 0, 0, 0};
        System.out.println(stantonMeasure(test1));
        System.out.println(stantonMeasure(allzero));
    }

}
