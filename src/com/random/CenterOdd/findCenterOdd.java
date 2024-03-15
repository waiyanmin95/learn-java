package random.CenterOdd;

public class findCenterOdd {
    public static int isCenterOdd(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }
        int midIndex = a.length/2;
        int midValue = a[midIndex];
        System.out.println("Mid: "+midValue);
        for (int i = 0; i < a.length; i++) {
            if ( i != midIndex && midValue >= a[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {3, 2, 1, 4, 5};
        System.out.println(isCenterOdd(test1));
        System.out.println(isCenterOdd(test2));
    }
}
