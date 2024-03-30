package random.SampleQuestions;

public class isStacked {
    public static int isStack(int n) {
        int stack = 0;
        int i = 1;
        while (i <= n) {
//            System.out.println("I: "+i + " " + "N: "+n);
            stack += i;
            if ( stack > n ) {
                break;
            }
            if ( stack == n ) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(isStack(0));
//        System.out.println(isStack(7));
//        System.out.println(isStack(1));
//        System.out.println(isStack(3));
//        System.out.println(isStack(6));
//        System.out.println(isStack(10));
//        System.out.println(isStack(15));
        int count = 0;
        for (int i = 0; i <= 50 ; i++) {
            if ( 1 == isStack(i)) {
                System.out.println("I: "+i);
                count++;
            }
        }
        System.out.println(count);
    }
}
