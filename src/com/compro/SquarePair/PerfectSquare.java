package compro.SquarePair;

public class PerfectSquare {
    public static int isPerfectSquare(int n) {
        int temp = (int) Math.floor(Math.sqrt(n));
        if ( temp * temp == n ) {
            return 1;
        }
        return 0;
    }

public static int countSquarePairs(int[] arr) {
        if ( arr.length < 2 ) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if ( arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length ; j++) {
            // System.out.println(arr[i] + " " + arr[j]); // debug
            if ( (arr[i] < arr[j]) && 1 == isPerfectSquare(arr[i]+arr[j]) ) {
                count++;
            }
        }
    }
    return count;
}

    public static void main(String[] args) {
        int[] test = {11, 5, 4, 20};
        int[] allzero = {0, 0, 0, 0};
        int[] twoelement = {4, 5};
        System.out.println(countSquarePairs(test));
        System.out.println("All Zero: " +countSquarePairs(allzero));
        System.out.println(countSquarePairs(twoelement));
        System.out.println(isPerfectSquare(149));
    }
}
