package compro;
// A Madhav array has the following property:
//
// a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
//
// Complete the function/method that returns true if the given array is a Madhav array,
// otherwise it returns false.
//
// Edge cases: An array of length 0 or 1 should not be considered a Madhav array
// as there is nothing to compare.
public class Q9MadhavArray {
    private static boolean isMadhav(int[] arr) {
        if ( arr.length < 3) {
            return false;
        }

        for (int i = 2; i < arr.length; i++) {
            if ( arr.length == i *( i + 1 ) / 2) {
                int index = 0;
                boolean flag = true;
                for (int j = 1; j <= i; j++) {
                    int sum = 0;
                    for (int k = 0; k < j; k++) {
                        sum += arr[index];
                        index++;
                    }
                    if (arr[0] != sum) {
                        flag = false;
                    }
                }
                return flag;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = { 15, 14, 1, 0, 11, 4, 2 , 3, 5, 5, 1, 2, 3, 7, 2};
        System.out.println("My Code: "+isMadhav(a));
    }
}
