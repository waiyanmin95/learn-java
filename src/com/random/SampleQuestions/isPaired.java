package random.SampleQuestions;

public class isPaired {
    public static int isPair(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ( i % 2 == 0 && a[i] % 2 == 0 ) {
                return 0;
            }
            if ( i % 2 == 1 && a[i] % 2 == 1 ) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPair(new int[]{1, 4, 7, 4, 3}));
    }
}
