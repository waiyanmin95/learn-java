package compro;

public class Q1 {
    public static int isPaired(int[] arr) {
        for ( int i = 0; i < arr.length; i++ ) {
            if (i % 2 == 0 && arr[i] % 2 == 0) { // when index and value are even
                return 0;
            }
            if (i % 2 == 1 && arr[i] % 2 == 1) { // when index and value are odd
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] pair = {1,4,7};
        int[] unpair = {0,1,2,3};
        System.out.println(isPaired(pair));
        System.out.println(isPaired(unpair));
    }
}



