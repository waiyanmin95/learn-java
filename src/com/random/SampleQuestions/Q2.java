package random.SampleQuestions;

public class Q2 {
    public static int isMadhavArray(int[] a) {
        if ( a.length < 3 ) { // check the base case
            return 0;
        }
        int i = 1, counter = 2;
        while (i < a.length) {
            int sum = 0;
            for (int j = 0; j < counter; j++, i++) {
                sum += a[i];
            }
            if ( sum != a[0]) {
                return 0;
            }
            if ( i == a.length ) {
                if ( counter * (counter + 1)/2 == a.length ) {
                    return 1;
                }
            } else {
                counter++;
                if((i + counter) > a.length)
                    return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{ 15, 14, 1, 0, 11, 4, 2 , 3, 5, 5, 1, 2, 3, 7, 2};

        System.out.println(isMadhavArray(test1));
    }
}
