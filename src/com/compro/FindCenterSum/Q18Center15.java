package compro.FindCenterSum;

public class Q18Center15 {
    public static int isCentered15God(int[] a) {
        for (int i = 0; i <= a.length / 2; i++) {
            int sum = 0;
            for (int j = i; j < (a.length - i); j++) {
                sum += a[j];
            }
            if (sum == 15)
                return 1;
        }
        return 0;
//    }
//    public static int isCenter15(int[] a) {
//        if ( a.length == 0 ) {
//            return 0;
//        }
//
//        int first = 0;
//        int last = 0;
//        for (int i = 1; i < a.length/2; i++) {
//            int sum = 0;
//            for (int j = i; j < a.length-1; j++) {
//                sum += a[j];
//                if ( sum == 15 ) {
//                    last = j;
//                    break;
//                }
//            }
//            first = i;
//        }
//        if ( first == (a.length-last)-1) {
//            return 1;
//        }
//        return 0;
    }

    public static void main(String[] args) {
        int[] xi = {3, 2, 10, 4, 1, 6, 9};
        int[] test1 = {3, 2, 6, 7, 2, 1, 6};
//        System.out.println(isCenter15(xi));
//        System.out.println(isCenter15(test1));
        System.out.println("===============");
        System.out.println(isCentered15God(xi));
        System.out.println(isCentered15God(test1));
    }
}
