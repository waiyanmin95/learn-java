package compro.Q35RailroadTie;

public class RailRoadTie {
    public static int isRailroadTie(int[] a) {
        if (a.length == 0 || a[0] == 0 || a[a.length - 1] == 0) {
            return 0;
        }
        int zeroIndex = 0;
        int zeroCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroCount++;
                zeroIndex = i;
                if (a[zeroIndex + 1] == 0 || a[zeroIndex - 1] == 0) {
                    return 0;
                }
            }
        }
        if (zeroCount == 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{3, 3, 0, 3, 4, 0, 2, 2}; // true
        int[] test2 = new int[]{0, 3, 0, 3, 4, 0, 2, 0}; // false
        int[] test3 = new int[]{1, 3, 0, 3, 0, 0, 2, 0}; // false
        int[] test4 = new int[]{1, 3, 0, 1, 1, 0, 1, 1, 0, 2, 2}; // true
        int[] one = new int[]{3}; // false
        int[] naked = new int[]{}; // false
        int[] allsame = new int[]{1, 1, 1, 1, 1}; // false
        int[] alldiff = new int[]{1, 2, 3, 4, 5}; // false
        int[] allzero = new int[]{0, 0, 0, 0, 0}; // false
        System.out.println(isRailroadTie(test1));
        System.out.println(isRailroadTie(test2));
        System.out.println(isRailroadTie(test3));
        System.out.println(isRailroadTie(test4));
        System.out.println(isRailroadTie(one));
        System.out.println(isRailroadTie(naked));
        System.out.println(isRailroadTie(allsame));
        System.out.println(isRailroadTie(alldiff));
        System.out.println(isRailroadTie(allzero));
    }

}
