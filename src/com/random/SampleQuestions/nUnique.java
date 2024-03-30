package random.SampleQuestions;

public class nUnique {
    public static int isNUnique(int[] a, int n) {
        if ( a.length < 2 ) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if ( a[i] + a[j]  == n ) {
                    count++;
                }
            }
        }
        if ( count != 1 ) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{7, 3, 3, 2, 4};
        System.out.println(isNUnique(test1, 6));
        System.out.println(isNUnique(test1, 11));
    }
}
