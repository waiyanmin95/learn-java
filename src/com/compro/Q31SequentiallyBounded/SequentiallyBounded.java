package compro.Q31SequentiallyBounded;

public class SequentiallyBounded {
    public static int isSequentiallyBounded(int[] a) { //todo
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if ( a[i] < min ) {
                return 0;
            }
            min = a[i];
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if ( a[j] == a[i] ) {
                    count++;
                }
            }
            if ( count >= a[i] ) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] test1 = new int[]{2, 3, 3, 99, 99, 99, 99, 99};
        int[] test2 = new int[]{2, 3, 3, 3, 99, 99, 99, 99, 99};
        System.out.println(isSequentiallyBounded(test1));
        System.out.println(isSequentiallyBounded(test2));
    }
}
